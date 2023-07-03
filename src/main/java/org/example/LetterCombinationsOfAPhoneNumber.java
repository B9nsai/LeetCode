package org.example;

import java.util.*;
import java.util.stream.Collectors;


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
    private Map<Character, List<Character>> phoneButtonMap;
    public List<String> letterCombinations(String digits) {
        createPhoneButtonMap();

        List<Character> digitList = stringToCharList(digits);
        List<String> letterCombinations = new ArrayList<>();

        for (char digit : digitList) {
            letterCombinations = appendLetterFromButton(letterCombinations, digit);
        }

        return letterCombinations;
    }

    private List<String> appendLetterFromButton(List<String> letterList, Character nextDigit) {
        List<String> appendedLetterList = new ArrayList<>();
        if (letterList.size() == 0) {
            for (Character letter : phoneButtonMap.get(nextDigit)) {
                appendedLetterList.add(String.valueOf(letter));
            }
            return appendedLetterList;
        }
        for (String letters : letterList) {
            for (Character letter : phoneButtonMap.get(nextDigit)) {
                appendedLetterList.add(letters + letter);
            }
        }
        return appendedLetterList;
    }

    private void createPhoneButtonMap() {
        phoneButtonMap = new HashMap<>();

        phoneButtonMap.put('2', Arrays.asList('a', 'b', 'c'));
        phoneButtonMap.put('3', Arrays.asList('d', 'e', 'f'));
        phoneButtonMap.put('4', Arrays.asList('g', 'h', 'i'));
        phoneButtonMap.put('5', Arrays.asList('j', 'k', 'l'));
        phoneButtonMap.put('6', Arrays.asList('m', 'n', 'o'));
        phoneButtonMap.put('7', Arrays.asList('p', 'q', 'r', 's'));
        phoneButtonMap.put('8', Arrays.asList('t', 'u', 'v'));
        phoneButtonMap.put('9', Arrays.asList('w', 'x', 'y', 'z'));
    }

    private List<Character> stringToCharList(String string) {
        return string.chars().mapToObj(e->(char)e).collect(Collectors.toList());
    }
}
