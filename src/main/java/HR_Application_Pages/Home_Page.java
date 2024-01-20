package HR_Application_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.paulhammant.ngwebdriver.ByAngularButtonText;

public class Home_Page extends Driver_Page{
	private final static By byprofile =By.xpath("//a[@class='nav-link pr-0 dropdown-toggle']");
    private final static By bymyprofile=By.xpath("//span[text()='My profile']");
    private final static By bychangepassword=ByAngularButtonText.xpath("//button[@class='btn btn-primary']");
	private final static By byoldpassword=By.xpath("//input[contains(@placeholder,'Old Password')]");
	private final static By bynewpassword=By.xpath("//input[contains(@placeholder,'New Password')]");
	private final static By bysubmiticon=ByAngularButtonText.xpath("//button[@class='btn btn-custom-bg']");
    private final static By bymenuicon=By.xpath("(//div[@class='sidenav-toggler-inner'])[1]");
    private final static By bydashboard=By.xpath("//i[@class='fa-home fas ni purple1']");
    private final static By bymenu=By.xpath("//div[@class='sidenav-toggler-inner']");
    private final static By byGMCpolicy=By.xpath("//i[@class='fas fa-medkit icon-custom icon-custom-active']");
    
    
	public static WebElement ClickOnProfile() throws InterruptedException
	{
		return driver.findElement(byprofile);	
	}
	public static WebElement ClickOnmyprofiletext()
	{
		return driver.findElement(bymyprofile);
	}
	public static WebElement ClickButton()
	{
		return driver.findElement(bychangepassword);
	}
	public static WebElement ClickOnOldpassword()
	{
		return driver.findElement(byoldpassword);
	}
	public static WebElement ClickOnNewpassword()
	{
		return driver.findElement(bynewpassword);
	}
	public static WebElement ClickOnSubmit()
	{
		return driver.findElement(bysubmiticon);
	}
	public static WebElement ClickOnMenu()
	{
		return driver.findElement(bymenuicon);
	}
	public static WebElement ClickOnDashboardIcon()
	{
		return driver.findElement(bydashboard);
	}
	public static WebElement ClickOnmenu()
	{
		return driver.findElement(bymenu);
	}
	public static WebElement ClickOnGMC()
	{
		return driver.findElement(byGMCpolicy);
	}
	
	
	
	
	
	
	public static void ClickOnProfileIcon() throws InterruptedException
	{
		ClickOnProfile().click();
	}
	public static void ClickOnMyprofile() throws InterruptedException
	{
		try {
		ClickOnmyprofiletext().click();
		}
		catch(Exception e)
		{
			ClickOnProfile().click();
			ClickOnmyprofiletext().click();
			System.out.println("elemnt is not displaeyd as interrepted");
		}
	}
	public static void ClickOnChangePassword()
	{
		ClickButton().click();
	}
	public static void EnterOldPassword()
	{
		ClickOnOldpassword().click();
		ClickOnOldpassword().sendKeys("123456aA");
	}
	public static void EnterNewPassword()
	{
		ClickOnNewpassword().click();
		ClickOnNewpassword().sendKeys("123456aA");
	}
	public static void ClickOnSubmitButton()
	{
		ClickOnSubmit().click();
	}
	public static void ClickonMenuIcon()
	{
		ClickOnMenu().click();
	}
	public static void ClickOnDashboard()
	{
		ClickOnDashboardIcon().click();
	}
	public static void ClickOnMenuButton()
	{
		ClickOnmenu().click();
	}
	public static void ClickOnGMCPolicy()
	{
		ClickOnGMC().click();
		
//		try
//		{
//			ClickOnGMC().click();
//		}
//		catch(Exception e)
//		{
//			ClickonMenuIcon();
//			
//			ClickOnGMC().click();
//		}
	}
}