package com.hillel.diakonov.homework14;

import com.hillel.diakonov.homework.homework14.AverageNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AverageNumberTest {

    int[] array;

    @BeforeEach
    public void setupBeforeEach() {
        array = new int[] {1, 2, 3, 4, 5};
    }

    @Test
    public void testAssertEqualsGetElementIndex() { assertEquals(3, AverageNumber.getAverageNum(array)); }

    @Test
    public void testAssertTrueGetElementIndex() {
        assertTrue(AverageNumber.getAverageNum(array) == 3);
    }

    @Test
    public void testAssertFalseGetElementIndex() {
        assertFalse(AverageNumber.getAverageNum(array) == 4);
    }
}
