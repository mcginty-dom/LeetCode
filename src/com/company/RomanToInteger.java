package com.company;

public class RomanToInteger {

    private static int convertRoman(char c, boolean subtract) {
        int result = 0;
        switch (c) {
            case 'I':
                result = 1;
                break;
            case 'V':
                if (subtract) {
                    result = 4;
                } else {
                    result = 5;
                }
                break;
            case 'X':
                if (subtract) {
                    result = 9;
                } else {
                    result = 10;
                }
                break;
            case 'L':
                if (subtract) {
                    result = 40;
                } else {
                    result = 50;
                }
                break;
            case 'C':
                if (subtract) {
                    result = 90;
                } else {
                    result = 100;
                }
                break;
            case 'D':
                if (subtract) {
                    result = 400;
                } else {
                    result = 500;
                }
                break;
            case 'M':
                if (subtract) {
                    result = 900;
                } else {
                    result = 1000;
                }
                break;
            default:
                result = 0;
                break;
        }
        return result;
    }

    public static int romanToInt(String s) {
        int result = 0;
        for (int i=0; i < s.length(); i++) {
            //if I is before V or X then subtract
            if (i+1 < s.length() && (s.charAt(i) == 'I' && (s.charAt(i+1) == 'V' || s.charAt(i+1) == 'X'))) {
                result += convertRoman(s.charAt(i+1),true);
                i++;
            } else
                //if X is before L or C then subtract
                if (i+1 < s.length() && (s.charAt(i) == 'X' && (s.charAt(i+1) == 'L' || s.charAt(i+1) == 'C'))) {
                    result += convertRoman(s.charAt(i+1),true);
                    i++;
                } else
                    //if C is before D or M then subtract
                    if (i+1 < s.length() && (s.charAt(i) == 'C' && (s.charAt(i+1) == 'D' || s.charAt(i+1) == 'M'))) {
                        result += convertRoman(s.charAt(i+1),true);
                        i++;
                    } else {
                        result += convertRoman(s.charAt(i),false);
                    }
        }
        return result;
    }

    public static void main(String[] args) {
	String s = "III";
	System.out.println(s+" = "+romanToInt(s));
    }
}
