package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.SalesService;


public class SalesServiceTest {


    @Test
    void shouldSum() {
        SalesService service = new SalesService();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        long actual = service.sum(sales);
        long expected = 180;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldAvg() {
        SalesService service = new SalesService();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        double actual = service.avg(sales);
        long expected = 15;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldReturnMonthWithMax() {
        SalesService service = new SalesService();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int actual = service.monthWithMax(sales);
        long expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldReturnMonthWithMix() {
        SalesService service = new SalesService();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int actual = service.monthWithMax(sales);
        long expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldReturnMonthCountWithMoreThanAvg() {
        SalesService service = new SalesService();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int actual = service.moreThanAvgCount(sales);
        long expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldReturnMonthCountWithLessThanAvg() {
        SalesService service = new SalesService();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int actual = service.lessThanAvgCount(sales);
        long expected = 5;
        Assertions.assertEquals(expected, actual);
    }

}
