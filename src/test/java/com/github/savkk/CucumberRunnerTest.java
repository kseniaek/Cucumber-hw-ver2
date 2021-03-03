package com.github.savkk;

import cucumber.api.CucumberOptions;
import io.cucumber.junit.platform.engine.Cucumber;


@CucumberOptions(
        features = "src/test/features",
        glue = "ru.savkk.test",
        tags = {"@test_positive","@test_negative"},
        dryRun = false,
        strict = false
)

@Cucumber
public class CucumberRunnerTest {
}
