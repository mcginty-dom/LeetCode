package com.company;

public class Palindrome {

    public static boolean isPalindrome(int x) {
        String palin = Integer.toString(x);
        int max = palin.length()-1;
        boolean result = true;
        for (int i=0; i < max; i++) {
            if (palin.charAt(i) != palin.charAt(max-i)) {
                result = false;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int x = 12121;
        if (isPalindrome(x)) {
            System.out.println(x+" is a palindrome!");
        } else {
            System.out.println(x+" is not a palindrome...");
        }
    }

}
