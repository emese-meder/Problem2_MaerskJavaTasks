package com.spartaglobal.em.engineering50;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestStringAnagram {

    StringAnagram anagram = new StringAnagram();
    @Test
    public void testItReturnsTrueFormAnagrams() {
        assertTrue( anagram.isAnagram("mary", "army") );
    }

    @Test
    public void testItReturnsTrueFormAnagramsAndIgnoresCase() {
        assertTrue( anagram.isAnagram("Mary", "army") );
    }

    @Test
    public void testItReturnsFalseForNonAnagrams() {
        assertFalse( anagram.isAnagram("spear", "army") );
    }

    @Test
    public void testItReturnsFalseStringWithNumbers() {
        assertTrue( anagram.isAnagram("152", "125") );
    }

    @Test
    public void testItReturnsFalseStringWithSpecialCharacters() {
        assertTrue( anagram.isAnagram("yes?", "?sye") );
    }

    @Test
    public void testDifferentLengthStringsReturnFalseEvenIfSameLetters(){
        assertFalse(anagram.isAnagram("no", "noo"));
    }

    @Test
    public void testSameLengthSameLetterButNOtAnagram(){
        assertFalse(anagram.isAnagram("non", "noo"));
    }

}
