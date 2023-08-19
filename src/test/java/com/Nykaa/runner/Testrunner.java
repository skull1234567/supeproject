package com.Nykaa.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\navee\\eclipse-workspace\\CucumberNykaa\\src\\test\\java\\com\\Nykaa\\features",glue = "com.stepdefinition")
public class Testrunner {
	
	

}
