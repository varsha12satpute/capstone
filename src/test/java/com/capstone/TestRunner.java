package com.capstone;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/Features",
		glue = {"StepDefination"},
		tags = "@tagselectflight or @tagRegister or @tag1"
//		tags = "@tagRegister"
//		tags = "@tag1"
		)



public class TestRunner {


}


