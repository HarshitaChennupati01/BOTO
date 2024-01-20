package Employee_Application_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ClaimsFormsDownload_Pages extends Driver_Page{
	private final static By byclaimform=By.xpath("//button[text()=' Claim form']");
	private final static By byclaimprocedure=By.xpath("//button[text()=' Claim procedure ']");
	
	
	
	public static WebElement ClickOnClaimsForm()
	{
		return driver.findElement(byclaimform);
	}
	public static WebElement ClickOnClaimsProcedure()
	{
		return driver.findElement(byclaimprocedure);
	}
	
	
	
	public static void ClickOnClaimsFormButton()
	{
		ClickOnClaimsForm().click();
	}
	public static void ClickOnClaimsProcedureButton()
	{
		ClickOnClaimsProcedure().click();
	}

}
