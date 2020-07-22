import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
<<<<<<< HEAD
@CucumberOptions(features="src/test/java/feature/login.feature",glue="stepdefinition",tags="@SmokeTest")
=======
@CucumberOptions(features="src/test/java/feature/login.feature",glue="stepdefinition",tags="@MobileTest",plugin={"pretty", "html:target/cucumber","json:target/cucumber.json","junit:/taget/cukes.xml"})
>>>>>>> 0578c9272d1080e1655fabd255708cf08ac60b3e
public class CucumberOption {

}
