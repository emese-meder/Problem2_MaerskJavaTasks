package com.spartaglobal.em.engineering50;
/*
Problem 2: String Anagram
Write a program to check if two given String is Anagram of each other.
Your function should return true if two Strings are Anagram, false otherwise.
A string is said to be an anagram if it contains the same characters and same length,
but in a different order, e.g. army and Mary are anagrams. You can ignore cases for this problem,

Please write the unit tests for your solution using any of the unit testing framework.
*/

public class StringAnagram {

    public boolean isAnagram(String string1, String string2){

        if (string1.length() != string2.length()){
            return false; //if they are not the same length they are not anagrams
        }else {
            String[] letters = new String[string1.length()]; //collect letters of string1 here
            for (int j = 0; j < string1.length(); j++) {
                letters[j] = String.valueOf(string1.charAt(j)).toLowerCase(); //add letters to array
            }
            for (String i : letters) {
                if (!string2.contains(i)) {
                    return false; //if any of the letters of string2 is not contained in string 1
                }
            }
            return true;
        }
    }
}
