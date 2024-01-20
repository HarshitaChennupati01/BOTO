package HR_Application_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.paulhammant.ngwebdriver.ByAngular;

public class GMCPolicy_Page extends Driver_Page{
	private final static By byGMC=By.xpath("//p[@class='name-member']");	
	private final static By bypolicy=By.xpath("(//i[@class='fas fa-download'])[1]");
	private final static By byfeatures=By.xpath("(//i[@class='fas fa-download'])[2]");
	private final static By bymembers=By.cssSelector("div[class='name-member-heading']");
	private final static By bymenuicon=By.xpath("(//i[@class='fa-ellipsis-v fas purple-light'])[1]");
	private final static By byview=By.xpath("//a[text()=' View ']");
	private final static By byecarddownload=By.xpath("//button[@class='btn-sm btn-custom-outline']");
	private final static By byback=By.xpath("i[class='fa-users fas ni purple2']");
	private final static By byEcard=By.xpath("//span[@class='dropdown-item']");
	private final static By bymenuicon2=By.xpath("(//i[@class='fa-ellipsis-v fas purple-light'])[2]");
	private final static By byviewdetails=By.xpath("//a[text()=' View ']");
	private final static By byecard=By.xpath("//button[@class='btn-sm btn-custom-outline']");
	private final static By bymembersicon=By.xpath("i[class='fa-users fas ni purple2']");
	private final static By byE_card=By.xpath("//span[@class='dropdown-item']");
	private final static By byclaims=By.xpath("//h2[text()=' Claims ']");
	private final static By byclaimsrequest=By.xpath("(//a[text()=' View '])[1]");
	private final static By byprint=By.xpath("//button[@class='btn btn-custom-bg']");
	private final static By byPremium=By.cssSelector("i[class='fas fa-rupee-sign icon-custom']");
	private final static By bydownload=By.xpath("//span[text()='Download']");
	
	
	
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
	public static WebElement Clickmenu2()
	{
		return driver.findElement(bymenuicon2);
	}
	public static WebElement ClickViewDetails()
	{
		return driver.findElement(byviewdetails);
	}
	public static WebElement ClickOnE_cardDownload()
	{
		return driver.findElement(byecard);
	}
	public static WebElement CLickOnMemberIcon()
	{
		return driver.findElement(bymembersicon);
	}
	public static WebElement ClickE_card()
	{
		return driver.findElement(byE_card);
	}
	public static WebElement ClickOnClaims()
	{
		return driver.findElement(byclaims);
	}
	public static WebElement CLickOnClaimReq()
	{
		return driver.findElement(byclaimsrequest);
	}
	public static WebElement ClickOnPrint()
	{
		return driver.findElement(byprint);
	}
	public static WebElement ClickOnPremium()
	{
		return driver.findElement(byPremium);
	}
	public static WebElement CLickOnDownload()
	{
		return driver.findElement(bydownload);
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
	public static void ClickOnMemberIcon()
	{
		CLickOnMemberIcon().click();
	}
	public static void ClickOnEcard()
	{
		ClickEcard().click();
	}
	
	public static void ClickOnMenu2()
	{
		Clickmenu2().click();
	}
	public static void ClickOnViewDetails()
	{
		ClickViewDetails().click();
	}
	public static void ClickOnecardDownload()
	{
		ClickOnDownload().click();
	}
	public static void ClickOnMembersIcon()
	{
		CLickOnIcon().click();
	}
	public static void ClickOnE_card()
	{
		ClickE_card().click();
	}
	public static void ClickOnClaimsCard()
	{
		ClickOnClaims().click();
	}
	public static void ClickOnClaimsRequest()
	{
		CLickOnClaimReq().click();
	}
	public static void CLickOnPrint()
	{
		ClickOnPrint().click();
	}
	public static void ClickOnPremiumIcon()
	{
		ClickOnPremium().click();
	}
	public static void ClickOnDownloadLink()
	{
		CLickOnDownload().click();
	}
	
	
	public static void PrintButtonUsingEnter() throws InterruptedException
	{
		Thread.sleep(3000);
		Actions action=new Actions(driver);
		action.keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();;
	}
}
