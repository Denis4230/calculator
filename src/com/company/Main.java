package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Класс вызываем для ввода символов с консоли
        System.out.println("Введите пример через пробел, для вывода ответа нажмите Enter. Пример (1 + 1) Enter"); //инструкция
        System.out.println("Переменные не должны быть больше 10!");
        System.out.println("Для выхода из програмы введите q\nВведите пример: ");

        Calculator calculator = new Calculator();


        while (scanner.hasNext()) {
            double ans;
            String exp = "";
            String[] arrExp;

            exp = scanner.nextLine();
            if (exp.equals("q")) {
                break;
            }
            try {
                arrExp = splitExp(exp);
            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());
                continue;
            }

            System.out.println(calculator.calculate(arrExp));
            System.out.println("Введите пример через пробел, для вывода ответа нажмите Enter. Пример (1 + 1) Enter"); //инструкция
            System.out.println("Переменные не должны быть больше 10!");
            System.out.println("Для выхода из програмы введите q\nВведите пример: ");
        }
    }
        public static String[] splitExp (String exp){
            String[] a = exp.split(" ");
            if(a.length < 3) {
                throw new IllegalArgumentException("Введены не корректные данные");
            }
            return a;
        }

}
