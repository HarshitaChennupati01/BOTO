package HR_Application_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Enrolment_Page extends Driver_Page{

	private final static By byenrolment=By.xpath("(//span[text()='Enrolment'])[2]");
	private final static By bydeletions=By.xpath("//label[text()=' deletions ']");
	
	public static WebElement ClickonEnrolment()
	{
		return driver.findElement(byenrolment);
	}
	public static WebElement CLickonDeletion()
	{
		return driver.findElement(bydeletions);
	}
	
	public static void ClickOnEnrolment()
	{
		ClickonEnrolment().click();
	}
	public static void ClickOnDeletion()
	{
		CLickonDeletion().click();
	}
}
