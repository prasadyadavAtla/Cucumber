import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/feature/login.feature",glue="stepdefinition",tags="@SmokeTest")
public class CucumberOption {

}
