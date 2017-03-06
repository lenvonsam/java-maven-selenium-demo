# Java + Maven + Selenium for web-driver-test

Just a demo for web-driver-test used by maven、java and selenium.

## Get Started

- #### IDE Reqirement

  1. Download eclipse ide(neno better)
  2. jdk1.8
  3. maven3.3+

- Selenium Maven dependence

  ```Xml
  <dependency>
  	<groupId>org.seleniumhq.selenium</groupId>
  	<artifactId>selenium-java</artifactId>
  	<version>3.0.1</version>
  </dependency>

  <dependency>
  	<groupId>org.seleniumhq.selenium</groupId>
  	<artifactId>selenium-firefox-driver</artifactId>
  	<version>3.2.0</version>
  </dependency>

  <dependency>
  	<groupId>org.seleniumhq.selenium</groupId>
  	<artifactId>selenium-server</artifactId>
  	<version>3.2.0</version>
  </dependency>

  ```

- [Download geckodriver releases](https://github.com/mozilla/geckodriver/releases),then unzip to your application path

- Programing selenium code

  ```java
  public static void main(String[] args) {
  		// tell application where is geckodriver(absolute path!!!)
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
  ```

- Finally, run Java Application



> NOTE: This project is Apache 2.0 licensed.