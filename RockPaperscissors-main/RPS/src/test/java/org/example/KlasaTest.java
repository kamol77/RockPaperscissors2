package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class KlasaTest {

    Klasa klasa = new Klasa();
    @Test
    void switchToArray_A_Y() {
        String input = "A Y";
        char [] expected = {'A', 'Y'};
        Assertions.assertArrayEquals(expected, klasa.switchToArray(input));
    }

    @Test
    void switchToArray_B_X() {
        String input = "B X";
        char [] expected = {'B', 'X'};
        Assertions.assertArrayEquals(expected, klasa.switchToArray(input));
    }

    @Test
    void switchToArray_C_Z() {
        String input = "C Z";
        char [] expected = {'C', 'Z'};
        Assertions.assertArrayEquals(expected, klasa.switchToArray(input));
    }

    @Test
    void switchToCorrect_A_Y() {
        char [] input = {'A', 'Y'};
        char [] expected = {'K', 'P'};
        Assertions.assertArrayEquals(expected, klasa.switchToCorrect(input));
    }

    @Test
    void switchToCorrect_B_X() {
        char [] input = {'B', 'X'};
        char [] expected = {'P', 'K'};
        Assertions.assertArrayEquals(expected, klasa.switchToCorrect(input));
    }

    @Test
    void switchToCorrect_C_Z() {
        char [] input = {'C', 'Z'};
        char [] expected = {'N', 'N'};
        Assertions.assertArrayEquals(expected, klasa.switchToCorrect(input));
    }

    @Test
    void testMyPoints_Win() {
        char[] tab = {'K', 'P'};
        Assertions.assertEquals(8, klasa.myPoints(tab));
    }

    @Test
    void testMyPoints_Draw() {
        char[] tab = {'K', 'K'};
        Assertions.assertEquals(4, klasa.myPoints(tab));
    }

    @Test
    void testMyPoints_Lose() {
        char[] tab = {'K', 'N'};
        Assertions.assertEquals(3, klasa.myPoints(tab));
    }
}