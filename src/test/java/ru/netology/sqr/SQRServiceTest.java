package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = {"/testdata.csv"})
    public void test(int valueOne, int valueTwo, int expected) {
        SQRService service = new SQRService();

        int actual = service.rangeValue(valueOne, valueTwo);

        Assertions.assertEquals(expected, actual);


    }
}
