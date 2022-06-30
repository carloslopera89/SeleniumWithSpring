package stepdefintions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.SignUpPageObject;
import page.SignUpServices;

import static util.RandomNumberGenerator.getPhoneNumberFaker;

public class SignUpStepDefintions {

    @Given("Pepito wants to have an account")
    public void pepito_wants_to_have_an_account() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") + "/src/test/resources/drivers/mac/chromedriver");

        WebDriver driver = new ChromeDriver();
        SignUpServices signUpServices = new SignUpServices(driver);
        signUpServices.go("http://demo.automationtesting.in/Register.html");
        signUpServices.writeFirstName("Pepito");
        signUpServices.writeLastName("Perez");
        signUpServices.writeEmailAddress("perez@gmail.com");
        signUpServices.writePhone(getPhoneNumberFaker());
        signUpServices.selectGenderMale();
        signUpServices.selectBirthDay("10");
        signUpServices.selectBirthMonth("February");
        signUpServices.selectBirthYear("1989");
        signUpServices.writePassword("EuLDLM2022");
        signUpServices.writeConfirmPassword("EuLDLM2022");
        signUpServices.clickOnSubmit();

        Thread.sleep(5000);
        driver.quit();

    }

    @When("he sends required information to get the account")
    public void he_sends_required_information_to_get_the_account() {

    }

    @Then("he should be told that the account wa created")
    public void he_should_be_told_that_the_account_wa_created() {

    }
}
