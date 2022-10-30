package ru.netology.sqr;


public class SQRService3 {

    public int calculate(int min, int max) {
        int counter = 0;
        for (int i = 0; i <= 50; i++) {
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
