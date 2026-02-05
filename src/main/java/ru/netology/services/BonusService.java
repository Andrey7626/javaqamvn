package ru.netology.services;

public class BonusService {
    public int calculate(int income, int expenses, int threshold) {
        int money = 0;
        int counter = 0;

        for (int i = 0; i < 12; i++) {
            if (money >= threshold) {
                // отдыхаем
                money = money - expenses;
                money = money / 3;
                counter++;
            } else {
                // работаем
                money = money + income;
                money = money - expenses;
            }
        }

        return counter;
    }
}
