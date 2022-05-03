package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackerTest {

    @Test
    public void shouldLowBorderLessAmount() {
        CashbackHacker service = new CashbackHacker();
        int expected = 1000;
        int actual = service.remain(-1);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldLowBorderAmount() {
        CashbackHacker service = new CashbackHacker();
        int expected = 1000;
        int actual = service.remain(0);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldLowBorderGreaterAmount() {
        CashbackHacker service = new CashbackHacker();
        int expected = 999;
        int actual = service.remain(1);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldIntermediateAmount() {
        CashbackHacker service = new CashbackHacker();
        int expected = 500;
        int actual = service.remain(500);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldHighBorderLessAmount() {
        CashbackHacker service = new CashbackHacker();
        int expected = 1;
        int actual = service.remain(999);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldHighBorderAmount() {
        CashbackHacker service = new CashbackHacker();
        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldHighBorderGreaterAmount() {
        CashbackHacker service = new CashbackHacker();
        int expected = 999;
        int actual = service.remain(1001);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldHighIntermediateAmount() {
        CashbackHacker service = new CashbackHacker();
        int expected = 350;
        int actual = service.remain(4650);
        assertEquals(actual, expected);
    }

}