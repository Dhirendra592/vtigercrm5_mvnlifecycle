package org.eva.vtigercrm5.inventorytestscripts;

import org.eva.vtigercrm5.core.BaseTest;
import org.eva.vtigercrm5.pages.inventory.invoice.InventoryInvoiceNewCreateInvoice;
import org.testng.annotations.Test;

public class InventryInvoiceTestScripts extends BaseTest {
 
 
	@Test(groups = {"Smoke"})
	public void verifyVT0010AccountAndContactAddOnInvoiceForm() {
		webUtil.printMessage("====  verifyVT0012AccountAndContactAddOnInvoiceForm starts from here====");
		commnCode.goToInventoryInvoiceLink();
		commnCode.creatNewPluseButton();
		InventoryInvoiceNewCreateInvoice creatInvoice= new InventoryInvoiceNewCreateInvoice(webUtil);
		creatInvoice.fillUpInvoiceInformation("Test Account Name And Contact Name Addition");
		webUtil.printMessage("====  verifyVT0012AccountAndContactAddOnInvoiceForm ends from here====");
	}
	
	 
}
