// ============================================================================
//
// Copyright (C) 2006-2011 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.mdm.repository.ui.widgets;

import org.eclipse.swt.widgets.Composite;
import org.talend.mdm.repository.ui.dialogs.xpath.XpathSelectDialog2;

import com.amalto.workbench.dialogs.XpathSelectDialog;
import com.amalto.workbench.views.ServerView;
import com.amalto.workbench.widgets.SchematronExpressBuilder;


/**
 * DOC achen  class global comment. Detailled comment
 */
public class SchematronExpressBuilderR extends SchematronExpressBuilder {

    /**
     * DOC achen SchematronExpressBuilderR constructor comment.
     * 
     * @param parent
     * @param value
     * @param conceptName
     */
    public SchematronExpressBuilderR(Composite parent, String value, String conceptName) {
        super(parent, value, conceptName);
        // TODO Auto-generated constructor stub
    }

    /**
     * DOC achen SchematronExpressBuilderR constructor comment.
     * 
     * @param parent
     * @param value
     * @param conceptName
     */
    public SchematronExpressBuilderR(Composite parent, String value, String conceptName, boolean isAbsoluteXPath,
            boolean isSchematron) {
        super(parent, value, conceptName, isAbsoluteXPath, isSchematron);
        // TODO Auto-generated constructor stub
    }
    /*
     * (non-Javadoc)
     * 
     * @see com.amalto.workbench.widgets.SchematronExpressBuilder#getXPathSelectDialog()
     */
    @Override
    protected XpathSelectDialog getXPathSelectDialog() {
        return new XpathSelectDialog2(parent.getShell(), "Select Xpath ...", ServerView.show().getSite(), false, null,
                isAbsoluteXPath);
    }
}