//package com.fbistech.TestCases;
//
//import org.testng.annotations.Test;
//
//import com.fbistech.AirtimeVending.RetailerVendAirtimeToCustomer;
//import com.fbistech.AirtimeVending.RetailerVendAirtimeToDealer_NotUpline;
//import com.fbistech.AirtimeVending.RetailerVendAirtimeToDealer_Upline;
//import com.fbistech.AirtimeVending.RetailerVendAirtimeToRetailer;
//import com.fbistech.AirtimeVending.RetailerVendAirtimeToSubDealer_NotUpline;
//import com.fbistech.AirtimeVending.RetailerVendAirtimeToSubDealer_Upline;
//import com.fbistech.Utility.LaunchMobileUtility;
//
//import io.appium.java_client.android.AndroidDriver;
//
//public class AirtimeVendingRetailer_TestCase {
//	 
//	
//AndroidDriver driver = LaunchMobileUtility.getAndroidDriver();
//
//	
//	
//	 
//	
//	@Test(priority = 1)
//	public void verifyRetailerCanVendAirtimeToCustomer() throws Exception
//	{
//		RetailerVendAirtimeToCustomer retailerVendAirtimeToCustomer = new RetailerVendAirtimeToCustomer(driver);
//		retailerVendAirtimeToCustomer.retailerVendAirtime_Customer();
//		Thread.sleep(19000);
//	}
//	 
//	
////	@Test(priority = 2)
//	public void verifyRetailerCanVendAirtimeToDealer_NotUpline() throws Exception
//	{
//		RetailerVendAirtimeToDealer_NotUpline retailerVendAirtimeToDealer_NotUpline = new RetailerVendAirtimeToDealer_NotUpline(driver);
//		retailerVendAirtimeToDealer_NotUpline.retailerVendAirtime_DealerNotUpline();
//		Thread.sleep(19000);
//
//	}
//	
////	@Test(priority = 3)
//	public void verifyRetailerCanVendAirtimeToDealer_Upline() throws Exception
//	{
//		RetailerVendAirtimeToDealer_Upline retailerVendAirtimeToDealer_Upline = new RetailerVendAirtimeToDealer_Upline(driver);
//		retailerVendAirtimeToDealer_Upline.retailerVendAirtime_DealerUpline();
//		Thread.sleep(19000);
//
//	}
//	
////	@Test(priority = 4)
//	public void verifyRetailerCanVendAirtimeToRetailer() throws Exception
//	{
//		RetailerVendAirtimeToRetailer retailerVendAirtimeToRetailer = new RetailerVendAirtimeToRetailer(driver);
//		retailerVendAirtimeToRetailer.retailerVendAirtime_Retailer();
//		Thread.sleep(19000);
//
//	}
//	
//	
////	@Test(priority = 5)
//	public void verifyRetailerCanVendAirtime_SubDealerNotUpline() throws Exception
//	{
//		RetailerVendAirtimeToSubDealer_NotUpline retailerVendAirtimeToSubDealer_NotUpline = new RetailerVendAirtimeToSubDealer_NotUpline(driver);
//		retailerVendAirtimeToSubDealer_NotUpline.retailerVendAirtime_SubdealerNotUpline();
//		Thread.sleep(19000);
//
//	}
//	
//	
////	@Test(priority = 6)
//	public void verifyRetailerCanVendAirtime_SubDealerUpline() throws Exception
//	{
//		RetailerVendAirtimeToSubDealer_Upline retailerVendAirtimeToSubDealer_Upline = new RetailerVendAirtimeToSubDealer_Upline(driver);
//		retailerVendAirtimeToSubDealer_Upline.retailerVendAirtime_SubdealerUpline();
//		Thread.sleep(19000);
//
//	}
//	
//	
//	
//	
//	
//
//}
