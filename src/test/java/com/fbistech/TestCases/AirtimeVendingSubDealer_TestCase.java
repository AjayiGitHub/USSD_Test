//package com.fbistech.TestCases;
//
//import org.testng.annotations.Test;
//
//import com.fbistech.AirtimeVending.SubDealerVendAirtimeToCustomer;
//import com.fbistech.AirtimeVending.SubDealerVendAirtimeToDealer_Upline;
//import com.fbistech.AirtimeVending.SubDealerVendAirtimeToRetailer_NotDownline;
//import com.fbistech.AirtimeVending.SubDealerVendAirtimeToSubDealer_SameUpline;
//import com.fbistech.AirtimeVending.SubdealerVendAirtimeToRetailer_Downline;
//import com.fbistech.Utility.LaunchMobileUtility;
//
//import io.appium.java_client.android.AndroidDriver;
//
//public class AirtimeVendingSubDealer_TestCase {
//
//	 
//	AndroidDriver driver = LaunchMobileUtility.getAndroidDriver();
//
//	
//	
//
////	@Test(priority = 1)
//	public void verifySubDealerCanVendAirtimeToCustomer() throws Exception
//	{
//		SubDealerVendAirtimeToCustomer subDealerVendAirtimeToCustomer = new SubDealerVendAirtimeToCustomer(driver);
//		subDealerVendAirtimeToCustomer.subdealerVendAirtime_Customer();
//		Thread.sleep(4000);
//
//		String vendAirtimeSuccess_PopUp = subDealerVendAirtimeToCustomer.validateVendAirtimeRequestSentPopUp();
//		System.out.println(vendAirtimeSuccess_PopUp); 
//
//		Thread.sleep(18000);
//	}  
//	 
//	
////	@Test(priority = 2)
//	public void verifySubDealerCanVendAirtimeToDealerNotUpline() throws Exception
//	{
//		SubDealerVendAirtimeToDealer_Upline subDealerVendAirtimeToDealer_Upline = new SubDealerVendAirtimeToDealer_Upline(driver);
//		subDealerVendAirtimeToDealer_Upline.subdealerVendAirtime_DealerUpline();
//		Thread.sleep(18000);
//
//	}
//	
////	@Test(priority = 3)
//	public void verifySubDealerCanVendAirtimeToDealerUpline() throws Exception
//	{
//		SubDealerVendAirtimeToDealer_Upline subDealerVendAirtimeToDealer_Upline = new SubDealerVendAirtimeToDealer_Upline(driver);
//		subDealerVendAirtimeToDealer_Upline.subdealerVendAirtime_DealerUpline();
//		Thread.sleep(18000);
//
//	}
//	
//	
//		
//	@Test(priority = 4)
//	public void verifySubDealerCanVendAirtimeTo_RetailerOnDownline() throws Exception
//	{
//		SubdealerVendAirtimeToRetailer_Downline subdealerVendAirtimeToRetailer_Downline = new SubdealerVendAirtimeToRetailer_Downline(driver);
//		subdealerVendAirtimeToRetailer_Downline.subdealerVendAirtime_RetailerOnDownline();
//		Thread.sleep(18000);
//
//	}
//	
//	
////	@Test(priority = 5)
//	public void verifySubDealerCanVendAirtimeTo_RetailerNotDownline() throws Exception
//	{
//		SubDealerVendAirtimeToRetailer_NotDownline subDealerVendAirtimeToRetailer_NotDownline = new SubDealerVendAirtimeToRetailer_NotDownline(driver);
//		subDealerVendAirtimeToRetailer_NotDownline.subdealerVendAirtime_RetailerNotOnDownline();
//		Thread.sleep(18000);
//
//	}
//	
//	
////	@Test(priority = 5)
//	public void verifySubDealerCanVendAirtimeToSubDealer_SameUpline() throws Exception
//	{
//		SubDealerVendAirtimeToSubDealer_SameUpline subDealerVendAirtimeToSubDealer_SameUpline = new SubDealerVendAirtimeToSubDealer_SameUpline(driver);
//		subDealerVendAirtimeToSubDealer_SameUpline.subdealerVendAirtime_Subdealer();
//		Thread.sleep(18000);
//
//	}
//
//	
//	
//	
//	
//}
