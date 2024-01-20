package Employee_Application_Pages;

import javax.mail.event.MailEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Claims_Page extends Driver_Page{
	//private final static By byforward=By.xpath("//li[@class='pagination-page page-item ng-star-inserted']");
	private final static By bymyclaimsicon=By.xpath("(//i[@class='fa-heart fas ni purple1'])[2]");
	private final static By bymyclaims=By.xpath("(//i[@class='fas fa-eye'])[4]");
	private final static By bystatus=By.xpath("(//span[contains(text(),'claim requested')])[3]");
	private final static By byprint=By.xpath("//button[@class='btn btn-custom-bg']");
	private final static By bybacktomyclaims=By.xpath("//span[text()='My Claims ']");
	private final static By byedit=By.xpath("(//i[@class='fas fa-pen'])[4]");
	private final static By bysave=By.xpath("//button[text()=' Save ']");
	
	
	
//	public static WebElement ClickOnPage2()
//	{
//		return driver.findElement(byforward);
//	}
	public static WebElement ClickOnClaimsIcon()
	{
		return driver.findElement(bymyclaimsicon);
	}
	public static WebElement ClickonClaims()
	{
		return driver.findElement(bymyclaims);
	}
	public static WebElement ClickOnStatus()
	{
		return driver.findElement(bystatus);
	}
	public static WebElement ClickOnPrint()
	{
		return driver.findElement(byprint);
	}
	public static WebElement ClickOnMyClaims()
	{
		return driver.findElement(bybacktomyclaims);
	}
	public static WebElement CLickOnPenIcon()
	{
		return driver.findElement(byedit);
	}
	public static WebElement ClickOnSave()
	{
		return driver.findElement(bysave);
	}
	
	
//	public static void ClickonPage2()
//	{
//		ClickOnPage2().click();
//	}
	public static void ClickOnMyClaimsIcon()
	{
		ClickOnClaimsIcon().click();
	}
	public static void CLickOnMyClaims()
	{
		ClickonClaims().click();
	}
	public static void ClickonStatus()
	{
		ClickOnStatus().click();
	}
	public static void ClickonPrint()
	{
		ClickOnPrint().click();
	}
	public static void ClickonMyClaims()
	{
		ClickOnMyClaims().click();
	}
	public static void CLickonPenIcon()
	{
		CLickOnPenIcon().click();
	}
	public static void ClickonSave()
	{
		ClickOnSave().click();
	}
	
	
	public static void PrintButtonUsingEnter() throws InterruptedException
	{
		Thread.sleep(3000);
		Actions action=new Actions(driver);
		action.keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();;
	}
	
}
