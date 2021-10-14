package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввидите пароль:");
        int password = scanner.nextInt();

        if (password == 123) {
            System.out.println(password);
            BankAccount user = new BankAccount();
            System.out.println("Hello Ms.Nurgazy Chargynov");

            System.out.println("You have 20.000");
            user.deposit(20000);
            System.out.println("Снимите желаемую сумму:");
            int money = scanner.nextInt();
            System.out.println(user.getAmount());
            while (true) {
                try {
                    user.withDraw (money);
                } catch (LimitException a) {
                    try {
                        user.withDraw((int) user.getAmount());
                    } catch (LimitException i) {
                        i.printStackTrace();
                    }
                    break;
                }


            }
        }else{
            System.out.println("Пароль не верный");
        }
    }
}
