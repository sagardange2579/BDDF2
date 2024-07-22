package BaseLayer;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static Properties prop;
	public static WebDriver driver;

	public BaseClass() {
		prop = new Properties();
		String path = System.getProperty("user.dir") + "\\src\\main\\java\\ConfigurationLayer\\config.properties";

		try {
			FileInputStream fis = new FileInputStream(path);
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void initialization() {
		// System.setProperty("webdriver.chrome.driver","path of chromedriver");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(45));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		String url = prop.getProperty("URL");
		driver.get(url);

	}

}