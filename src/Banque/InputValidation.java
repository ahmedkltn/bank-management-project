/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banque;

/**
 *
 * @author ahmet
 */
public class InputValidation {

    public boolean isNotFilled(String str) {
        return str == null || str.length() <= 2 || str.length() >= 40;
    }

    public boolean validName(String name) {
        if (isNotFilled(name)) {
            return false;
        }
        for (char c : name.toCharArray()) {
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }

    public boolean validEmail(String email) {
        if (isNotFilled(email)) {
            return false;
        }

        // Check if email contains @ and at least one dot (.)
        if (!email.matches("[^@]+@[^@]+\\.[^.]+")) {
            return false;
        }

        return true;
    }

    public boolean validNumber(String num) {
        return num.length() == 8;
    }

    public boolean validCIN(String CIN) {
        return CIN.length() == 8;
    }

    public boolean validAmount(double amount) {
        return amount <= 0;
    }
}
