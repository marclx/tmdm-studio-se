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
package org.talend.mdm.repository.core.validate.datamodel.model.impl;

import org.talend.mdm.repository.core.validate.datamodel.model.IMComponent;
import org.w3c.dom.Element;

/**
 * created by HHB on 2013-1-29 Detailled comment
 * 
 */
public interface IMComponentWritable extends IMComponent {

    /**
     * Sets the name.
     * 
     * @param name the name to set
     */
    public abstract void setName(String name);

    public abstract void setW3CElement(Element element);
}