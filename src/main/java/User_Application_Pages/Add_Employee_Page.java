package User_Application_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Add_Employee_Page extends Driver_Page{
	private final static By byAdd=By.xpath("//span[text()='Add']");	
	private final static By byemployeeid=By.xpath("//input[contains(@placeholder,'Employee ID')]");
	private final static By bymemberid=By.xpath("//input[contains(@placeholder,'Member ID')]");
	private final static By byfullname=By.xpath("//input[contains(@placeholder,'Full Name')]");
	private final static By bydesignation=By.xpath("//select[contains(@ng-reflect-name,'designation')]");
	private final static By byDOJ=By.xpath("//input[@placeholder='DOJ']");
	private final static By bydepartment=By.xpath("//select[contains(@ng-reflect-name,'department')]");
	private final static By bygender=By.xpath("//select[contains(@ng-reflect-name,'gender')]");
	private final static By bymaritalstatus=By.xpath("//select[contains(@ng-reflect-name,'marital_status')]");
	private final static By byDOB=By.xpath("//input[contains(@placeholder,'DOB')]");
	private final static By bymail=By.xpath("//input[contains(@ng-reflect-name,'email')]");
	private final static By bymobileno=By.xpath("//input[contains(@ng-reflect-name,'mobile')]");
	private final static By bylocation=By.xpath("//select[contains(@ng-reflect-name,'location')]");
	private final static By byrole=By.xpath("//select[contains(@ng-reflect-name,'role')]");
	private final static By bysave=By.xpath("//button[@class='btn btn-custom-bg my-4']");
	
	
	
	public static WebElement ClickOnAdd()
	{
		return driver.findElement(byAdd);
	}
	public static WebElement ClickOnEmployee()
	{
		return driver.findElement(byemployeeid);
	}
	public static WebElement ClickOnMember()
	{
		return driver.findElement(bymemberid);
	}
	public static WebElement ClickFullName()
	{
		return driver.findElement(byfullname);
	}
	public static WebElement ClickDesignation()
	{
		return driver.findElement(bydesignation);
	}
	public static WebElement ClickOnDOJ()
	{
		return driver.findElement(byDOJ);
	}
	public static WebElement ClickOnDepartment()
	{
		return driver.findElement(bydepartment);
	}
	public static WebElement ClickOnGender()
	{
		return driver.findElement(bygender);
	}
	public static WebElement ClickOnMaritalStatus()
	{
		return driver.findElement(bymaritalstatus);
	}
	public static WebElement ClickOnDOB()
	{
		return driver.findElement(byDOB);
	}
	public static WebElement ClickOnMail()
	{
		return driver.findElement(bymail);
	}
	public static WebElement CLickOnMobile()
	{
		return driver.findElement(bymobileno);
	}
	public static WebElement ClickOnLocation()
	{
		return driver.findElement(bylocation);
	}
	public static WebElement ClickOnRole()
	{
		return driver.findElement(byrole);
	}
	public static WebElement ClickOnSave()
	{
		return driver.findElement(bysave);
	}

	
	
	
	public static void ClickOnAddText()
	{
		ClickOnAdd().click();
	}
	public static void ClickOnEmployeeId()
	{
		ClickOnEmployee().sendKeys("001");;
	}
	public static void ClickOnMemberId()
	{
		ClickOnMember().sendKeys("001A");;
	}
	public static void ClickOnName()
	{
		ClickFullName().sendKeys("Abhi");
	}
	public static void ClickOnDesignation()
	{
		ClickDesignation().click(); 
		Select slt=new Select(ClickDesignation());
		slt.selectByValue(" Manager - Business Development");
	}
	public static void CLickOnDateOnJoining()
	{
		ClickOnDOJ().sendKeys("11/23/2023");
	}
	public static void SelectDepartment()
	{
		ClickOnDepartment().click();
		Select slt=new Select(ClickOnDepartment());
		slt.selectByValue("625a53b86c87435934d17ea1");
	}
	public static void SelectGender()
	{
		ClickOnGender().click();
		Select slt=new Select(ClickOnGender());
		slt.selectByVisibleText("Male");
	}
	public static void SelectMaritalStatus()
	{
		ClickOnMaritalStatus().click();
		Select slt=new Select(ClickOnGender());
		slt.selectByVisibleText("Married");
	}
	public static void ClickOnDateOfBirth()
	{
		ClickOnDOB().sendKeys("10/13/1995");
	}
	public static void ClickOnEmail()
	{
		ClickOnMail().sendKeys("prem98@yopmail.com");
	}
	public static void ClickOnMobileNumber()
	{
		CLickOnMobile().sendKeys("9888675606");
	}
	public static void SelectLocation()
	{
		ClickOnLocation().click();
		Select slt=new Select(ClickOnLocation());
		slt.selectByValue("625a18686c87435934d17e97");
	}
	public static void SelectRole()
	{
		ClickOnRole().click();
		Select slt=new Select(ClickOnRole());
		slt.selectByValue("625a379e6c87435934d17e9d");
	}
	public static void ClickOnSaveButton()
	{
		ClickOnSave().click();
	}
}
