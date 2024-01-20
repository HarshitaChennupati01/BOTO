package User_Application_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.paulhammant.ngwebdriver.ByAngular;

public class Home_Page extends Driver_Page{
	private final static By byaction=By.xpath("//td[text()='View']");
	private final static By byGMCpolicy=By.xpath("//i[@class='fas fa-medkit icon-custom icon-custom-active']");
	private final static By byGMC=By.xpath("//h2[text()=' GMC ']");	
	private final static By bypolicy=By.xpath("(//i[@class='fas fa-download'])[1]");
	private final static By byfeatures=By.xpath("(//i[@class='fas fa-download'])[2]");
	private final static By bymembers=By.xpath("//div[@class='name-member-heading']");
	private final static By bymenuicon=By.xpath("(//i[contains(@class,'fa-ellipsis-v fas purple-light')])[1]");
	private final static By byview=By.xpath("//a[text()=' View ']");
	private final static By byecarddownload=By.xpath("//button[@class='btn-sm btn-custom-outline']");
	private final static By byback=By.xpath("//i[@class='fa-users fas ni purple2']");
	private final static By byEcard=By.xpath("//span[@class='dropdown-item']");
	private final static By byclaims=By.xpath("//h2[text()=' Claims ']");
	private final static By byviewclaims=By.xpath("(//a[contains (@class,'dropdown-item')])[1]");
	private final static By byprint=By.xpath("//button[@class='btn btn-custom-bg']");//new webpage
	private final static By bypremium=By.xpath("//h2[text()=' Premium ']");
	private final static By bydownload=By.xpath("//span[text()='Download']");



	public static WebElement ClickOnaction()
	{
			return driver.findElement(byaction);	
	}
	public static WebElement ClickOnGMCPolicy()
	{
		return driver.findElement(byGMCpolicy);
	}
	public static WebElement ClickOnGMC()
	{
		return driver.findElement(byGMC);
	}
	public static WebElement ClickOnPolicy()
	{
		return driver.findElement(bypolicy);
	}
	public static WebElement ClickOnFeatures()
	{
		return driver.findElement(byfeatures);
	}
	public static WebElement ClickOnMembers()
	{
		return driver.findElement(bymembers);
	}
	public static WebElement Clickmenu()
	{
		return driver.findElement(bymenuicon);
	}
	public static WebElement ClickView()
	{
		return driver.findElement(byview);
	}
	public static WebElement ClickOnDownload()
	{
		return driver.findElement(byecarddownload);
	}
	public static WebElement CLickOnIcon()
	{
		return driver.findElement(byback);
	}
	public static WebElement ClickEcard()
	{
		return driver.findElement(byEcard);
	}
	public static WebElement ClickOnClaims()
	{
		return driver.findElement(byclaims);
	}
	public static WebElement ClickOnViewClaims()
	{
		return driver.findElement(byviewclaims);
	}
	public static WebElement ClickOnPrint()
	{
		return driver.findElement(byprint);
	}
	public static WebElement ClickOnPremiumText()
	{
		return driver.findElement(bypremium);
	}
	public static WebElement ClickonDownloadText()
	{
		return driver.findElement(bydownload);
	}



	public static void ClickOnAction()
	{
		//Driver_Page.horizontalScroll(byaction);
		ClickOnaction().click();
	}
	public static void ClickOnGMCpolicy()
	{
		ClickOnGMCPolicy().click();
	}
	public static void ClickOnGMCCard()
	{
		ClickOnGMC().click();
	}
	public static void ClickonPolicyDownload()
	{
		ClickOnPolicy().click();
	}
	public static void ClickonFeaturesDownload()
	{
		ClickOnFeatures().click();
	}
	public static void ClickonMembersCard()
	{
		ClickOnMembers().click();
	}
	public static void ClickOnMenu()
	{
		Clickmenu().click();
	}
	public static void ClickOnView()
	{
		ClickView().click();
	}
	public static void ClickOnEcardDownload()
	{
		ClickOnDownload().click();
	}
	public static void ClickOnMembersIcon()
	{
		CLickOnIcon().click();
	}
	public static void ClickOnEcard()
	{
		ClickEcard().click();
	}
	public static void ClickOnClaimsCard()
	{
		ClickOnClaims().click();
	}
	public static void ClickonView()
	{
		ClickOnViewClaims().click();
	}
	public static void ClickOnPrintButton()
	{
		ClickOnPrint().click();
	}
	public static void ClickOnPremium()
	{
		ClickOnPremiumText().click();
	}
	public static void CLickOnDownload()
	{
		ClickonDownloadText().click();
	}
	public static void PrintButtonUsingEnter() throws InterruptedException
	{
		Thread.sleep(3000);
		Actions action=new Actions(driver);
		action.keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();;
	}
}


