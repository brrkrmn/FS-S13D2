package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean isPalindrome(int value) {
        String[] chars = String.valueOf(value).replace("-", "").split("");
        for (int i = 0; i < chars.length / 2; i++) {
            if (!chars[i].equals(chars[chars.length - 1 - i])) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPerfectNumber(int value) {
        if (value < 0) return false;

        int total = 0;

        for (int i = 1; i < value; i++) {
            if (value % i == 0) {
                total += i;
            }
        }

        return total == value;
    }

    public static String numberToWords(int value) {
        if (value < 0) return "Invalid Value";

        String[] nums = String.valueOf(value).split("");
        String[] words = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String result = "";

        for (String num: nums) {
            result = result.concat(words[Integer.parseInt(num)]).concat(" ");
        }

        return result.trim();
    }
}
