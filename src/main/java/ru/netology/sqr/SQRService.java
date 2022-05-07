package ru.netology.sqr;

public class SQRService {
    public int rangeValue(int valueOne, int valueTwo) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= valueOne && i * i <= valueTwo) {
                count++;

            }
        }
        return count;
    }
}

