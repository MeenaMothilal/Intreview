package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import pom.HTML_Studio_Page;
import project_base.Base_Class;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Windows.old\\Users\\Ajith\\IdeaProjects\\Interview\\src\\main\\java\\feature\\.feature",glue = "C:\\Windows.old\\Users\\Ajith\\IdeaProjects\\Interview\\src\\main\\java\\step_file\\Step_Definition.java"
)
public class Test_Runner extends Base_Class {
    public static WebDriver driver = launchingBrowser("chrome");
    public static HTML_Studio_Page html = new HTML_Studio_Page(driver);


}