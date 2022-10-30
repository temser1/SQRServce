package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRService3Test {

    @Test
    public void calculateTest(){
        SQRService service = new SQRService();
        int actual = service.calculate(1000, 2000);
        int expected = 13;

        Assertions.assertEquals(expected, actual);
    }
}