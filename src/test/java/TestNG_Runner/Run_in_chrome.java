package TestNG_Runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

@CucumberOptions(plugin = {"pretty",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = {"C:\\TestNgPractice\\Feature_Files"},
        glue = {"ChromeSteps"}
        ,tags = "@Scenario01"
)

public class Run_in_chrome extends AbstractTestNGCucumberTests {
    /*@Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }*/

}
