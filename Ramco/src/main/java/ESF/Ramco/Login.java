package ESF.Ramco;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login {	
		
	static String driverPath = "D:\\JavaPractice\\Ramco\\Utility\\geckodriver.exe";
	public WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		System.out.println("*******************");
		System.out.println("launching browser");
		System.setProperty("webdriver.gecko.driver", driverPath);
		driver = new FirefoxDriver();		
		driver.manage().window().maximize();
	}
	
	@Test
	public void testPageBrowserTitle() {
		driver.get("https://allegis.ramcouat.com/RVW/extui/vwrt/LaunchPanel.htm");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);		
		String strPageTitle = driver.getTitle();
		System.out.println("Page title: - "+strPageTitle);
		//driver.switchTo().frame("ilboinnerframe");
		WebDriverWait wait = new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("ilboinnerframe"));		
		/*WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='customloginbody']//*[@id='btnLogin']")));*/
		//driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='customloginbody']//*[@id='ide_username']")).clear();
		driver.findElement(By.xpath(".//*[@id='customloginbody']//*[@id='ide_username']")).sendKeys("esfuser1");
		driver.findElement(By.xpath(".//*[@id='customloginbody']//*[@id='ide_password']")).clear();
		driver.findElement(By.xpath(".//*[@id='customloginbody']//*[@id='ide_password']")).sendKeys("Password12$");
		driver.findElement(By.xpath(".//*[@id='customloginbody']//*[@id='btnLogin']")).click();
		//Assert.assertTrue(strPageTitle.equalsIgnoreCase("Google"), "Page title doesn't match");
		System.out.println("i have reached here");
	}	
	
	/*@AfterClass
	public void tearDown() {
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.MINUTES);
		if(driver!=null) {
			System.out.println("Closing Firefox browser");
			driver.quit();
		}
	}*/
}