package org.eva.vtigercrm5.pages.inventory.invoice;

import org.eva.vtigercrm5.pages.inventory.invoiceOr.InventoryInvoiceNewCreateInvoiceOr;
import org.eva.vtigercrm5.utils.WebUtil;

public  class InventoryInvoiceNewCreateInvoice  extends InventoryInvoiceNewCreateInvoiceOr{

	private WebUtil webtl;
	public InventoryInvoiceNewCreateInvoice(WebUtil webtl) {
		super(webtl);
		this.webtl=webtl;
	}
	//TB--TextBox
	//BT--Button
	//RB--Radio Button
	//LK--Link
	public  String fillUpInvoiceInformation(String expSubjectName) {
		webtl.sendKeys(getExpSubjectNameTB(),expSubjectName);
		webtl.sendKeys(getCustomerNumberTB(), ""+expSubjectName+".er@gmail.com");
		InventoryInvoiceNewCreateInvoiceCommonAdd commonAdd= new InventoryInvoiceNewCreateInvoiceCommonAdd(webtl);
		webtl.click(getSelectContactBT());
		commonAdd.addElementName("man", "firstname");
		webtl.sendKeys(getPurchaseOrderTB(), "Contact list");
		webtl.click(getAccountNameTB());
		webtl.thread(2000);
		commonAdd.addElementName("Dhirendra","accountname");
		webtl.clear(getBillingAddressTB());
		webtl.sendKeys(getBillingAddressTB(),"Sant Ravidas nagar bhadohi");
		webtl.clear(getBillPoBoxTB());
		webtl.sendKeys(getBillPoBoxTB(),"bhadohi");
		webtl.clear(getBillCityTB());
		webtl.sendKeys(getBillCityTB(), "kaushambi");
		webtl.clear(getBillStateTB());
		webtl.sendKeys(getBillStateTB(),"utter pradesh");
		webtl.clear(getBillCodeTB());
		webtl.sendKeys(getBillCodeTB(), "9856");
		webtl.clear(getBillCountryTB());
		webtl.sendKeys(getBillCountryTB(), "indian");
		webtl.click(getCopyBillingAddressRB());
		webtl.click(getProductLNK());
		return expSubjectName;
	}


}
