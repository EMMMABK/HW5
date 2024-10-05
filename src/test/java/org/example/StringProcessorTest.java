package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//this is the test section
class StringProcessorTest {
    StringProcessor stringProcessor = new StringProcessor();
// @Test we wrote because we use when we want to test any software
    @Test
    public void testIsStrongPassword() {
        assertTrue(stringProcessor.isStrongPassword("Abc$1234"));
        assertFalse(stringProcessor.isStrongPassword("abc1234"));
        assertFalse(stringProcessor.isStrongPassword("ABC1234!"));
        assertFalse(stringProcessor.isStrongPassword("abcABC$"));
    }

    @Test
    public void testCalculateWord() {
        assertEquals(5, stringProcessor.calculateWord("This is a sample sentence"));
        assertEquals(1, stringProcessor.calculateWord("Hello"));
        assertEquals(0, stringProcessor.calculateWord("    "));
        assertEquals(0, stringProcessor.calculateWord(null));
    }

    @Test
    public void testCalculateDigits() {
        assertEquals(3, stringProcessor.calculateDigits("There are 123 digits"));
        assertEquals(0, stringProcessor.calculateDigits("No digits here"));
        assertEquals(0, stringProcessor.calculateDigits(""));
        assertEquals(0, stringProcessor.calculateDigits(null));
        assertEquals(2, stringProcessor.calculateDigits("Year: 24"));
    }

    @Test
    public void testCalculateExpression() {
        assertEquals(7.0, stringProcessor.calculateExpression("3 + 2 * 2"), 0.001);
        assertEquals(6.0, stringProcessor.calculateExpression("3 + (2 * 4) - 5"), 0.001);
        assertEquals(10.0, stringProcessor.calculateExpression("5 * 2"), 0.001);
        assertEquals(2.0, stringProcessor.calculateExpression("6 / 3"), 0.001);
    }
}