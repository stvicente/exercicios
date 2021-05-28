package br.com.bootcamp.domain;

public class ToRoman {
    public static String toRoman(int num) {
        String[] romanCharacters = { "M", "CM", "D", "C", "XC", "L", "X", "IX", "V", "I" };
        int[] romanValues = { 1000, 900, 500, 100, 90, 50, 10, 9, 5, 1 };
        String result = "";

        for (int i = 0; i < romanValues.length; i++) {
            int numberInPlace = num / romanValues[i];
            if (numberInPlace == 0) continue;
            result += numberInPlace == 4 && i > 0? romanCharacters[i] + romanCharacters[i - 1]:
                    new String(new char[numberInPlace]).replace("\0",romanCharacters[i]);
            num = num % romanValues[i];
        }
        return result;
    }

    public static String main(String[] args) {
        if(args.length<1 || args.length>1){
            return "Wrong input";
        }else{
            String number = args[0];
            int decimal = Integer.parseInt(number);
            return toRoman(decimal);
        }
    }
}
