package ru.netology.sqr;

public class SQRService2 {

    public int calculate(int min, int max) {
        int counter = 0;
        for (int i = 1; i <= 10; i++) {
            int ii = i * i;
            if (ii >= min) {
                if (ii <= max) {
                    counter++;

                }

            }

        }
        return counter;
    }
}
