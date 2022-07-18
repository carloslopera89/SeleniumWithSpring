package hook;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HookDriver {

    public static WebDriver driver;

    @Before
    public static void ceate_driver() {
        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") + "/src/test/resources/drivers/mac/chromedriver");
        driver = new ChromeDriver();
    }

    @After
    public static void quitDriver() throws InterruptedException {
        if (driver != null) {
            Thread.sleep(5000);
            driver.quit();
        }
    }
}
