package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        // This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        City edmonton = new City("Edmonton", "AB");
        City toronto = new City("Toronto", "ON");
        list.addCity(calgary);
        list.addCity(edmonton);
        list.addCity(toronto);

        // Delete Edmonton
        list.deleteCity(edmonton);

        // Edmonton should not be present
        assertFalse(list.hasCity(edmonton));
        // Calgary and Toronto should still be present
        assertTrue(list.hasCity(calgary));
        assertTrue(list.hasCity(toronto));
    }

    @Test
    public void testCountCities() {
        CustomList list = new CustomList();
        // Initially, the count should be 0
        assertEquals(0, list.countCities());

        City calgary = new City("Calgary", "AB");
        City edmonton = new City("Edmonton", "AB");
        City toronto = new City("Toronto", "ON");

        list.addCity(calgary);
        assertEquals(1, list.countCities());

        list.addCity(edmonton);
        assertEquals(2, list.countCities());

        list.addCity(toronto);
        assertEquals(3, list.countCities());

        // Delete one city
        list.deleteCity(edmonton);
        assertEquals(2, list.countCities());
    }

}
