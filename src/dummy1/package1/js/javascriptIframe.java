package dummy1.package1.js;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptIframe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cygnet-infotech.com/");
		//driver.manage().window().maximize();
		/*
		 * JavascriptExecutor js = (JavascriptExecutor)driver;
		 * js.executeScript("document.getElementById('username').value='mnshah';");
		 * js.executeScript("document.getElementById('password').value='may@2021';");
		 * driver.findElement(By.id("btnLogin")).click();
		 */
			java.util.List<WebElement>elment= driver.findElements(By.tagName("a"));
			System.out.println(elment.size());
			for(WebElement ele:elment)
			{
				System.out.println(ele.getAttribute("href"));
				
			}
	}

}
