package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

	public static WebDriver driver;
	public static WebDriverWait wait;

	public static void initialization(String browserName, String URL) throws InterruptedException {

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium Software\\Browser_Driver\\chromedriver.exe");
			driver = new ChromeDriver();

			ChromeOptions options = new ChromeOptions();
			options.addArguments("incognito");

		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium Software\\Browser_Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();

	//	driver.manage().deleteAllCookies();

		
		// Enter the URL
		driver.get(URL);
		
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		pageLoadWait();
		
//		Thread.sleep(10000);
		
		wait = new WebDriverWait(driver, 50);

	}

	public static void pageLoadWait() {

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	}

}
