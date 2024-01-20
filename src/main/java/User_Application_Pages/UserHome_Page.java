package User_Application_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class UserHome_Page extends Driver_Page{
 private final static By bypremiumcard=By.xpath("(//div[@class='card-body'])[2]");
 private final static By bypremiumview=By.xpath("//td[text()='View']");
 private final static By byclaimscard=By.xpath("(//div[@class='card-body'])[3]");
 private final static By byclaimview=By.xpath("//td[text()='View']");
 private final static By byendorsementcard=By.xpath("(//div[@class='card-body'])[4]");
 private final static By byendorsementview=By.xpath("//td[text()='View']");
 
 
 public static WebElement ClickOnPremiumCard()
 {
	 return driver.findElement(bypremiumcard);
 }
 public static WebElement ClickOnPremiumView()
 {
	 return driver.findElement(bypremiumview);
 }
 public static WebElement ClickOnClaimsCard()
 {
	 return driver.findElement(byclaimscard);
 }
 public static WebElement ClickOnClaimView()
 {
	 return driver.findElement(byclaimview);
 }
 public static WebElement ClickOnEndorsementCard()
 {
	 return driver.findElement(byendorsementcard);
 }
 public static WebElement ClickOnEndorsementView()
 {
	 return driver.findElement(byendorsementview);
 }
 
 
 public static void ClickOnPremium()
 {
	 ClickOnPremiumCard().click();
 }
 public static void ClickOnPremiumview()
 {
	 //Driver_Page.Scroldown();
	 ClickOnPremiumView().click();
 }
 public static void ClickOnClaims()
 {
	 ClickOnClaimsCard().click();
 }
 public static void ClickOnClaimsview()
 {
	 //Driver_Page.Scroldown();
	 ClickOnClaimView().click();
 }
 public static void ClickOnEndorsement()
 {
	 ClickOnEndorsementCard().click();
 }
 public static void ClickOnEndorsementview()
 {
	// Driver_Page.Scroldown();
	 ClickOnEndorsementView().click();
 }
}
