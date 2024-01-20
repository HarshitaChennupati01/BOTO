package HR_Application_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Logout_Page extends Driver_Page{
 
	private final static By bylogout=By.xpath("//span[text()='Logout']");
	
	public static WebElement ClickOnLogout()
	{
		return driver.findElement(bylogout);
	}
	
	public static void ClickOnLogoutButton()
	{
		ClickOnLogout().click();
	}
}

