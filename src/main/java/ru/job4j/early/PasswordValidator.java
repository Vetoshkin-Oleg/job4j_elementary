package ru.job4j.early;

import java.util.ArrayList;
import java.util.List;

public class PasswordValidator {

    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }
        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }

        boolean isUpperSymbol = false;
        boolean isLowerSymbol = false;
        boolean isDigit = false;
        boolean isSpecialSymbol = false;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.codePointAt(i))) {
                isUpperSymbol = true;
            } else if (Character.isLowerCase(password.codePointAt(i))) {
                isLowerSymbol = true;
            } else if (Character.isDigit(password.codePointAt(i))) {
                isDigit = true;
            } else if (!Character.isLetterOrDigit(password.codePointAt(i))) {
                isSpecialSymbol = true;
            }
            if (isUpperSymbol && isLowerSymbol && isDigit && isSpecialSymbol) {
                break;
            }
        }

        if (!isUpperSymbol) {
            throw new IllegalArgumentException("Password should contain at least one uppercase letter");
        } else if (!isLowerSymbol) {
            throw new IllegalArgumentException("Password should contain at least one lowercase letter");
        } else if (!isDigit) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        } else if (!isSpecialSymbol) {
            throw new IllegalArgumentException("Password should contain at least one special symbol");
        }

        List<String> incorrectWord = List.of("qwerty", "12345", "password", "admin", "user");
        for (String word : incorrectWord) {
            if ((password.toLowerCase().contains(word))) {
                throw new IllegalArgumentException(
                        "Password shouldn't contain substrings: qwerty, 12345, password, admin, user");
            }
        }

        return password;
    }
}