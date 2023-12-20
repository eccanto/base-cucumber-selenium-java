import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource(".")
@ConfigurationParameter(
        key = PLUGIN_PROPERTY_NAME,
        value =
                ("pretty,"
                        + "junit:target/cucumber-reports/Cucumber.xml,"
                        + "json:target/cucumber-reports/Cucumber.json,"
                        + "html:target/cucumber-reports/Cucumber.html,"
                        + "timeline:target/cucumber-reports/CucumberTimeline"))
public class RunCucumberTest {}
