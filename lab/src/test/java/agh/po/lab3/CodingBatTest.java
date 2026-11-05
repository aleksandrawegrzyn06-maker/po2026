package agh.po.lab3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Map;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
public class CodingBatTest {

    private final CodingBat codingBat = new CodingBat();

    @Test
    void mapABTest() {
        Map<String, String> map =
                new HashMap<>(Map.of("a", "Hi", "b", "There"));

        Map<String, String> wynik = codingBat.mapAB(map);

        assertEquals(
                Map.of("a", "Hi", "b", "There", "ab", "HiThere"),
                wynik
        );

        assertSame(map, wynik);

        assertEquals(
                Map.of("a", "Hi"),
                codingBat.mapAB(new HashMap<>(Map.of("a", "Hi")))
        );

        assertEquals(
                Map.of("b", "There"),
                codingBat.mapAB(new HashMap<>(Map.of("b", "There")))
        );

        assertEquals(
                Map.of(),
                codingBat.mapAB(new HashMap<>())
        );


        assertEquals(
                Map.of("a", "x", "b", "y", "ab", "xy", "other", "ok"),
                codingBat.mapAB(new HashMap<>(
                        Map.of("a", "x", "b", "y", "ab", "old", "other", "ok")
                ))
        );

        assertEquals(
                Map.of("a", "", "b", "", "ab", ""),
                codingBat.mapAB(new HashMap<>(Map.of("a", "", "b", "")))
        );
    }

    @Test
    void wordLenTest() {
        assertEquals(
                Map.of("a", 1, "bb", 2),
                codingBat.wordLen(new String[]{"a", "bb", "a", "bb"})
        );

        assertEquals(
                Map.of("this", 4, "and", 3, "that", 4),
                codingBat.wordLen(new String[]{"this", "and", "that", "and"})
        );

        assertEquals(
                Map.of("code", 4, "bug", 3),
                codingBat.wordLen(new String[]{"code", "code", "code", "bug"})
        );

        assertEquals(
                Map.of(),
                codingBat.wordLen(new String[]{})
        );

        assertEquals(
                Map.of("", 0, "hi", 2),
                codingBat.wordLen(new String[]{"", "hi", "", "hi"})
        );
    }

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