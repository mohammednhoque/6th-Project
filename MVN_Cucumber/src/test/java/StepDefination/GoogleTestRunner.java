package StepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="src\\test\\resources\\Feature",glue= {"StepDefination"},
plugin= {"pretty",	"junit:target/JunitReport/report.xml",
"json:target/JunitReport/report.json",
"html:target/JunitReport/report.html"}
)



public class GoogleTestRunner {

}
