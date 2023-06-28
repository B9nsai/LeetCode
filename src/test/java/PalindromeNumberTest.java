import org.example.PalindromeNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PalindromeNumberTest {
    private PalindromeNumber palindromeNumber;
    @BeforeEach
    void setup() {
        palindromeNumber = new PalindromeNumber();
    }

    @ParameterizedTest
    @ValueSource(ints = {121, 66})
    void shouldFindPalindrome(int number) {
        boolean actual = palindromeNumber.isPalindrome(number);

        Assertions.assertTrue(actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {-121, })
    void shouldNotFindPalindrome(int number) {
        boolean actual = palindromeNumber.isPalindrome(number);

        Assertions.assertFalse(actual);
    }
}
