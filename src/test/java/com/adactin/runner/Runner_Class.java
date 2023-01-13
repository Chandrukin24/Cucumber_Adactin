package com.adactin.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.Base_Class;
import com.adactin.properties.File_Reader_Manager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature", glue = "com.adactin.stepdefinition")

public class Runner_Class {

	public static WebDriver driver;

	@BeforeClass
	public static void setUp() throws IOException {

		String browser = File_Reader_Manager.getInstance().getInstanceCR().getBrowser();
		String url = File_Reader_Manager.getInstance().getInstanceCR().getUrl();

		driver = Base_Class.launchbrowser("chrome");
		driver = Base_Class.getUrl(url);

	}

	@AfterClass
	public static void teamDown() {
		driver = Base_Class.close();

	}
}
