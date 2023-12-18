package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features ="src//test//resources//taggedFeatures//",
		glue=("stepDefs"),
		monochrome=true,
		plugin= {"pretty"}
				//"html:target//Reports//HtmlReport.html",
				//"json:target//Reports//JsonReport.json",
				//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		        // "rerun:target//failedScenarios.txt"
		
		)
public class CRMRunner extends AbstractTestNGCucumberTests{
	
}

