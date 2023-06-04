package ru.netology.services.PaAndCy.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class daysCounterTest {

    @ParameterizedTest
    @CsvSource({
            "10000,3000,20000,3",
            "100000,60000,150000,2",

    })
    public void test(int income, int expenses, int threshold, int expected) {
        daysCounter service = new daysCounter();
        int actual = service.count(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
