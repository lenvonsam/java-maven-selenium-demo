package jar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// tell application where is geckodriver
		System.setProperty("webdriver.gecko.driver", "/Users/juny/ide/geckodriver");

		// instance firefoxdriver
		WebDriver driver = new FirefoxDriver();

		// And now use this to visit Baidu
		driver.get("http://www.baidu.com");

		// Find the text input element by its name
		WebElement element = driver.findElement(By.id("kw"));

		// Enter something to search for hello world
		element.sendKeys("hello world");

		// Now submit the form. WebDriver will find the form element
		WebElement buttonEle = driver.findElement(By.id("form"));

		// element.submit();
		buttonEle.submit();

		// Check the title of the page
		System.out.println("Page title is: " + driver.getTitle());

		// Close the browser
		// driver.quit();
	}
}
