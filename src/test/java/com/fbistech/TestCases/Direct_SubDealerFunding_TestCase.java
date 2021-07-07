package com.fbistech.TestCases;

import org.testng.annotations.Test;

import com.fbistech.BasePage.BasePage;
import com.fbistech.Direct_Funding.SubDealerFundRetailer_OnDownline;

import io.appium.java_client.android.AndroidDriver;

//public class Direct_SubDealerFunding_TestCase {

	

public class Direct_SubDealerFunding_TestCase extends BasePage {
	
	
	public Direct_SubDealerFunding_TestCase(AndroidDriver driver)
	{
		super(driver); 
	}

	
//	AndroidDriver driver = LaunchMobileUtility.getAndroidDriver();

	

	

	
	@Test(priority = 1) 
	public void verifySubDealerCanFund_RetailerOnDownLine()throws Exception
	{
		SubDealerFundRetailer_OnDownline subDealerFundRetailer_OnDownline = new SubDealerFundRetailer_OnDownline(driver);
//		subDealerFundRetailer_OnDownline.subdealerToFundRetailer_OnDownline();

		subDealerFundRetailer_OnDownline.subdealerToFundRetailer_OnDownline(prop.getProperty("subDealerFundRetailer_OnDownline"), prop.getProperty("subDealer_PIN")); 
	}
	 
 
	
	
}
