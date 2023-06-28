import org.example.PathWithMaximumProbability;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PathWithMaximumProbabilityTest {
    private PathWithMaximumProbability pathWithMaximumProbability;
    @BeforeEach
    void setup() {
        pathWithMaximumProbability = new PathWithMaximumProbability();
    }

    @Test
    void shouldFindProbability() {
        int n = 3;
        int[][] edges = {{0,1},{1,2},{0,2}};
        double[] succProb = {0.5, 0.5, 0.2};
        int start = 0;
        int end = 2;

        double actual = pathWithMaximumProbability.maxProbability(n, edges, succProb, start, end);
        double expected = 0.25000;

        Assertions.assertEquals(expected, actual);
    }

    void shouldNotFindProbability() {
        int n = 3;
        int[][] edges = {{0,1}};
        double[] succProb = {0.5};
        int start = 0;
        int end = 2;

        double actual = pathWithMaximumProbability.maxProbability(n, edges, succProb, start, end);
        double expected = 0.0;

        Assertions.assertEquals(expected, actual);
    }
}
