package User_Application_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Menu_Page extends Driver_Page{
	private final static By bymenu=By.xpath("(//div[@class='sidenav-toggler-inner'])[1]");	
	private final static By bydashboard=By.xpath("(//i[@class='fa-home fas ni purple1'])[2]");
	private final static By bypolicy=By.xpath("//i[@class='fa-pen-square fas ni purple2']");
	private final static By bymembers=By.xpath("//i[@class='fa-users fas ni purple2']");
	private final static By byclaims=By.xpath("(//i[@class='fa-hand-holding fas ni purple3'])[2]");
	private final static By byendorsement=By.xpath("(//i[@class='fa-money-check-alt fas ni purple3'])[1]");
	private final static By bypremium=By.xpath("(//i[@class='fa-money-check-alt fas ni purple3'])[2]");
	private final static By bydashboardBOTO=By.xpath("(//i[@class='fa-home fas ni purple1'])[1]");
	private final static By byupload=By.xpath("(//i[@class='fa-hand-holding fas ni purple3'])[1]");
	
	
	public static WebElement CLickOnMenuIcon()
	{
		return driver.findElement(bymenu);
	}
	public static WebElement CLickOnDashBoard()
	{
		return driver.findElement(bydashboard);
	}
	public static WebElement CLickOnPolicy()
	{
		return driver.findElement(bypolicy);
	}
	public static WebElement CLickOnMembers()
	{
		return driver.findElement(bymembers);
	}
	public static WebElement CLickOnClaims()
	{
		return driver.findElement(byclaims);
	}
	public static WebElement CLickOnEndorsement()
	{
		return driver.findElement(byendorsement);
	}
	public static WebElement CLickOnPremium()
	{
		return driver.findElement(bypremium);
	}
	public static WebElement ClickOnDashboardBOTO()
	{
		return driver.findElement(bydashboardBOTO);
	}
	public static WebElement ClickOnUpload()
	{
		return driver.findElement(byupload);
	}
	
	
	public static void CLickonMenuIcon()
	{
		CLickOnMenuIcon().click();
	}
	public static void CLickonDashBoard()
	{
		CLickOnDashBoard().click();
	}
	public static void CLickonPolicy()
	{
		CLickOnPolicy().click();
	}
	public static void CLickonMembers()
	{
		CLickOnMembers().click();
	}
	public static void CLickonClaims()
	{
		CLickOnClaims().click();
	}
	public static void CLickonEndorsement()
	{
		CLickOnEndorsement().click();
	}
	public static void CLickonPremium()
	{
		CLickOnPremium().click();
	}
	public static void ClickonDashboardBOTO()
	{
		ClickOnDashboardBOTO().click();
	}
	public static void ClickonUpload()
	{
		ClickOnUpload().click();
	}
}
