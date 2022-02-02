import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDragAndDrop {

	public static void main(String[] args) {
		System.setProperty( "webdriver.chrome.driver", "C:\\Users\\Realme\\Music\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get( "http://demoqa.com/droppable/");
		
	 WebElement source =driver.findElement(By.id("draggable-a" ));
	 WebElement destination =driver.findElement(By.id("droppable -b" ));
	 
	Actions actions =new Actions(driver);
	
	actions.dragAndDrop(source, destination).build().perform();
		 
	}

}
