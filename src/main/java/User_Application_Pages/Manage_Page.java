package User_Application_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Manage_Page extends Driver_Page{
	private final static By byManage=By.xpath("//span[text()='Manage']");	
	private final static By bymenu=By.xpath("(//i[@class='fa-ellipsis-v fas purple-light'])[1]");
	private final static By byview=By.xpath("//a[text()=' View ']");
	private final static By byedit=By.xpath("//a[text()=' Edit ']");
	private final static By bysave=By.xpath("//button[@class='btn btn-custom-bg my-4']");
	private final static By byecard=By.xpath("//span[text()=' E-Card ']");

	
	public static WebElement ClickOnManage()
	{
		return driver.findElement(byManage);
	}
	public static WebElement ClickOnActions()
	{
		return driver.findElement(bymenu);
	}
	public static WebElement ClickView()
	{
		return driver.findElement(byview);
	}
	public static WebElement ClickEdit()
	{
		return driver.findElement(byedit);
	}
	public static WebElement ClickOnsave()
	{
		return driver.findElement(bysave);
	}
	public static WebElement ClickEcard()
	{
		return driver.findElement(byecard);
	}	
	
	
	public static void ClickOnManageText()
	{
		ClickOnManage().click();
	}
	public static void ClickOnMenu()
	{
		ClickOnActions().click();
	}
	public static void ClickOnView()
	{
		ClickView().click();
	}
	public static void CLickOnEdit()
	{
		ClickEdit().click();
	}
	public static void ClickOnSave()
	{
		ClickOnsave().click();
	}
	public static void ClickOnEcard()
	{
		ClickEcard().click();
	}
}
