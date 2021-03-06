package com.charlie.app.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SignUpServices {

    @Autowired
    WebDriverWait wait;

    @Autowired
    private SignUpPageObject signUpPageObject;

    @Autowired
    private WebDriver webDriver;

    public void go(String url) {
        this.webDriver.get(url);
    }

    public void writeFirstName(String firstName) {
        this.wait.until(ExpectedConditions.visibilityOf(this.signUpPageObject.getFirstNameTextbox()));
        this.signUpPageObject.getFirstNameTextbox().sendKeys(firstName);
    }

    public void writeLastName(String lastName) {
        this.signUpPageObject.getLastName().sendKeys(lastName);
    }

    public void writeEmailAddress(String emailAddress) {
        this.signUpPageObject.getEmailAddress().sendKeys(emailAddress);
    }

    public void writePhone(String phone) {
        this.signUpPageObject.getPhone().sendKeys(phone);
    }

    public void selectGenderMale() {
        this.signUpPageObject.getGenderMale().click();
    }

    public void selectGenderFemale() {
        this.signUpPageObject.getGenderFemale();
    }

    public void selectCountry(String country) {
        this.signUpPageObject.getCountry().sendKeys(country);
    }

    public void selectBirthDay(String day) {
        this.signUpPageObject.getDateOfBirthDay().sendKeys(day);
    }

    public void selectBirthMonth(String month) {
        this.signUpPageObject.getDateOfBirthMonth().sendKeys(month);
    }

    public void selectBirthYear(String year) {
        this.signUpPageObject.getDateOfBirthYear().sendKeys(year);
    }

    public void writePassword(String password) {
        this.signUpPageObject.getPassword().sendKeys(password);
    }

    public void writeConfirmPassword(String confirmPasword) {
        this.signUpPageObject.getConfirmPassword().sendKeys(confirmPasword);
    }

    public void clickOnSubmit() {
        this.signUpPageObject.getSubmit().click();
    }


}
