package org.example;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * <h1>1493. Longest Subarray of 1's After Deleting One Element</h1>
 * <p>Given a binary array nums, you should delete one element from it.</p>
 * <p>Return the size of the longest non-empty subarray containing only 1's in the resulting array. Return 0 if there is no such subarray.</p>
 *
 * <ul>
 *     <h3>constraints</h3>
 *     <li>1 <= nums.length <= 105</li>
 *     <li>nums[i] is either 0 or 1.</li>
 * </ul>
 */
public class LongestSubarrayOf1sAfterDeletingOneElement {
    public int longestSubarray(int[] nums) {
        long count1s = count1s(nums);
        if (count1s == 0) {
            return 0;
        } else if (count1s >= nums.length - 1) {
            return nums.length - 1;
        } else if (count1s == 0) {
            return 0;
        }

        return 0;
    }

    private long count1s(int[] nums) {
        return Arrays.stream(nums).filter(num -> num == 1).count();
    }
}
