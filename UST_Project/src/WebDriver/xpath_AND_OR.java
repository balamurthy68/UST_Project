package WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.openChromeBrowser;

public class xpath_AND_OR {

	public static void main(String[] args) {
		WebDriver driver;
		WebElement w,x;
		
		openChromeBrowser ob = new openChromeBrowser();
		
		driver = ob.openChrome();
		
		// Launch the application
		driver.get("https://www.guru99.com/");

		//Search element using OR in the xpath
		w=driver.findElement(By.xpath("//*[@type='submit' OR @name='btnReset']"));

		//Print the text of the element
		System.out.println(w.getText());

		//Search element using AND in the xpath
		x=driver.findElement(By.xpath("//input[@type='submit' and @name='btnLogin']"));	

		//Print the text of the searched element
		System.out.println(x.getText());

		//Close the browser
		driver.quit();
	}

}