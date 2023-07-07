import org.example.LongestSubarrayOf1sAfterDeletingOneElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class LongestSubarrayOf1sAfterDeletingOneElementTest {
    LongestSubarrayOf1sAfterDeletingOneElement longestSubarrayOf1sAfterDeletingOneElement;

    @BeforeEach
    void setup() {
        longestSubarrayOf1sAfterDeletingOneElement = new LongestSubarrayOf1sAfterDeletingOneElement();
    }

    @Test
    void shouldFindLongestSubarrayOfOnly1s() {
        int[] nums = {1, 1, 1, 1, 1};

        int actual = longestSubarrayOf1sAfterDeletingOneElement.longestSubarray(nums);

        Assertions.assertEquals(nums.length - 1, actual); // must delete one element
    }

    @Test
    void shouldFindLongestSubarrayOfOnly0s() {
        int[] nums = {0, 0, 0, 0, 0};

        int actual = longestSubarrayOf1sAfterDeletingOneElement.longestSubarray(nums);

        Assertions.assertEquals(0, actual);
    }

    @Test
    void shouldFindLongestSubarrayWithExactlyOne0() {
        int[] nums = {1, 1, 0, 1, 1};

        int actual = longestSubarrayOf1sAfterDeletingOneElement.longestSubarray(nums);

        Assertions.assertEquals(4, actual);
    }

    @Test
    void shouldFindLongestSubarray() {
        int[] nums = {1,1,0,0,1,1,1,0,1};

        int actual = longestSubarrayOf1sAfterDeletingOneElement.longestSubarray(nums);

        Assertions.assertEquals(4, actual);
    }

    @Test
    void shouldFindLongestSubarrayWithOneSubarray() {
        int[] nums = {0,0,1,1};

        int actual = longestSubarrayOf1sAfterDeletingOneElement.longestSubarray(nums);

        Assertions.assertEquals(4, actual);
    }
}
