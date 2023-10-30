package de.space.burger.validation.impl;

import de.space.burger.validation.PasswordValidator;
import org.springframework.stereotype.Component;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 8/30/2023
 * SimpleApp
 *
 * @author Marsel Sidikov (AIT TR)
 */
@Component
public class PasswordValidatorImpl implements PasswordValidator {

    private static final String REGEX = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$";

    @Override
    public void validate(String password) {

        if (password == null || password.isBlank()) {
            throw new IllegalArgumentException("Пароль не может быть пустым");
        }

        Pattern pattern = Pattern.compile(REGEX); // создаем шаблон
        Matcher matcher = pattern.matcher(password); // создаем проверяльщика

        if (!matcher.matches()) {
            throw new IllegalArgumentException("Пароль слабый");
        }
    }
}
