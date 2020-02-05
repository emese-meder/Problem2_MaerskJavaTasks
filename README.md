# Problem 2 - String Anagram

* Number Two of the six java coding challenges for beginners by Maersk for Sparta Global Academy.

Write a program to check if two given String is Anagram of each other. Your function should return true if two Strings are Anagram, false otherwise. A string is said to be an anagram if it contains the same characters and same length, but in a different order, e.g. army and Mary are anagrams. You can ignore cases for this problem,

Please write the unit tests for your solution using any of the unit testing framework.

## Instructions to build and run the code

    1. Open the project in Intellij
    2. Navigate to the App.java file in the project explorer
    3. Run the main method

* Note: App.java can be found in Problem2_MaerskJavaTasks\StringAnagram\src\main\java\com\spartaglobal\em\engineering50\App.java

* In main, the isAnagram() method accepts two Strings as the input and returns True if they are anagrams of each other and False otherwise.

## Platform limitations

* No notable limitations for Intellij.

## Dependencies

* JUnit 5.6.0 https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api 

## Assumptions

* if they are not the same length they are not anagrams.


## Improvements

* Currently the method doesn't pass the last test (same length, same letters, but non anagrams, eg.: "utt" and "tuu"
