package com.dbs.hellorest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java")
public class TestRunner extends AbstractTestNGCucumberTests {

}