package ru.netology.service;

public class CustomsService {
    public static final double DUTY_WEIGH = 100;
    public static int calculateCastoms (int price, int weight) {
        int t1 = (int) (price * 0.01);
        int t2 = (int) (weight * DUTY_WEIGH);
        int tax = t1 + t2;
        return tax;
    }
}


