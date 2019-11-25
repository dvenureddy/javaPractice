package book.beginners;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBrowser {

	public static void main(String[] args) {

		//setting path of geckodriver
		System.setProperty("webdriver.gecko.driver",
				"D:/JavaPractice/beginnersbook/beginners/src/test/java/book/beginners/resources/geckodriver.exe");
		// Launching firefox browser
		FirefoxDriver FDriver = new FirefoxDriver();
		// Opening a URL
		FDriver.get("https://www.google.com");
		// Closing the browser
		FDriver.quit();
	}
}