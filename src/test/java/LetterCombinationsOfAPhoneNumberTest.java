import org.example.LetterCombinationsOfAPhoneNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LetterCombinationsOfAPhoneNumberTest {
    LetterCombinationsOfAPhoneNumber letterCombinationsOfAPhoneNumber;
    @BeforeEach
    void setup() {
        letterCombinationsOfAPhoneNumber = new LetterCombinationsOfAPhoneNumber();
    }

    @Test
    void shouldAppendNoDigitsOnEmptyInput(){
        String digits = "";

        List<String> actual = letterCombinationsOfAPhoneNumber.letterCombinations(digits);
        List<String> expected = new ArrayList<>();

        Assertions.assertEquals(0, actual.size());
        Assertions.assertTrue(expected.containsAll(actual));
    }

    @Test
    void shouldAppendAllPossibleCombinations(){
        String digits = "23";

        List<String> actual = letterCombinationsOfAPhoneNumber.letterCombinations(digits);
        List<String> expected = Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");

        Assertions.assertEquals(expected.size(), actual.size());
        Assertions.assertTrue(expected.containsAll(actual));
    }
}
