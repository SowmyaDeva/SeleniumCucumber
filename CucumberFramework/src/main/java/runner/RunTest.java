package runner;

import base.BaseClass;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/main/java/features/Login.feature", glue = {"base","pages"})
public class RunTest extends BaseClass {

}
