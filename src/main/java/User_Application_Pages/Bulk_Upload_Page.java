package User_Application_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Bulk_Upload_Page extends Driver_Page{

	private final static By bybulk=By.xpath("//span[text()='Bulk Upload']");
	private final static By bydownloadadd=By.xpath("(//span[contains(text(),'Download')])[1]");



	public static WebElement ClickOnBulk()
	{
		return driver.findElement(bybulk);
	}
	public static WebElement ClickOnDownload()
	{
		return driver.findElement(bydownloadadd);
	}



	public static void ClickOnBulkUploads()
	{
		ClickOnBulk().click();
	}
	public static void ClickOnDownloadOfaddition()
	{
		ClickOnDownload().click();
	}
}
