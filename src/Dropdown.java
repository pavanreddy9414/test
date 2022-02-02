import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty( "webdriver.chrome.driver", "C:\\Users\\Realme\\Music\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get( "http://www.facebook.com");
		 driver.findElement( By.xpath( " //a[text()='Create New Account']")).click();
		 Thread.sleep(2000);

		 WebElement daydropdown = driver.findElement( By.id( "day"));
		 Select obj=new Select(daydropdown);
		 obj.selectByIndex( 23);
		 
		 WebElement monthdropdown = driver.findElement( By.id( "month"));
		 Select month =new Select(monthdropdown);
		 month.selectByIndex( 6);
		 
		 WebElement yeardropdown1 = driver.findElement( By.id( "year"));
		 Select year =new Select(yeardropdown1);
		 year.selectByIndex( 28);
		 
		 
		 
	}

}
