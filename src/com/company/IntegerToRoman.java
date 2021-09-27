package com.company;

public class IntegerToRoman {

    // 1 <= num <= 3999
    //3999 MMM CM XC IX
    public static String intToRoman(int num) {
        String result = "";
        int value = num;
        int loop = 0;
        //for multiples of 1000, add M and subtract number by 1000
        loop = (int) (value/1000);
        for (int i=0; i < loop; i++) {
            result+="M";
            value-=1000;
        }
        //if 900/100 >= 9, then add CM and subtract number by 900
        if ((int) value/100 == 9) {
            result+="CM";
            value-=900;
        }
        //for multiples of 500, add D and subtract number by 500
        loop = (int) (value/500);
        for (int i=0; i < loop; i++) {
            result+="D";
            value-=500;
        }
        //if 400/100 >= 4, then add CD and subtract number by 400
        if ((int) value/100 == 4) {
            result+="CD";
            value-=400;
        }
        //for multiples of 100, add C and subtract number by 100
        loop = (int) (value/100);
        for (int i=0; i < loop; i++) {
            result+="C";
            value-=100;
        }
        //if 90/10 >= 9, then add XC and subtract number by 90
        if ((int) value/10 == 9) {
            result+="XC";
            value-=90;
        }
        //for multiples of 50, add L and subtract number by 50
        loop = (int) (value/50);
        for (int i=0; i < loop; i++) {
            result+="L";
            value-=50;
        }
        //if 40/10 >= 4, then add XL and subtract number by 40
        if ((int) value/10 == 4) {
            result+="XL";
            value-=40;
        }
        //for multiples of 10, add X and subtract number by 10
        loop = (int) (value/10);
        for (int i=0; i < loop; i++) {
            result+="X";
            value-=10;
        }
        //if 9/1 >= 9, then add IX and subtract number by 9
        if (value == 9) {
            result+="IX";
            value-=9;
        }
        //for multiples of 5, add V and subtract number by 5
        loop = (int) (value/5);
        for (int i=0; i < loop; i++) {
            result+="V";
            value-=5;
        }
        //if 4/1 >= 4, then add IV and subtract number by 4
        if (value == 4) {
            result+="IV";
            value-=4;
        }
        //while number is not 0, add I and subtract number by 1
        while (value!=0) {
            result+="I";
            value-=1;
        }
        //fin
        return result;
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(58));
        if (intToRoman(3).equals("III")) {
            System.out.println("Test 1: Pass");
        } else {
            System.out.println("Test 1: Fail");
        }

        if (intToRoman(4).equals("IV")) {
            System.out.println("Test 2: Pass");
        } else {
            System.out.println("Test 2: Fail");
        }

        if (intToRoman(9).equals("IX")) {
            System.out.println("Test 3: Pass");
        } else {
            System.out.println("Test 3: Fail");
        }

        if (intToRoman(58).equals("LVIII")) {
            System.out.println("Test 4: Pass");
        } else {
            System.out.println("Test 4: Fail");
        }

        if (intToRoman(1994).equals("MCMXCIV")) {
            System.out.println("Test 5: Pass");
        } else {
            System.out.println("Test 5: Fail");
        }

    }

}
