 package org.example;

/**
 * <h3>9. Palindrome Number</h3>
 * Given an integer x, return true if x is a
 * palindrome, and false otherwise.
 *
 * <h4>constraints</h4>
 * -231 <= x <= 231 - 1
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String chars = String.valueOf(x);
        String firstHalf = chars.substring(0, chars.length()/2);
        int middleIndex = chars.length() % 2 == 0 ? chars.length() / 2 : chars.length() / 2 + 1;
        StringBuilder secondHalf = new StringBuilder(chars.substring(middleIndex)).reverse();

        return firstHalf.contentEquals(secondHalf);
    }
}
