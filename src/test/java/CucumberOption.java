import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/feature/login.feature",glue="stepdefinition",tags="@MobileTest",plugin={"pretty", "html:target/cucumber","json:target/cucumber.json","junit:/taget/cukes.xml"})
public class CucumberOption {

}
