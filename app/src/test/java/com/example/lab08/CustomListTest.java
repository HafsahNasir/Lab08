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

}
