package HR_Application_Pages;

import org.openqa.selenium.By;

public class CustomEx_Page extends Driver_Page {
	private final static By byloader=By.xpath("//div[@class='sk-cube-grid']");

	public static void loader(int sec) throws InterruptedException
	{
		Thread.sleep(9000);
		Long startTime = System.currentTimeMillis();
		Long endTime = startTime+(sec*1000);

		try {
			Thread.sleep(12000);
			while (System.currentTimeMillis() < endTime
					&& driver.findElement(byloader).isDisplayed()) {
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.println();
		}
		Thread.sleep(2000);
	}
}
