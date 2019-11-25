package book.beginners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTestNG {

	String appUrl = "https://accounts.google.com";

	@Test
	public void gmailLogin() {
		//System.setProperty("webdriver.gecko.driver",	"D:/JavaPractice/beginnersbook/beginners/src/test/java/book/beginners/resources/geckodriver.exe");
		//FirefoxDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver",	"D:/JavaPractice/beginnersbook/beginners/src/test/java/book/beginners/resources/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		// launch the firefox browser and open the application url
		driver.get("https://gmail.com");

		// maximize the browser window
		driver.manage().window().maximize();

		// declare and initialize the variable to store the expected title of the
		// webpage.
		String expectedTitle = "Gmail";

		// fetch the title of the web page and save it into a string variable
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(expectedTitle, actualTitle);

	
		// enter a valid username in the email textbox
		WebElement username = driver.findElement(By.id("Email"));
		username.clear();
		username.sendKeys("TestSelenium");

		// enter a valid password in the password textbox
		WebElement password = driver.findElement(By.id("Passwd"));
		password.clear();
		password.sendKeys("password123");

		// click on the Sign in button
		WebElement SignInButton = driver.findElement(By.id("signIn"));
		SignInButton.click();

		// close the web browser
		driver.close();
		driver.quit();
	}
}