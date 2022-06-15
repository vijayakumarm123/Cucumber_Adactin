package com.adactin.runner;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.properties.File_Reader_Manager;
import com.baseclass.org.BaseClasss;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\java\\com\\adactin\\feature",
glue ="com.adactin.stepdefinition",
monochrome=true,
dryRun = false,
strict = true,

plugin = {"html:Report/Html_Report",
		"pretty",
		"json:Report/Json_Report.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Extent_Folder/Extent_Report.html"
})
public class RunnerClass {
		
	public static WebDriver driver;
	
	@BeforeClass
	public static void setup() throws IOException {	
		
		String browser = File_Reader_Manager.getinstance().getinstaceCR().getbrowser();
		
		driver = BaseClasss.getbrower(browser);
		
	}
	
	@AfterClass
	public static void teardown() {
		driver = BaseClasss.close();

	}
	
}
