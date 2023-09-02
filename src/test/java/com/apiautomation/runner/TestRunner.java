package com.apiautomation.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/features", 
                  glue = "com.apiautomation.stepdefinitions",
                  tags = "@adduser",
                  plugin = {"pretty", "html:target/cucumber-reports/cucumber.html",
				                      "json:target/cucumber-reports/cucumber.json" })
public class TestRunner {

}
