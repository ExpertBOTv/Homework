package com.hillel.diakonov.homework14;

import com.hillel.diakonov.homework.homework14.AverageNumber;
import com.hillel.diakonov.homework.homework14.SquareMatrix;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SquareMatrixTest {
    int[][] array;

    @BeforeEach
    public void setupBeforeEach() {
        array = new int[4][4];
    }

    @Test
    public void testAssertEqualsGetElementIndex() { assertEquals(true, SquareMatrix.CheckSquareMatrix(array)); }

    @Test
    public void testAssertTrueGetElementIndex() {
        assertTrue(SquareMatrix.CheckSquareMatrix(array) == true);
    }

    @Test
    public void testAssertFalseGetElementIndex() {
        assertFalse(SquareMatrix.CheckSquareMatrix(array) == false);
    }
}

