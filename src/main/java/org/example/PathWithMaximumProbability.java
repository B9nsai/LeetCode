package org.example;

/**
 * <h3>Path with Maximum Probability</h3>
 * <p>You are given an undirected weighted graph of n nodes (0-indexed), represented by an edge list where edges[i] = [a, b] is an undirected edge connecting the nodes a and b with a probability of success of traversing that edge succProb[i].</p>
 * <br>
 * <p>Given two nodes start and end, find the path with the maximum probability of success to go from start to end and return its success probability.</p>
 * <br>
 * <p>If there is no path from start to end, return 0. Your answer will be accepted if it differs from the correct answer by at most 1e-5.</p>
 *
 * <h3>constraints</h3>
 * <ul>
 *     <li>2 <= n <= 10^4</li>
 *     <li>0 <= start, end < n</li>
 *     <li>start != end</li>
 *     <li>0 <= a, b < n</li>
 *     <li>a != b</li>
 *     <li>0 <= succProb.length == edges.length <= 2*10^4</li>
 *     <li>0 <= succProb[i] <= 1</li>
 *     <li>There is at most one edge between every two nodes.</li>
 * </ul>
 */
public class PathWithMaximumProbability {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        return 0.0;
    }
}
