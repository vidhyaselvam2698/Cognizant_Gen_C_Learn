package com.cts.rainbowjewellers.test;

import com.cts.rainbowjewellers.service.RainbowJewellersService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class RainbowJewellersParameterizedTest {
    private double gram;
    private double expectedgoldprice;

    public RainbowJewellersParameterizedTest(double gram, double expectedgoldprice) {
        this.gram = gram;
        this.expectedgoldprice = expectedgoldprice;
    }

    @Parameterized.Parameters
    public static Collection inputs() {
        return Arrays.asList(new Object[][]{
                {9.6, 48401.76},
                {56, 282343.6},
                {24.5, 123525.325},
                {0, 0.0},
                {-1, -5041.85}
        });
    }

    @Test
    public void testCalculateGoldPrice() {
        RainbowJewellersService rainbowJewellersService = new RainbowJewellersService();
        double actual = rainbowJewellersService.calculategoldprice(gram);
        assertTrue(actual == expectedgoldprice);
    }
}
