package HR_Application_Pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BulkUploads_Page extends Driver_Page{
	private final static By bybulk=By.xpath("//span[text()='Bulk Upload']");
	private final static By bydownloadadd=By.xpath("(//span[contains(text(),'Download')])[1]");
	private final static By byupload=By.xpath("(//span[text()='Upload'])[1]");
	private final static By byselectfile=By.xpath("//label[text()='Select file']");
	
	
	
	public static WebElement ClickOnBulk()
	{
		return driver.findElement(bybulk);
	}
	public static WebElement ClickOnDownload()
	{
		return driver.findElement(bydownloadadd);
	}
	public static WebElement ClickOnUpload()
	{
		return driver.findElement(byupload);
	}
	public static WebElement ClickOnBrowse()
	{
		return driver.findElement(byselectfile);
	}
	
	
	
	public static void ClickOnBulkUploads()
	{
		ClickOnBulk().click();
	}
	public static void ClickOnDownloadOfaddition()
	{
		ClickOnDownload().click();
	}
	public static void ClickOnUploadaddition()
	{
		ClickOnUpload().click();
	}
	public static void ClickOnSelectFile()
	{
		ClickOnBrowse().click();
	}
	
	public static void UploadExcelFile()
	{
		 By fileInputLocator = By.xpath("//label[text()='Select file']");
		 String filePath = "C:\\Users\\venka\\Downloads\\addEmployeeFormat.xlsx";
		 uploadFile(driver, fileInputLocator, filePath);
	}
		 
	 private static void uploadFile(WebDriver driver, By fileInputLocator, String filePath)
	 {
		        WebElement fileInput = driver.findElement(fileInputLocator);

		        fileInput.sendKeys(filePath);
	}
	
}
