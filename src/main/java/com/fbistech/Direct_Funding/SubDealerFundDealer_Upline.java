package com.fbistech.Direct_Funding;

import com.fbistech.BasePage.BasePage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SubDealerFundDealer_Upline extends BasePage {

	
	public SubDealerFundDealer_Upline(AndroidDriver driver)
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
	
	
	

	
//	public void dealerToFundSubdealerDownline(String subDealerToRetailerDownline) throws Exception
	public void subdealerToFundDealer_Upline() throws Exception
	
	{
//		textField.sendKeys(subDealerToRetailerDownline);
		textField.sendKeys("*878*878*33*00*1#");
		call_Btn.click();
		Thread.sleep(4000);
		pinInPutField.sendKeys("3262");
		sendPIN_Btn.click();
		Thread.sleep(7000);
		balanceOK_Btn.click();
//		Thread.sleep(10000);
//		smsOK_Btn.click();
		
		
		
	}
}
