package org.example;

public class Main {

    public static void main(String[] args) {
        HashFunction customHash = new HashFunction();
        String input = "Fredrik123";
        String customHashedPassword = customHash.hash(input);
        System.out.println("Custom Hashed Password: " + customHashedPassword);
        String changedInput = "Fredrik124";
        String changedHashedPassword = customHash.hash(changedInput);
        System.out.println("Changed Hashed Password: " + changedHashedPassword);

    }




}