	import org.junit.runner.RunWith;
	import cucumber.api.CucumberOptions;
	import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(
	   //path of feature file
	   features = "D:/CucumberTest/CukeTest1/src/test/resources/feature/CommentSold.feature",
	   
	   //path of step definition file
		glue={"StepDefinitions"}
)
	   
	public class TestRunner {
	}
