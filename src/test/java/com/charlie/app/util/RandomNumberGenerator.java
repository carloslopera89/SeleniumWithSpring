package com.charlie.app.util;

import com.github.javafaker.Faker;

import java.util.Random;

public class RandomNumberGenerator {

    public static String getPhoneNumberFaker() {
        Faker faker = new Faker();
        String phoneFaker = faker.number().digits(10);
        return phoneFaker;
    }

    public static String get() {
        String firstNumber = randomNumber(11111111, 99999999);
        String secondNumber = randomNumber(11, 99);
        return String.format("%s%s", firstNumber, secondNumber);
    }

    private static String randomNumber(int min, int max) {
        Random r = new Random();
        return String.valueOf(r.nextInt((max - min) + 1) + min);
    }
}
