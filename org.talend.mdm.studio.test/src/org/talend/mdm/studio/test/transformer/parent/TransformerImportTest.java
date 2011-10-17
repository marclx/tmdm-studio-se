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
package org.talend.mdm.studio.test.transformer.parent;

import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.talend.mdm.studio.test.TalendSWTBotForMDM;

/**
 * DOC rhou class global comment. Detailled comment
 */
@RunWith(SWTBotJunit4ClassRunner.class)
public class TransformerImportTest extends TalendSWTBotForMDM {

	private SWTBotTreeItem jobParentItem;

	@Before
	public void runBeforeEveryTest() {
		jobParentItem = serverItem.getNode("Job Repository");
		jobParentItem.expand();

	}

	@After
	public void runAfterEveryTest() {

	}

	@Test
	public void importJobTest() {
		// jobParentItem.contextMenu("Import a TIS Job Archive").click();
		// TODO:SWTBot does not support the FileDialog,need further
		// investigation.
	}

}