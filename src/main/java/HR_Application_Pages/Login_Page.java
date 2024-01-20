package HR_Application_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.paulhammant.ngwebdriver.ByAngular;

public class Login_Page extends Driver_Page{
	private final static By bymailid=By.xpath("//input[contains(@placeholder,'Email')]");
    private final static By bypassword=By.xpath("//input[contains(@placeholder,'Password')]");
	private final static By bysigninbutton=ByAngular.buttonText("Sign in");
	
	

	
	public static WebElement Entermailid()
	{ 
		return driver.findElement(bymailid);
	}
	
	public static WebElement Enterpassword()
	{ 
		return driver.findElement(bypassword);
	}
	public static WebElement Clickonsignin()
	{
		return driver.findElement(bysigninbutton);
	}
	
	   

	public static void EnterUserName()
	{
		Entermailid().click();
		Entermailid().sendKeys("sekhar.irgp@gmail.com");
	}

	public static void EnterPassword()
	{
		Enterpassword().click();
		Enterpassword().sendKeys("123456aA");
	}
	public static void ClickOnSignin()
	{
		 Clickonsignin().click();
	}
	public static void login() 
	{
		EnterUserName();
		EnterPassword();
		ClickOnSignin();
		
}
}

