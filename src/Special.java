import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Special {

	public static void main(String[] args) {
		WebElement newAccountLink;
		
			newAccountLink = ChromeDriver.findElement(By.xpath("//a[text()='Create New Account']"));

			// TODO Auto-generated catch block
	
		

        System.out.println("tagname of create new account link is : "+newAccountLink.getTagName());

        System.out.println("attribute vaule of class is : "+newAccountLink.getAttribute("class"));
        System.out.println("attribute vaule of data testid is :"+newAccountLink.getAttribute("data-testid"));
        System.out.println("attribute vaule of id is : "+newAccountLink.getAttribute("id"));

        System.out.println(newAccountLink.getCssValue("color"));
        System.out.println(newAccountLink.getCssValue("bgcolor"));



        newAccountLink.click();
        Thread.sleep(3000);

        System.out.println("Day Dropdown :: ");

        WebElement dayDropdown;
		try {
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        Select sel = new Select(dayDropdown);
 
        List<WebElement> dayValues =sel.getOptions();

        System.out.println("the number of values in the dropdown : "+dayValues.size());

      


	}

}
