package com.charlie.app.stepdefintions;

import com.charlie.app.builder.data.UserBuilder;
import com.charlie.app.conf.DriverConf;
import com.charlie.app.page.SignUpServices;
import com.charlie.app.task.NavigateTo;
import com.charlie.app.task.UserSignUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = {DriverConf.class})
public class SignUpStepDefintions {

    @Autowired
    private UserSignUp userSignUp;

    @Autowired
    private NavigateTo navigateTo;

    @Given("Pepito wants to have an account")
    public void pepito_wants_to_have_an_account() {
        navigateTo.signUpPage();
    }

    @When("he sends required information to get the account")
    public void he_sends_required_information_to_get_the_account() throws InterruptedException {
        userSignUp.withInfo(
                UserBuilder
                        .anUser()
                        .but()
                        .withoutBirthDay()
                        .withoutEmail()
                        .build()

        );
        Thread.sleep(5000);
    }

    @Then("he should be told that the account wa created")
    public void he_should_be_told_that_the_account_wa_created() {

    }
}
