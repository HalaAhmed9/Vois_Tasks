package BookingTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

public class TestBase {

	
public static WebDriver driver;
SoftAssert soft = new SoftAssert();
	
	@BeforeTest
	
	public void openUrl() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://ksrtc.in/oprs-web/guest/home.do?h=1");
		driver.manage().window().maximize();
}
	
	
	@AfterTest
    public void CloseDriver(){
        driver.quit();
}
}
