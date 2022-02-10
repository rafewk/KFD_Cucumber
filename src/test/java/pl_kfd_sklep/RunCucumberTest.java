package pl_kfd_sklep;

import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/pl_kfd_sklep/features",
        plugin={"pretty", "html:target/index.html", "json:target/cucumber.json"})
public class RunCucumberTest {
}
