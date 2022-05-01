package ru.netology.service;

import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void testRemain1() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(900);
        int expected = 100;
        assertEquals(actual, expected);
    }
    @Test
    public void testRemain2() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(3000);
        int expected = 1000;
        assertEquals(actual, expected);
    }
    @Test
    public void testRemain3() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(999);
        int expected = 1;
        assertEquals(actual, expected);
    }
}
