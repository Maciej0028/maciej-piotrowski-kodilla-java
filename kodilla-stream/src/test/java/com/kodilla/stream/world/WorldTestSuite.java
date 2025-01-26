package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.math.BigDecimal;
import java.util.*;

public class WorldTestSuite {
    @Test
    void testGetPeopleQuantity() {
        //Given
        Country nigeria = new Country(new BigDecimal("223000000"));
        Country ethiopia = new Country(new BigDecimal("126000000"));
        Country egypt = new Country(new BigDecimal("110000000"));
        Continent africa = new Continent("Africa" , List.of(nigeria, ethiopia, egypt));

        Country china = new Country(new BigDecimal("1428000000"));
        Country india = new Country(new BigDecimal("1417000000"));
        Country japan = new Country(new BigDecimal("125000000"));
        Continent asia = new Continent("Asia" , List.of(china, india, japan));

        Country germany = new Country(new BigDecimal("84000000"));
        Country france = new Country(new BigDecimal("67000000"));
        Country italy = new Country(new BigDecimal("60000000"));
        Continent europe = new Continent("Europe" , List.of(germany, france, italy));

        Country unitedStates = new Country(new BigDecimal("334000000"));
        Country mexico = new Country(new BigDecimal("133000000"));
        Country canada = new Country(new BigDecimal("39000000"));
        Continent northAmerica = new Continent("North America", List.of(unitedStates, mexico, canada));

        Country brazil = new Country(new BigDecimal("215000000"));
        Country argentina = new Country(new BigDecimal("46000000"));
        Country colombia = new Country(new BigDecimal("52000000"));
        Continent southAmerica = new Continent("South America", List.of(brazil, argentina, colombia));

        Country australia = new Country(new BigDecimal("26000000"));
        Country papuaNewGuinea = new Country(new BigDecimal("9000000"));
        Country newZealand = new Country(new BigDecimal("5000000"));
        Continent australiaContinent = new Continent("Australia", List.of(australia, papuaNewGuinea, newZealand));

        World world = new World(List.of(africa, asia, europe, northAmerica, southAmerica, australiaContinent));
        //When
        BigDecimal totalPopulation = world.getPeopleQuantity();
        //Then
        BigDecimal expectedPopulation = new BigDecimal("4499000000");
        assertEquals(expectedPopulation, totalPopulation);
    }
}
