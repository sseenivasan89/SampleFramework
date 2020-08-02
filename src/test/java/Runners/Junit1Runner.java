package Runners;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import Helpers.Utilities;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.presentation.PresentationMode;
import net.masterthought.cucumber.sorting.SortingMethod;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Features", 
	glue = { "StepDefinitions" }, 
	tags = {"@Smoke"},   //(@AddUser or @AssignLeave) and (@Smoke)
	plugin = { "pretty", "html:test-output", "json:target/cucumber.json", "json:target/cucumber-report-runner/cucumber.json",
			"de.monochromata.cucumber.report.PrettyReports:target/cucumber-report-runner",
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
			}, 
	dryRun = false, monochrome = true, strict = true)

public class Junit1Runner {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@AfterClass
	public static void tearDownClass() {

		File reportOutputDirectory = new File("target/cucumber-report-runner");
		List jsonFiles = new ArrayList<>();
		jsonFiles.add("target/cucumber-report-runner/cucumber.json");
		    String BuildNumber = "900";
		    String projectName = "Demo Project";
		    Configuration configuration = new Configuration(reportOutputDirectory, projectName);
		    configuration.setBuildNumber(BuildNumber);
		    configuration.addClassifications("Environment", Utilities.environment.toUpperCase()); 
		    configuration.addClassifications("Browser", Utilities.browserName.toUpperCase());
		    configuration.addClassifications("Platform", System.getProperty("os.name").toUpperCase());
		    configuration.setSortingMethod(SortingMethod.NATURAL);
		    configuration.addPresentationModes(PresentationMode.EXPAND_ALL_STEPS);
		    // points to the demo trends which is not used for other tests
		    configuration.setTrendsStatsFile(new File("target/test-classes/demo-trends.json"));
		    ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
		    reportBuilder.generateReports();
		}

}
