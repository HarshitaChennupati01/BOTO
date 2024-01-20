package Employee_Application_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.ByAngularButtonText;

public class MyProfile_Page extends Driver_Page{
	private final static By byprofile =By.cssSelector("span[class='avatar avatar-sm rounded-circle']");
    private final static By bymyprofile=By.xpath("//span[text()='My profile']");
   // private final static By bychangepassword=ByAngularButtonText.xpath("//button[contains(@type,'button')]");//By.xpath("//button[contains(@type,'button')]");
	private final static By bychangepassword=By.xpath("//button[text()='Change Password']");//By.cssSelector("button[class='btn btn-primary']");
    private final static By byoldpassword=By.xpath("//input[contains(@placeholder,'Old Password')]");
	private final static By bynewpassword=By.xpath("//input[contains(@placeholder,'New Password')]");
	private final static By bysubmiticon=ByAngularButtonText.xpath("//button[@class='btn btn-custom-bg']");
	
	
	
	public static WebElement ClickProfile()
	{
		return driver.findElement(byprofile);	
	}
	public static WebElement ClickOnmyprofiletext()
	{
		return driver.findElement(bymyprofile);
	}
	public static WebElement ClickOnButton()
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
	
	
	
	public static void ClickOnProfile()
	{
		ClickProfile().click();
	}
	public static void ClickOnMyprofile()
	{
		ClickOnmyprofiletext().click();
	}
	public static void ClickOnChangePassword() throws InterruptedException
	{
		Thread.sleep(5000);
		ClickOnButton().click();
	}
	public static void EnterOldPassword() throws InterruptedException
	{
		Thread.sleep(5000);
		ClickOnOldpassword().click();
		ClickOnOldpassword().sendKeys("123456aA");
	}
	public static void EnterNewPassword() throws InterruptedException
	{
		Thread.sleep(5000);
		ClickOnNewpassword().click();
		ClickOnNewpassword().sendKeys("123456aA");
	}
	public static void ClickOnSubmitButton() throws InterruptedException
	{
		Thread.sleep(5000);
		ClickOnSubmit().click();
	}
	
}
