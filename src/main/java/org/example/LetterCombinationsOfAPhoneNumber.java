package org.example;

import java.util.*;


/**
 * <h1>17. Letter Combinations of a Phone Number</h1>
 * <p>Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.</p>
 * <p>A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.</p>
 * <h2>example</h2>
 * <p>Input: digits = "23"</p>
 * <p>Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]</p>
 * <ul>
 *     <h3>constraints</h3>
 *     <li>0 <= digits.length <= 4</li>
 *     <li>digits[i] is a digit in the range ['2', '9'].</li>
 * </ul>
 */
public class LetterCombinationsOfAPhoneNumber {
    public List<String> letterCombinations(String digits) {
        Map<Character, List<Character>> phoneButtonMap = createPhoneButtonMap();

        return new ArrayList<>();
    }

    private Map<Character, List<Character>> createPhoneButtonMap() {
        Map<Character, List<Character>> phoneButtonMap = new HashMap<>();

        // Number 2
        phoneButtonMap.put('2', Arrays.asList('A', 'B', 'C'));

        // Number 3
        phoneButtonMap.put('3', Arrays.asList('D', 'E', 'F'));

        // Number 4
        phoneButtonMap.put('4', Arrays.asList('G', 'H', 'I'));

        // Number 5
        phoneButtonMap.put('5', Arrays.asList('J', 'K', 'L'));

        // Number 6
        phoneButtonMap.put('6', Arrays.asList('M', 'N', 'O'));

        // Number 7
        phoneButtonMap.put('7', Arrays.asList('P', 'Q', 'R', 'S'));

        // Number 8
        phoneButtonMap.put('8', Arrays.asList('T', 'U', 'V'));

        // Number 9
        phoneButtonMap.put('9', Arrays.asList('W', 'X', 'Y', 'Z'));

        return phoneButtonMap;
    }
}
