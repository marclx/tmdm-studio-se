// ============================================================================
//
// Copyright (C) 2006-2013 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.mdm.repository.core.validate.datamodel.validator.visitor;

import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.talend.mdm.repository.extension.RepositoryNodeConfigurationManager;
import org.talend.mdm.repository.validate.plugin.ValidatePlugin;

/**
 * created by HHB on 2013-1-14 Detailled comment
 * 
 */
public class ValidateVistorRegistry {

    private static Logger log = Logger.getLogger(RepositoryNodeConfigurationManager.class);

    private ValidateVistorRegistry() {
    }

    private static ValidateVistorRegistry instance = new ValidateVistorRegistry();

    /**
     * Getter for instance.
     * 
     * @return the instance
     */
    public static ValidateVistorRegistry getInstance() {
        return instance;
    }

    private static final String EXTENSION_POINT_TEMPLATE = "DataModelValidateVisitor"; //$NON-NLS-1$

    private static final String PROP_CLASS = "class"; //$NON-NLS-1$

    private boolean inited = false;

    private static List<IComponentValidateVisitor> visitors = new LinkedList<IComponentValidateVisitor>();

    public List<IComponentValidateVisitor> getVisitors() {
        if (!inited) {
            initVisitors();
        }

        return visitors;
    }

    private void initVisitors() {
        if (!inited) {
            IExtensionRegistry registry = Platform.getExtensionRegistry();

            //
            IExtensionPoint extensionPoint = registry.getExtensionPoint(ValidatePlugin.PLUGIN_ID, EXTENSION_POINT_TEMPLATE);
            if (extensionPoint != null && extensionPoint.isValid()) {
                IExtension[] extensions = extensionPoint.getExtensions();
                for (IExtension s : extensions) {
                    IConfigurationElement[] elements = s.getConfigurationElements();
                    for (IConfigurationElement element : elements) {
                        if (element.getAttribute(PROP_CLASS) != null) {
                            try {
                                IComponentValidateVisitor visitor = (IComponentValidateVisitor) element
                                        .createExecutableExtension(PROP_CLASS);
                                visitors.add(visitor);

                            } catch (CoreException e) {
                                log.error(e.getMessage(), e);
                            }
                        }
                    }
                }
            }
            inited = true;
        }
    }

}