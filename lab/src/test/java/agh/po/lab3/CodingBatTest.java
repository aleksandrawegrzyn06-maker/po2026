package agh.po.lab3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CodingBatTest {

    private final CodingBat codingBat = new CodingBat();

    @Test
    void sumDigitsTest() {
        assertEquals(6, codingBat.sumDigits("aa1bc2d3"));
        assertEquals(8, codingBat.sumDigits("aa11b33"));
        assertEquals(0, codingBat.sumDigits("Chocolate"));
        assertEquals(0, codingBat.sumDigits(""));
        assertEquals(3, codingBat.sumDigits("abc12"));
    }
    @Test
    void nearHundredTest () {
        assertTrue(codingBat.nearHundred(93));
        assertFalse(codingBat.nearHundred(150));
        assertTrue(codingBat.nearHundred(205));
        assertTrue(codingBat.nearHundred(90));
        assertFalse(codingBat.nearHundred(89));
    }

    @Test
    void lastDigitTest () {
        assertTrue(codingBat.lastDigit(7, 17));
        assertFalse(codingBat.lastDigit(6, 17));
        assertTrue(codingBat.lastDigit(3, 113));
        }

        @Test
        void stringMatchTest () {
            assertEquals(3, codingBat.stringMatch("xxcaazz", "xxbaaz"));
            assertEquals(2, codingBat.stringMatch("abc", "abc"));
            assertEquals(0, codingBat.stringMatch("abc", "axc"));
            assertEquals(0, codingBat.stringMatch("", "abc"));
        }

        @Test
        void shiftLeftTest () {
            assertArrayEquals(
                    new int[]{2, 5, 3, 6},
                    codingBat.shiftLeft(new int[]{6, 2, 5, 3})
            );

            assertArrayEquals(
                    new int[]{2, 1},
                    codingBat.shiftLeft(new int[]{1, 2})
            );

            assertArrayEquals(
                    new int[]{1},
                    codingBat.shiftLeft(new int[]{1})
            );

            assertArrayEquals(
                    new int[]{},
                    codingBat.shiftLeft(new int[]{})
            );
        }

        @Test
        void tripleUpTest () {
            assertTrue(codingBat.tripleUp(new int[]{1, 4, 5, 6, 2}));
            assertTrue(codingBat.tripleUp(new int[]{1, 2, 3}));
            assertFalse(codingBat.tripleUp(new int[]{1, 2, 4}));
            assertFalse(codingBat.tripleUp(new int[]{1, 2}));
            assertFalse(codingBat.tripleUp(new int[]{}));
        }

    }