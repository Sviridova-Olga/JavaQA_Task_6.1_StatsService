package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    int[] values = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void shouldFindSum() {
        StatsService service = new StatsService();
        int actual = service.findSum(values);

        assertEquals(180, actual);
    }

    @Test
    void shouldFindAvgSum() {
        StatsService service = new StatsService();
        int actual = service.findAvgSum(values);

        assertEquals(15, actual);
    }

    @Test
    void shouldFindMaxMonth() {
        StatsService service = new StatsService();
        int actual = service.findMaxMonth(values);

        assertEquals(8, actual);
    }

    @Test
    void shouldFindMinMonth() {
        StatsService service = new StatsService();
        int actual = service.findMinMonth(values);

        assertEquals(9, actual);
    }

    @Test
    void shouldFindLessAvgSum() {
        StatsService service = new StatsService();
        int actual = service.findLessAvgSum(values);

        assertEquals(5, actual);
    }

    @Test
    void shouldFindMoreAvgSum() {
        StatsService service = new StatsService();
        int actual = service.findMoreAvgSum(values);

        assertEquals(5, actual);
    }
}