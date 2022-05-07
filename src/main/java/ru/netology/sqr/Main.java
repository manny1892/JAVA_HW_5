package ru.netology.sqr;

public class Main {
    public static void main(String[] args) {

        SQRService service = new SQRService();
        int result = service.rangeValue(0, 99);
        System.out.println("Количество квадратов = " + result);
    }
}
