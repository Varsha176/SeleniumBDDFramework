package com.test.runner;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.test.base.Webdriverfactory;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = { "src/test/resources/features" }, 
		glue = { "com.test.stepdefination" }, // path of step definition
		tags = "@Login",
		
		plugin = { "pretty",
				"html:./reports/cucumber-reports/cucumber-html/index.html",
				"json:target/cucumber-reports/CucumberTestReport.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" } 
		)

public class TestRunner extends AbstractTestNGCucumberTests {

	@Parameters("browserName")
    @BeforeMethod
    public void setupTest(@Optional("chrome") String browserName) throws Exception {
		
		 Webdriverfactory.setupDriver(browserName);
    }
    
    @AfterMethod
    public void tearDown() {
        
      Webdriverfactory.quitDriver();
       
    }
}

