import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {

 


	public static void main(String[] args) throws InterruptedException {
		System.setProperty( "webdriver.chrome.driver", "C:\\Users\\Realme\\Music\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.navigate().to( "https://www.tutorialspoint.com/index.htm");
		System.out.println("title of the page is"+driver.getTitle());
		driver.findElement( By.xpath( "//div[text()='Machine Learning']"));
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		  
		  js.executeScript("arguments[0].scrollIntoView[0];,Machinelearning");
Thread.sleep( 3000);
Machinelearning.click();	
	}

}

