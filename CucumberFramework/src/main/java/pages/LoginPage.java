package pages;

import org.openqa.selenium.By;
import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPage extends BaseClass{

	@Given ("Enter the username (.*)$")
	public LoginPage enterUsername(String username) {
		getDriver().findElement(By.name("username")).sendKeys(username);
		return this;
	}
    @Given ("Enter the password (.*)$")
	public LoginPage enterPassword(String password) {
    	getDriver().findElement(By.name("password")).sendKeys(password);
		return this;
	}
	
    @When( "I click on Login button")
	public HomePage clickLogin() {
    	getDriver().findElement(By.xpath("//button[@type=\"submit\"]")).click();
		return new HomePage();
	}
}
