package com.charlie.app.builder.data;

import com.charlie.app.models.User;
import com.charlie.app.util.RandomNumberGenerator;
import com.charlie.app.util.enums.Gender;

public class UserBuilder {

    private User user;

    private UserBuilder() {
        user = User.builder().build();
    }

    public static UserBuilder anUser() {
        return new UserBuilder();
    }

    public UserBuilder but() {
        return withDefaultInfo();
    }

    public UserBuilder withDefaultInfo() {
        this.user = User.builder()
                .firsName("Pepito")
                .lastName("Perez")
                .email("pepitoperez@mail.com")
                .gender(Gender.male)
                .country("Colombia")
                .birthDay("10")
                .birthMonth("February")
                .birthYear("1989")
                .phone(RandomNumberGenerator.getPhoneNumberFaker())
                .password("EuLDlM2022")
                .passwordConfirmation("EuLDlM2022")
                .build();

        return this;
    }

    public UserBuilder withoutEmail() {
        user.setEmail("");
        return this;
    }

    public UserBuilder withoutBirthDay() {
        user.setBirthDay("");
        return this;
    }

    public User build() {
        return this.user;
    }
}
