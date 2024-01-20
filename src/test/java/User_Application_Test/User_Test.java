package User_Application_Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import User_Application_Pages.*;

public class User_Test {

	@BeforeTest
	public static void Login() throws InterruptedException
	{
		Driver_Page.Driver();
		Login_Page.login();
		CustomEx_Page.loader(180);
	}
	
	@Test(priority=01)
	public static void Clients() throws InterruptedException
	{
		CustomEx_Page.loader(180);
		Home_Page.ClickOnAction();
		CustomEx_Page.loader(180);
	}
	@Test(priority=02)
	public static void Home() throws InterruptedException
	{
		Home_Page.ClickOnGMCpolicy();
		CustomEx_Page.loader(180);
		Home_Page.ClickOnGMCCard();
		CustomEx_Page.loader(180);
		Menu_Page.CLickonDashBoard();
		CustomEx_Page.loader(180);
		try 
		{
			Home_Page.ClickOnGMCpolicy();
		}
		catch(Exception e) 
		{
			Menu_Page.ClickonDashboardBOTO();
			CustomEx_Page.loader(180);
			Home_Page.ClickOnAction();
			CustomEx_Page.loader(180);
		}
		Home_Page.ClickOnGMCpolicy();
		CustomEx_Page.loader(180);
		Home_Page.ClickonMembersCard();
		CustomEx_Page.loader(180);
		Menu_Page.CLickonDashBoard();
		CustomEx_Page.loader(180);
		Home_Page.ClickOnGMCpolicy();
		CustomEx_Page.loader(180);
		Home_Page.ClickOnClaimsCard();
		CustomEx_Page.loader(180);
		Menu_Page.CLickonDashBoard();
		CustomEx_Page.loader(180);
		try 
		{
			Home_Page.ClickOnGMCpolicy();
		}
		catch(Exception e) 
		{
			Menu_Page.ClickonDashboardBOTO();
			CustomEx_Page.loader(180);
			Home_Page.ClickOnAction();
			CustomEx_Page.loader(180);
		}
		Home_Page.ClickOnGMCpolicy();
		CustomEx_Page.loader(240);
		Home_Page.ClickOnPremium();
		CustomEx_Page.loader(240);
		Menu_Page.CLickonDashBoard();
		CustomEx_Page.loader(240);
		Manage_Page.ClickOnManageText();
		CustomEx_Page.loader(240);
//		Menu_Page.CLickonDashBoard();
//		CustomEx_Page.loader(240);
//		Add_Employee_Page.ClickOnAddText();
//		CustomEx_Page.loader(240);
//		Menu_Page.CLickonDashBoard();
//		CustomEx_Page.loader(240);
//		Bulk_Upload_Page.ClickOnBulkUploads();
//		CustomEx_Page.loader(240);
//		Menu_Page.CLickonDashBoard();
//		CustomEx_Page.loader(240);
//		Enrolment_Page.ClickOnEnrolment();
//		CustomEx_Page.loader(240);
		Menu_Page.ClickonDashboardBOTO();
		CustomEx_Page.loader(240);
	}
	
	@Test(priority=03)
	public static void Premium() throws InterruptedException
	{
		CustomEx_Page.loader(240);
		UserHome_Page.ClickOnPremium();
		CustomEx_Page.loader(240);
		UserHome_Page.ClickOnPremiumview();
		CustomEx_Page.loader(240);
		Menu_Page.ClickonDashboardBOTO();
		CustomEx_Page.loader(240);
	}
	
	@Test(priority=04)
	public static void Claims() throws InterruptedException
	{
		UserHome_Page.ClickOnClaims();
		CustomEx_Page.loader(240);
		UserHome_Page.ClickOnClaimsview();
		CustomEx_Page.loader(240);
		Menu_Page.ClickonDashboardBOTO();
		CustomEx_Page.loader(240);
	}
	
	@Test(priority=05)
	public static void Endorsement() throws InterruptedException
	{
		UserHome_Page.ClickOnEndorsement();
		CustomEx_Page.loader(240);
		UserHome_Page.ClickOnEndorsementview();
		CustomEx_Page.loader(240);
		Menu_Page.ClickonDashboardBOTO();
		CustomEx_Page.loader(240);
	}
	
	@Test(priority=06)
	public static void Upload() throws InterruptedException
	{
		Menu_Page.ClickonUpload();
		CustomEx_Page.loader(240);
	}
	
}
