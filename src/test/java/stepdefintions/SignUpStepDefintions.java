package stepdefintions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.SignUpPageObject;

public class SignUpStepDefintions {

    @Given("Pepito wants to have an account")
    public void pepito_wants_to_have_an_account() {

        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") + "/src/test/resources/drivers/mac/chromedriver");

        WebDriver driver = new ChromeDriver();
        SignUpPageObject signUpPageObject = new SignUpPageObject(driver);
        signUpPageObject.go("http://demo.automationtesting.in/Register.html");
        signUpPageObject.writeFirstName("Pepito");
        signUpPageObject.writeLastName("Perez");
        signUpPageObject.clickOnSubmit();

    }

    @When("he sends required information to get the account")
    public void he_sends_required_information_to_get_the_account() {

    }

    @Then("he should be told that the account wa created")
    public void he_should_be_told_that_the_account_wa_created() {

    }
}
