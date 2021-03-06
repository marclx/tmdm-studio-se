// ============================================================================
//
// Copyright (C) 2006-2015 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package com.amalto.workbench.widgets.xmleditor.infoholder;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.amalto.workbench.editors.TransformerMainPage;
import com.amalto.workbench.webservices.WsTransformerProcessStep;
import com.amalto.workbench.webservices.WsTransformerV2;
import com.amalto.workbench.webservices.WsTransformerVariablesMapping;

public class ProcessAllCallJobVariableCandidatesHolder extends AllCallJobVariableCandidatesHolder {

    private WsTransformerV2 service;

    public ProcessAllCallJobVariableCandidatesHolder(WsTransformerV2 service) {
        this.service = service;
    }

    @Override
    public String[] getExternalInfo() {

        if (service == null) {
            return new String[0];
        }

        Set<String> inputVariables = new HashSet<String>();
        for (WsTransformerProcessStep step : service.getProcessSteps()) {
            for (WsTransformerVariablesMapping mapping : step.getInputMappings()) {
                inputVariables.add(mapping.getPipelineVariable() == null ? TransformerMainPage.DEFAULT_VAR : mapping
                        .getPipelineVariable());
            }
        }

        String[] results = inputVariables.toArray(new String[0]);

        Arrays.sort(results);

        return results;
    }

}
