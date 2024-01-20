package HR_Application_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.ByAngularButtonText;

public class ForgetPassword_Page extends Driver_Page{
	private final static By byforgetpassword=ByAngularButtonText.xpath("//small[text()=' Forgot password? ']");
	private final static By byemailORmobile=By.xpath("//input[contains(@placeholder,'Email/Mobile')]");
	//private final static By bysubmit=ByAngular.buttonText("Submit");
	private final static By bycancel=ByAngular.buttonText("Cancel");
	//private final static By bycancel=ByAngularButtonText.xpath("//button[text()=' Cancel ']");


	public static WebElement Clickonforgetpassword()
	{
		return driver.findElement(byforgetpassword);
	}
	public static WebElement ClickonEmail()
	{
		return driver.findElement(byemailORmobile);
	}
	//	public static WebElement ClickOnSubmit()
	//	{
	//		return driver.findElement(bysubmit);
	//	}
	public static WebElement ClickOnCancel()
	{
		return driver.findElement(bycancel);
	}

	public static void ClickOnForgetPasswordLink()
	{
		Clickonforgetpassword().click();
	}
	public static void EnterEmailORMobile()
	{
		ClickonEmail().click();
		ClickonEmail().sendKeys("sekhar.irgp@gmail.com");
	}
//	public static void ClickOnSubmitButton()
//	{
//		ClickOnSubmit().click();
//	}
	public static void ClickOnCancelButton()
	{
		ClickOnCancel().click();
	}
}
