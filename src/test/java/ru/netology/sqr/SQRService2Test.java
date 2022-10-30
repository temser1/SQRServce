package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRService2Test {

    @Test
    public void calculateTest(){
        SQRService service = new SQRService();
        int actual = service.calculate(81, 121);
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }
}