import org.example.TwoSum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TwoSumTest {
    private TwoSum twoSum;
    @BeforeEach
    void setup() {
        twoSum = new TwoSum();
    }
    @Test
    void shouldReturnCorrectIndices() {
        int[] nums = {2,7,11,15};
        int target = 9;

        int[] actual = twoSum.twoSum(nums, target);
        int[] expected = {0, 1};

        for (int i = 0; i < 2; i++) {
            Assertions.assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    void shouldNotUseTheSameElementTwice() {
        int[] nums = {3, 3};
        int target = 6;

        int[] actual = twoSum.twoSum(nums, target);
        int[] expected = {0, 1};

        for (int i = 0; i < 2; i++) {
            Assertions.assertEquals(expected[i], actual[i]);
        }
    }
}
