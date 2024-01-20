package Employee_Application_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.paulhammant.ngwebdriver.ByAngular;

public class Coverages_Page extends Driver_Page{
	private final static By bypolicydownload=By.xpath("//button[text()=' Policy Features ']");
	private final static By byecard1=By.xpath("(//button[contains(text(),'E-Card')])[1]");
	//private final static By byecard2=By.xpath("(//button[contains(text(),'E-Card')])[2]");
	//private final static By byecard3=By.xpath("(//button[contains(text(),'E-Card')])[3]");
	//private final static By byecard4=By.xpath("(//button[contains(text(),'E-Card')])[4]");
	private final static By bygrouplife=By.xpath("//button[text()='Group Life']");
	private final static By bygroupaccident=By.xpath("//button[text()='Group Accident']"); 
	private final static By byindividualplan=By.xpath("//button[text()='Individual Plans']");



	public static WebElement ClickOnDownload()
	{
		return driver.findElement(bypolicydownload);
	}
	public static WebElement ClickOnEcard1()
	{
		return driver.findElement(byecard1);
	}
	/*public static WebElement ClickOnEcard2()
	{
		return driver.findElement(byecard2);
	}
	public static WebElement ClickOnEcard3()
	{
		return driver.findElement(byecard3);
	}
	public static WebElement ClickOnEcard4()
	{
		return driver.findElement(byecard4);
	}*/
	public static WebElement ClickOnGroupLife()
	{
		return driver.findElement(bygrouplife);
	}
	public static WebElement ClickOnGroupAccident()
	{
		return driver.findElement(bygroupaccident);
	}
	public static WebElement ClickOnIndividualPlan()
	{
		return driver.findElement(byindividualplan);
	}



	public static void ClickonDownloadButton() throws InterruptedException
	{
		Thread.sleep(5000);
		ClickOnDownload().click();
	}
	public static void ClickonDownloadEcard1() throws InterruptedException
	{
		Thread.sleep(5000);
		ClickOnEcard1().click();
	}
	/*public static void ClickonDownloadEcard2() throws InterruptedException
	{
		Thread.sleep(5000);
		ClickOnEcard2().click();
	}
	public static void ClickonDownloadEcard3() throws InterruptedException
	{
		Thread.sleep(5000);
		ClickOnEcard3().click();
	}
	public static void ClickonDownloadEcard4() throws InterruptedException
	{
		Thread.sleep(5000);
		ClickOnEcard4().click();
	}*/
	public static void ClickOnGroupLifeButton() throws InterruptedException
	{
		Thread.sleep(5000);
		ClickOnGroupLife().click();
	}
	public static void ClickOnGroupAccidentButton() throws InterruptedException
	{
		Thread.sleep(5000);
		ClickOnGroupAccident().click();
	}
	public static void ClickOnIndividualPlanButton() throws InterruptedException
	{
		Thread.sleep(5000);
		ClickOnIndividualPlan().click();
	}
}
