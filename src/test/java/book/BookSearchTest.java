package book;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java"},
        glue= {"book"},
//        plugin = {"pretty","json:target/cucumber-reports/cucumber_local.json"},
        plugin = { "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt"},
//        strict = true
        monochrome = true
)

public class BookSearchTest {


}
