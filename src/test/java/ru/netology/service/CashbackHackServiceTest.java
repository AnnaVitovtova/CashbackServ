package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemainMax() {
        int amount = 900;
        int expected = 100;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void testRemainMin() {
        int amount = 100;
        int expected = 900;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }
    @Test
    public void testRemain() {
        int amount = 500;
        int expected = 500;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }
    @Test
    public void testRemainZero() {
        int amount = 0;
        int expected = 1000;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }
    @Test
    public void testShouldRemain() {
        int amount = 1000;
        int expected = 0;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }
}