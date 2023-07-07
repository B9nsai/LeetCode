package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * <a href="https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/"><h1>1493. Longest Subarray of 1's After Deleting One Element</h1></a>
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
        }

        return getSizeOfLongestSubarray(get1sSubarrays(nums));
    }

    private int getSizeOfLongestSubarray(List<Subarray> subarrays) {
        int max = 0;
        for (Subarray subarray : subarrays) {
            if (subarray.isNextToSubarray()) {
                max = Math.max(subarray.getCombinedSizeOfNextSubarray(), max);
            } else {
                max = Math.max(subarray.getSize(), max);
            }
        }
        return max;
    }

    private List<Subarray> get1sSubarrays(int[] nums) {
        List<Subarray> subarrays = new ArrayList<>();
        int from = -1;
        int to = -1;

        for (int i = 0; i < nums.length; i++) {
            if (from == -1) {
                if (nums[i] == 1) {
                    from = i;
                    to = i + 1;
                }
            } else if (nums[i] == 1) {
                to = i + 1;
            } else {
                if (subarrays.isEmpty()) {
                    subarrays.add(new Subarray(from, to));
                } else {
                    subarrays.add(new Subarray(from, to, subarrays.get(subarrays.size() - 1)));
                }
                from = -1;
                to = -1;
            }
        }
        if (from != -1) {
            subarrays.add(new Subarray(from, to, subarrays.get(subarrays.size() - 1)));
        }

        return subarrays;
    }

    private long count1s(int[] nums) {
        return Arrays.stream(nums).filter(num -> num == 1).count();
    }

    private static class Subarray {
        private final int from;
        private final int to;
        private final int size;

        private final Subarray next;

        private final boolean hasNext;

        public Subarray(int from, int to) {
            this.from = from;
            this.to = to;
            size = to - from;

            next = null;
            hasNext = false;
        }

        public Subarray(int from, int to, Subarray next) {
            this.from = from;
            this.to = to;
            this.size = to - from;

            this.next = next;
            hasNext = true;
        }

        public int getCombinedSizeOfNextSubarray() {
            return size + (next != null ? next.size : 0);
        }

        public boolean isNextToSubarray() {
            return hasNext && from - 1 == Objects.requireNonNull(next).getTo();
        }

        public int getTo() {
            return to;
        }

        public int getSize() {
            return size;
        }
    }
}