package com.fbistech.AirtimeVending;

import com.fbistech.BasePage.BasePage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SubDealerVendAirtimeToCustomer extends BasePage {
	
	public SubDealerVendAirtimeToCustomer(AndroidDriver driver)
	{
		super(driver);
	}
	
	
		
	@AndroidFindBy(xpath = "//*[@class='android.widget.EditText']")
	private AndroidElement textField;	
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Call\"]")
	private AndroidElement call_Btn;
	
	
	@AndroidFindBy(xpath = "//*[@class='android.widget.EditText']")
	private AndroidElement pinInPutField;
	
	
	@AndroidFindBy(xpath = "//*[@text='SEND']")
	private AndroidElement sendPIN_Btn;
	
	@AndroidFindBy(xpath = "//*[@text='OK']")
	private AndroidElement balanceOK_Btn;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Close\"]")
	private AndroidElement smsCancel_Btn;
	

	
	@AndroidFindBy(xpath = "//*[@class='android.widget.TextView']")
//	@AndroidFindBy(xpath = "//*[@resource-id='android:id/message']")
	private AndroidElement vendAirtimeSuccess_PopUp;
	
	public void subdealerVendAirtime_Customer() throws Exception

	{ 
//		Dial Short code 
		textField.sendKeys("*878*878*09135212172*1#");
		call_Btn.click();
		Thread.sleep(4000);
		
//		Enter PIN 
		pinInPutField.sendKeys("1234");
		sendPIN_Btn.click();
		Thread.sleep(4000);
		balanceOK_Btn.click();  
//		Thread.sleep(10000);
//		smsCancel_Btn.click();
	} 
	
	public String validateVendAirtimeRequestSentPopUp()
	{
		return vendAirtimeSuccess_PopUp.getText();
	}
	
	
}
