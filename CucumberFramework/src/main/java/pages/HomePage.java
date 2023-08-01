package pages;

import org.testng.Assert;
import base.BaseClass;
import io.cucumber.java.en.Then;

public class HomePage extends BaseClass{

	@Then("Homepage should be displayed")
	public HomePage verifyHomePage() {
		String title =  getDriver().getTitle();
		Assert.assertEquals(title, "OrangeHRM"); 
		return this;
	}
}
