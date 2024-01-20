package HR_Application_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Members_AddEmplee_Page extends Driver_Page{
	private final static By bymenu=By.xpath("(//i[@class='fa-ellipsis-v fas purple-light'])[1]");
	private final static By byview=By.xpath("//a[text()=' View ']");
	private final static By byback=By.xpath("//i[@class='fa-pen-square fas ni purple2']");
	private final static By byedit=By.xpath("//a[text()=' Edit ']");
	public final static By byecard=By.xpath("//span[text()=' E-Card ']");
	
	
	
	public static WebElement ClickOnMenuIcon()
	{
		return driver.findElement(bymenu);
	}
	public static WebElement ClickOnView()
	{
		return driver.findElement(byview);
	}
	public static WebElement ClickOnBack()
	{
		return driver.findElement(byback);
	}
	public static WebElement ClickOnEdit()
	{
		return driver.findElement(byedit);
	}
	public static WebElement ClickOnEcard()
	{
		return driver.findElement(byecard);
	}
	
	
	
	public static void ClickOnMenu()
	{
		ClickOnMenuIcon().click();
	}
	public static void ClickOnViewText()
	{
		ClickOnView().click();
	}
	public static void ClickOnManageMembers()
	{
		ClickOnBack().click();
	}
	public static void ClickOnEditText()
	{
		ClickOnEdit().click();
	}
	public static void ClickOnEcardText()
	{
		ClickOnEcard().click();
	}
}
