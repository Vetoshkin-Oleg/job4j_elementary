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
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.codePointAt(i))) {
                break;
            } else if (i < password.length() - 1) {
                continue;
            }
            throw new IllegalArgumentException("Password should contain at least one uppercase letter");
        }
        for (int i = 0; i < password.length(); i++) {
            if (Character.isLowerCase(password.codePointAt(i))) {
                break;
            } else if (i < password.length() - 1) {
                continue;
            }
            throw new IllegalArgumentException("Password should contain at least one lowercase letter");
        }
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.codePointAt(i))) {
                break;
            } else if (i < password.length() - 1) {
                continue;
            }
            throw new IllegalArgumentException("Password should contain at least one figure");
        }
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.codePointAt(i))) {
                break;
            } else if (i < password.length() - 1) {
                continue;
            }
            throw new IllegalArgumentException("Password should contain at least one special symbol");
        }

        if ((password.toLowerCase().contains("qwerty")
                || (password.toLowerCase().contains("12345")
                || (password.toLowerCase().contains("password")
                || (password.toLowerCase().contains("admin")
                || (password.toLowerCase().contains("user"))))))) {
            throw new IllegalArgumentException(
                    "Password shouldn't contain substrings: qwerty, 12345, password, admin, user");
        }

        return password;
    }

}