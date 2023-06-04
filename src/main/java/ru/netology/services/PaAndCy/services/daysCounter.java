package ru.netology.services.PaAndCy.services;
public class daysCounter {

    public int count(int income, int expenses, int threshold) {
        int money = 0;
        int count = 0;


        for (int month = 1; month < 13; month++) {
            if (money < threshold) {
                money = money + income - expenses;
            } else {
                money = (money - expenses) / 3;
                count = count + 1;
            }
        }
        return count;

    }
}