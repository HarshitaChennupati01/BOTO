package HR_Application_Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.paulhammant.ngwebdriver.NgWebDriver;

public class Driver_Page {
	static WebDriver driver;

	public static void Driver()
	{
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harshita\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("http://bototechnologies.com/#/login");
		driver.manage().window().maximize();
		NgWebDriver ngDriver= new NgWebDriver((JavascriptExecutor)driver);
		ngDriver.waitForAngularRequestsToFinish();

	}
	public static void Scroldown()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		   js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}

}
