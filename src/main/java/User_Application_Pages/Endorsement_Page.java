package User_Application_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Endorsement_Page extends Driver_Page {

	private final static By byendorse=By.xpath("//button[@class='btn btn-sm btn-custom-bg mr-0']");
	private final static By bycheckbox=By.xpath("(//input[@id='bulkSelect'])[2]");
	private final static By bysubmit=By.xpath("//button[@class='btn btn-sm btn-custom-bg mr-0']");
	private final static By bycontinue=By.xpath("//button[@class='btn btn-custom-bg']");
	private final static By bycancle=By.xpath("//button[@class='btn btn-warning']");//login to employee details



	public static WebElement ClickOnEndorse()
	{
		return driver.findElement(byendorse);
	}
	public static WebElement ClickOnCheckBox()
	{
		return driver.findElement(bycheckbox);
	}
	public static WebElement ClickOnSubmit()
	{
		return driver.findElement(bysubmit);
	}
	public static WebElement ClickOnContinue()
	{
		return driver.findElement(bycontinue);
	}
	public static WebElement ClickOnCancle()
	{
		return driver.findElement(bycancle);
	}



	public static void ClickonEndorse()
	{
		ClickOnEndorse().click();
	}
	public static void ClickonCheckBox()
	{
		ClickOnCheckBox().click();
	}
	public static void ClickonSubmit()
	{
		ClickOnSubmit().click();
	}
	public static void ClickonContinue()
	{
		ClickOnContinue().click();
	}
	public static void ClickonCancle()
	{
		ClickOnCancle().click();
	}
}
