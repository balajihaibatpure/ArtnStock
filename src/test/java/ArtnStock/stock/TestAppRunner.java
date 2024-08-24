package ArtnStock.stock;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "C:\\Users\\shree\\eclipse-workspace\\stock\\src\\test\\java\\Features\\Arts.feature", // Corrected path to feature file
    glue = {"TestArt.java"}, // Corrected package name for step definitions
    plugin = {
        "pretty",
        "html:target/cucumber-reports/cucumber.html",
        "json:target/cucumber-reports/cucumber.json" // Changed "Txt" to "json"
    }
)
public class TestAppRunner {
}
