package com.company;

public class Calculator {
    public String calculate(String[] exp){
        RomanTransformer romanTransformer = new RomanTransformer();
        int num1 = 0;
        int num2 = 0;
        String z = exp[1];

        try {
            num1 = Integer.parseInt(exp[0]);
            num2 = Integer.parseInt(exp[2]);
        } catch (NumberFormatException e){
            num1 = romanTransformer.transformToInt(exp[0]);
            num2 = romanTransformer.transformToInt(exp[2]);
            return romanTransformer.transformToRoman(calculation(num1, num2, z));
        }

        return  String.valueOf(calculation(num1, num2, z));



    }
    private int calculation(int num1, int num2, String z){
        int ans;
        if((num1 > 10||num2 >10) && (num1 < 0 || num2 < 0)){
            throw new IllegalArgumentException("Переменные должны быть не больше 10 и не меньше 0!");
        }
        switch (z) {
            case "+": ans = num1 + num2;
                break;
            case "-": ans = num1 - num2;
                break;
            case "*": ans = num1 * num2;
                break;
            case "/": ans = num1 / num2;
                break;
            default : throw new IllegalArgumentException("Ошибка! Неверно введенён оператор");
        }
        return ans;
    }
}
