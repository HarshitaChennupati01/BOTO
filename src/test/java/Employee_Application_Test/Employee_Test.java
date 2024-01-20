package Employee_Application_Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Employee_Application_Pages.*;

public class Employee_Test {

	@BeforeTest
	public static void Driver() throws InterruptedException
	{
		Driver_Page.Driver();
		Login_Page.login();
		CustomEx_Page.loader(180);
	}
	
	@Test(priority=05)
	public static void MyProfile() throws InterruptedException
	{
		MyProfile_Page.ClickOnProfile();
		CustomEx_Page.loader(120);
		MyProfile_Page.ClickOnMyprofile();
		CustomEx_Page.loader(120);
		MyProfile_Page.ClickOnChangePassword();
		Driver_Page.Scroldown();
		MyProfile_Page.EnterOldPassword();
		MyProfile_Page.EnterNewPassword();
		MyProfile_Page.ClickOnSubmitButton();
		CustomEx_Page.loader(120);
	}
	
	@Test(priority=04)
	public static void Home() throws InterruptedException
	{
		Home_Page.ClickOnDashboard();
		CustomEx_Page.loader(180);
		Home_Page.ClickOnCard();
		CustomEx_Page.loader(180);
		
	}
	
	@Test(priority=03)
	public static void Coverages() throws InterruptedException
	{
		Home_Page.ClickOnDashboard();
		CustomEx_Page.loader(180);
		Home_Page.ClickOnCard();
		CustomEx_Page.loader(180);
		Coverages_Page.ClickonDownloadButton();
		CustomEx_Page.loader(120);
		Driver_Page.Scroldown();
		Coverages_Page.ClickonDownloadEcard1();
		CustomEx_Page.loader(120);
		Coverages_Page.ClickOnGroupLifeButton();
		Coverages_Page.ClickOnGroupAccidentButton();
		Coverages_Page.ClickOnIndividualPlanButton();
		Home_Page.ClickOnDashboard();
		CustomEx_Page.loader(120);
	}
	
	@Test(priority=02)
	public static void ReportClaims() throws InterruptedException 
	{
		//QuickAccess_Page.ClickOnMenuIcon();
		CustomEx_Page.loader(180);
		QuickAccess_Page.ClickOnReportClaimButton();
		CustomEx_Page.loader(180);
		QuickAccess_Page.ClickOnReimbursementRadioButton();
		QuickAccess_Page.ClickOnSlectionOfMemebr();
		Driver_Page.Scroldown();
		QuickAccess_Page.SlectionOfLocation();
		QuickAccess_Page.SlectionOfHospital();
		QuickAccess_Page.SelectDOA();
		QuickAccess_Page.ClickOnCOA();
		QuickAccess_Page.ClickOnEstimatedAmount();
		QuickAccess_Page.CLickOnSaveButton();
		CustomEx_Page.loader(120);
	}
	
	//@Test(priority=06)
	public static void Claims() throws InterruptedException
	{
		Home_Page.ClickOnDashboard();
		CustomEx_Page.loader(180);
		Claims_Page.ClickOnMyClaimsIcon();
		CustomEx_Page.loader(180);
		Claims_Page.CLickOnMyClaims();
		CustomEx_Page.loader(120);
		Driver_Page.Scroldown();
		Claims_Page.ClickonPrint();
		System.out.println("print button");
		//Claims_Page.PrintButtonUsingEnter();
		CustomEx_Page.loader(120);
		System.out.println("actions class");
		Claims_Page.CLickOnMyClaims();
		CustomEx_Page.loader(120);
		Claims_Page.CLickonPenIcon();
		CustomEx_Page.loader(120);
		Claims_Page.ClickonSave();
		CustomEx_Page.loader(120);
	}
	
	@Test(priority=01)
	public static void ClaimsFormDownload() throws InterruptedException
	{
		ClaimsFormsDownload_Pages.ClickOnClaimsFormButton();
		CustomEx_Page.loader(120);
		ClaimsFormsDownload_Pages.ClickOnClaimsProcedureButton();
		CustomEx_Page.loader(120);
	}
	
	@AfterTest
	public static void Logout() throws InterruptedException
	{
		MyProfile_Page.ClickOnProfile();
		CustomEx_Page.loader(120);
		Logout_Page.ClickOnLogoutButton();
	}
}