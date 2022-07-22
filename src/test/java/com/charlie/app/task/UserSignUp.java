package com.charlie.app.task;

import com.charlie.app.models.User;
import com.charlie.app.page.SignUpServices;
import com.charlie.app.util.enums.Gender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.charlie.app.util.RandomNumberGenerator.getPhoneNumberFaker;

@Component
public class UserSignUp {

    @Autowired
    private SignUpServices signUpServices;

    public void withInfo(User user) {
        signUpServices.writeFirstName(user.getFirsName());
        signUpServices.writeLastName(user.getLastName());
        signUpServices.writeEmailAddress(user.getEmail());
        signUpServices.writePhone(getPhoneNumberFaker());

        selectGender(user.getGender());
        
        signUpServices.selectGenderMale();
        signUpServices.selectBirthDay(user.getBirthDay());
        signUpServices.selectBirthMonth(user.getBirthMonth());
        signUpServices.selectBirthYear(user.getBirthYear());
        signUpServices.writePassword(user.getPassword());
        signUpServices.writeConfirmPassword(user.getPasswordConfirmation());
        // signUpServices.clickOnSubmit();
    }

    private void selectGender(Gender gender) {
        if (gender == Gender.female) {
            signUpServices.selectGenderFemale();
        } else {
            signUpServices.selectGenderMale();
        }
    }
}
