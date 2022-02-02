import javax.swing.plaf.basic.BasicSliderUI.ActionScroller;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty( "webdriver.chrome.driver", "C:\\Users\\Realme\\Music\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
 		 driver.manage().window().maximize();
		 driver.navigate().to( " https://www.facebook.com");
		System.out.println("title of the page is"+driver.getTitle());
		 Thread.sleep(2000);
		 Actions actinons=new Actions(driver);
		 actinons.sendKeys(Keys.PAGE_DOWN).build().perform();
		 Thread.sleep(2000);
		Actions actinons1=new Actions(driver);
	actinons1.sendKeys(Keys.PAGE_UP).build().perform();
		 
		JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("window.scrollby(-1000,0)");
		 
		 driver.findElement( By.linkText( "Help")).click();
		 
	}

}
   