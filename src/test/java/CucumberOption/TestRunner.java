package CucumberOption;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 
@CucumberOptions( 
  features="src/test/java/Features" , 
  glue="StepDefination" ,
 // tags = "@SmokeTest" 
 monochrome=true  
       )
public class TestRunner {
	
	       

}
