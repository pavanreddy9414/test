import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling{
	
	public static void main(String[] args) {
		
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Realme\\Music\\chromedriver_win32\\chromedriver.exe");  
	          
      WebDriver driver=new ChromeDriver();
      
      driver.manage().window().maximize();  
      driver.navigate().to("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
      
	 
	 
	
	driver.findElement(By.xpath("//a[text()='click this link start new tab'])[1]")).click();
	String mainwindow=driver.getWindowHandle();
	//Set < String> windowslist=driver.getWindowHandles();

	ArrayList <String> allwindows = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window( allwindows.get(1));
	
	System.out.println("title of the page is"+ driver.getTitle());
	driver.findElement(By.xpath( "'//input['@text']']")).sendKeys(" selinium  +Keys.ENTER");
	
	
	

    
	}
}
