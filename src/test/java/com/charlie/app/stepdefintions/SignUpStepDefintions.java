package com.charlie.app.stepdefintions;

import com.charlie.app.conf.DriverConf;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import com.charlie.app.page.SignUpServices;

import static com.charlie.app.util.RandomNumberGenerator.getPhoneNumberFaker;

@ContextConfiguration(classes = {DriverConf.class})
public class SignUpStepDefintions {

    @Autowired
    private SignUpServices signUpServices;

    @Given("Pepito wants to have an account")
    public void pepito_wants_to_have_an_account() {

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
    }

    @When("he sends required information to get the account")
    public void he_sends_required_information_to_get_the_account() {

    }

    @Then("he should be told that the account wa created")
    public void he_should_be_told_that_the_account_wa_created() {

    }
}