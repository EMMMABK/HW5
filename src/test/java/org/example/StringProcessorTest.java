package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringProcessorTest {
    StringProcessor stringProcessor = new StringProcessor();

    @Test
    public void testIsStrongPassword() {
        assertTrue(stringProcessor.isStrongPassword("Abc$1234"));  // Strong password
        assertFalse(stringProcessor.isStrongPassword("abc1234"));  // Missing uppercase and special char
        assertFalse(stringProcessor.isStrongPassword("ABC1234!")); // Missing lowercase
        assertFalse(stringProcessor.isStrongPassword("abcABC$"));  // Missing digit
    }

    @Test
    public void testCalculateWord() {
        assertEquals(5, stringProcessor.calculateWord("This is a sample sentence"));
        assertEquals(1, stringProcessor.calculateWord("Hello"));
        assertEquals(0, stringProcessor.calculateWord("    "));     // Empty sentence
        assertEquals(0, stringProcessor.calculateWord(null));       // Null sentence
    }

    @Test
    public void testCalculateDigits() {
        assertEquals(3, stringProcessor.calculateDigits("There are 123 digits"));
        assertEquals(0, stringProcessor.calculateDigits("No digits here"));
        assertEquals(0, stringProcessor.calculateDigits(""));       // Empty string
        assertEquals(0, stringProcessor.calculateDigits(null));     // Null string
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