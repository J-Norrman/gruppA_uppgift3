package org.example;

import java.util.Random;

public class HashFunction {
    private static final int DESIRED_LENGTH = 32;

    public String hash(String input) {
        int hash = 0;
        for (int i = 0; i < input.length(); i++) {
            hash = hash + i + input.charAt(i);
        }

        String hashed = applyCustomHashing(hash);
        return hashed.substring(0, DESIRED_LENGTH);
    }

    private String applyCustomHashing(int hash) {
        StringBuilder hashed = new StringBuilder();
        String characterSet = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%^&*()-=_+[]{}|;':,.<>?";
        Random random = new Random(hash);
        for (int i = 0; i < DESIRED_LENGTH; i++) {
            int charValue = random.nextInt(characterSet.length());
            hashed.append(characterSet.charAt(charValue));
        }

        return hashed.toString();
    }
}
