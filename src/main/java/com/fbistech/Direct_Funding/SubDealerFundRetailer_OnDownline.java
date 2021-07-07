package com.fbistech.Direct_Funding;

import org.openqa.selenium.support.PageFactory;

import com.fbistech.BasePage.BasePage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SubDealerFundRetailer_OnDownline extends BasePage {

//	Initialize the Page Objects
	public SubDealerFundRetailer_OnDownline(AndroidDriver driver)
	{
		super(driver); // super key word is used whenever the parent class "extends BasePage" constructor is called
						
		PageFactory.initElements(new AppiumFieldDecorator(driver), this); //error:- Keys to send should be a not null CharSequence
	} 
	
	
	
	
//	@AndroidFindBy(xpath = "//*[@resource-id='com.android.contacts:id/digits']")
	
	@AndroidFindBy(xpath = "//*[@class='android.widget.EditText']")
	private AndroidElement textField;	
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Call\"]")
	private AndroidElement call_Btn;
	
	
//	@AndroidFindBy(xpath = "//*[@resource-id='com.android.phone:id/input_field']")
	@AndroidFindBy(xpath = "//*[@class='android.widget.EditText']")
	private AndroidElement pinInPutField;
	
	
	@AndroidFindBy(xpath = "//*[@text='SEND']")
	private AndroidElement sendPIN_Btn;
	
	 
	@AndroidFindBy(xpath = "//*[@text='OK']")
	private AndroidElement balanceOK_Btn;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Close\"]")
	private AndroidElement smsCancel_Btn;
	
	

	
//	Abstraction method
	public void subdealerToFundRetailer_OnDownline(String subDealerFundRetailer_OnDownline, String subDealer_PIN) throws Exception
//	public void subdealerToFundRetailer_OnDownline() throws Exception
	 
	{ 
		textField.sendKeys(subDealerFundRetailer_OnDownline);
//		textField.sendKeys("*878*878*33*005394*1#");
		call_Btn.click();
		Thread.sleep(5000);
		
//		Enter PIN 
		
		pinInPutField.sendKeys(subDealer_PIN);
//		pinInPutField.sendKeys("1234");
		Thread.sleep(3000);
		sendPIN_Btn.click();
		
//		Click on balance Ok 
		Thread.sleep(3000);
		balanceOK_Btn.click();
		
//		Thread.sleep(10000);
//		smsOK_Btn.click();
		
		
		
	}




	

}
