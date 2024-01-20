package HR_Application_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Menu_Page extends Driver_Page{
	//GMC policy
	private final static By bymenu=By.xpath("(//div[@class='sidenav-toggler-inner'])[1]");	
	private final static By bydashboard=By.xpath("//i[@class='fa-home fas ni purple1']");
	private final static By bypolicy=By.xpath("//i[@class='fa-pen-square fas ni purple2']");
	private final static By bymembers=By.xpath("//i[@class='fa-users fas ni purple2']");
	private final static By byclaims=By.xpath("//i[@class='fa-hand-holding fas ni purple3']");
	private final static By byendorsement=By.xpath("(//i[@class='fa-money-check-alt fas ni purple3'])[1]");
	private final static By bypremium=By.xpath("(//i[@class='fa-money-check-alt fas ni purple3'])[2]");
	//HomePage
	private final static By bymanageMembers=By.xpath("//i[@class='fa-pen-square fas ni purple2']");
	private final static By byemrolment=By.xpath("//i[@class='fa-users fas ni purple2']");
	private final static By bybulkupload=By.xpath("//i[@class='fa-hand-holding fas ni purple3']");
	private final static By bymenuicon=By.xpath("//div[@class='sidenav-toggler d-none d-xl-block active']");
	
	public static WebElement ClickOnMenuIcon()
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
	public static WebElement CLickOnMenuIcon()
	{
		return driver.findElement(bymenuicon);
	}
	
	
	public static WebElement CLickOnManageMembers()
	{
		return driver.findElement(bymanageMembers);
	}
	public static WebElement CLickOnEnrolment()
	{
		return driver.findElement(byemrolment);
	}
	public static WebElement CLickOnBulkUploads()
	{
		return driver.findElement(bybulkupload);
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
	
	
	public static void CLickonManageMembers()
	{
		CLickOnManageMembers().click();
	}
	public static void CLickonEnrolment()
	{
		CLickOnEnrolment().click();
	}
	public static void CLickonBulkUploads()
	{
		CLickOnBulkUploads().click();
	}
	public static void ClickOnMenuicon()
	{
		CLickOnMenuIcon().click();
	}
	
}
