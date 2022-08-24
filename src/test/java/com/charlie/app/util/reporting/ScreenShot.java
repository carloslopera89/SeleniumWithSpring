package com.charlie.app.util.reporting;

import com.charlie.app.util.enums.TakeScreenShotCondition;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.util.UUID;

public class ScreenShot {

    @Autowired
    private WebDriver webDriver;

    @Value("${take.screenshot.condition}")
    private TakeScreenShotCondition takeScreenShotCondition;

    @After
    public void takeScreenShotAfterScenario(Scenario scenario) {
        if (TakeScreenShotCondition.endOfScenario == takeScreenShotCondition) {
            takeScreenShot(scenario);
        }
    }

    @AfterStep
    public void takeScreenShotAfterEveryStep(Scenario scenario) {
        if (TakeScreenShotCondition.everyStep == takeScreenShotCondition) {
            takeScreenShot(scenario);
        }
    }

    @After
    public void takeScreenShotFallinfScenario(Scenario scenario) {
        if (scenario.isFailed() && TakeScreenShotCondition.fallingScenario == takeScreenShotCondition) {
            takeScreenShot(scenario);
        }
    }

    public void takeScreenShot(Scenario scenario) {

        try {
            final byte[] screenShot = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenShot, "image/png", UUID.randomUUID().toString());

        } catch (WebDriverException e) {
            System.out.println("There was an error taking the screenshot: " + e.getMessage());
        }
    }

}
