package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BigmacTestSuite {
    @Test
    public void bigmacTest() {
        Bigmac bigmac = new Bigmac.Builder().
                bun(Bun.SESAME)
                .burgers("2")
                .sauce(Sauce.ISLANDS)
                .ingridients(Ingrigients.BEACON)
                .ingridients(Ingrigients.CHAMPIGNONS)
                .ingridients(Ingrigients.CUCUMBER)
                .build();
        System.out.println(bigmac);


        assertEquals(3, bigmac.getIngridients().size());
        assertEquals("Thousand Island", bigmac.getSauce());
        assertTrue(bigmac.getIngridients().contains("Beacon"));
        assertTrue(bigmac.getIngridients().contains("Cucumber"));
        assertFalse(bigmac.getIngridients().contains("Cheese"));

    }
}