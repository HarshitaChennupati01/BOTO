package Employee_Application_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class QuickAccess_Page extends Driver_Page{
	
	private final static By bymenu=By.xpath("(//div[@class='sidenav-toggler-inner'])[1]");
	private final static By byreportclaim=By.xpath("//button[text()=' Report claim ']");
	private final static By byReimbursement=By.xpath("//label[text()='Reimbursement']");
	private final static By byselectmember=By.xpath("//select[contains(@placeholder,'Select Member')]");
	private final static By bylocation=By.xpath("//select[contains(@formcontrolname,'location')]");
	private final static By byhospitalname=By.xpath("//select[contains(@formcontrolname,'hospital')]");
	private final static By byDOA=By.xpath("//input[contains(@formcontrolname,'date_of_admission')]");
	private final static By bycause=By.xpath("//select[contains(@formcontrolname,'cause_of_admission')]");
	private final static By byamount=By.xpath("//input[contains(@formcontrolname,'amount')]");
	private final static By bysave=By.xpath("//button[text()=' Save ']");
	
	
	public static WebElement ClcikOnMenu()
	{
		return driver.findElement(bymenu);
	}
	public static WebElement ClickOnReportClaim()
	{
		return driver.findElement(byreportclaim);
	}
	public static WebElement CLickOnReimbursement()
	{
		return driver.findElement(byReimbursement);
	}
	public static WebElement CLickOnSelectMember()
	{
		return driver.findElement(byselectmember);
	}
	public static WebElement CLickOnLocation()
	{
		return driver.findElement(bylocation);
	}
	public static WebElement ClickOnHospital()
	{
		return driver.findElement(byhospitalname);
	}
	public static WebElement ClickOnDOA()
	{
		return driver.findElement(byDOA);
	}
	public static WebElement ClickOnCauseOfAdmission()
	{
		return driver.findElement(bycause);
	}
	public static WebElement ClickOnamount()
	{
		return driver.findElement(byamount);
	}
	public static WebElement ClickOnSave()
	{
		return driver.findElement(bysave);
	}
	
	
	public static void ClickOnMenuIcon()
	{
		ClcikOnMenu().click();	
	}
	public static void ClickOnReportClaimButton()
	{
		ClickOnReportClaim().click();
	}
	public static void ClickOnReimbursementRadioButton()
	{
		CLickOnReimbursement().click();
	}
	public static void ClickOnSlectionOfMemebr()
	{
		CLickOnSelectMember().click();
		Select slt=new Select(CLickOnSelectMember());
		slt.selectByValue("6433d03729e1900008b610f1");
	}
	public static void SlectionOfLocation()
	{
		CLickOnLocation().click();
		Select slt=new Select(CLickOnLocation());
		slt.selectByValue("625a18686c87435934d17e97");
	}
	public static void SlectionOfHospital()
	{
		ClickOnHospital().click();
		Select slt=new Select(ClickOnHospital());
		slt.selectByValue("6420692151bb5c00086e0dd8");
	}
	public static void SelectDOA()
	{
		ClickOnDOA().sendKeys("10/13/2023");
	}
	public static void ClickOnCOA()
	{
		ClickOnCauseOfAdmission().click();
		Select slt=new Select(ClickOnCauseOfAdmission());
		slt.selectByVisibleText("Fever");
	}
	public static void ClickOnEstimatedAmount()
	{
		ClickOnamount().sendKeys("5000");
	}
	public static void CLickOnSaveButton()
	{
		ClickOnSave().click();
	}
}
