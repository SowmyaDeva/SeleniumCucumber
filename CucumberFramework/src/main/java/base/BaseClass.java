package base;

import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class BaseClass extends AbstractTestNGCucumberTests {

	private static final ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<RemoteWebDriver>();

	public void setDriver() {
		driver.set(new ChromeDriver());
	}

	public RemoteWebDriver getDriver() {
		return driver.get();
	}

	@BeforeMethod
	public void preCondition() {
		setDriver();
		getDriver().manage().window().maximize();
		getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@AfterClass
	public void postCondition() {
		getDriver().close();
	}

}
