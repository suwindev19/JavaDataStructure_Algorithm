package lc_contest;

import java.util.ArrayDeque;
import java.util.Arrays;
/*
Printing modulo M
https://www.youtube.com/watch?v=-OPohCQqi_E

1000! number of permutations
- print only some information
17 mod 5 = 2
17 % 5 = 2
5 + 5 + 5 + 2
            ==
It has overflow
17 mod 5 = 2
5 + 5 + 5 + 2
257 * 6126 => compute by modulo 10
7 * 6 = 42
-------- 2
7 mod % 10 = 7
6 mod  % 10 = 6


A, B <10^18

(A * B) % MOD - is wrong
Thereofre
( A % mod) * (B % mod) % mod


21 - 18 mod 10 = 3

1 - 8 = -7
To fix this, there are two ways:
    1) if (answer < 0), answer += MOD
    2) ((a-b) % mod + mod) % mod

division - very hard

28/7 mod 10 , This should be 4.
28 mod 10 = 8
7 mod 10 = 7
8/7

8 * 1/7 Find inverse of 7.
Euler's Theorem
b^(pho(mod)-1)

=============================================================
5 % 2 = 1
17 % 5 = 2
7 % 9 = 7

Why is it needed? long long int 64 bits
-2^63 to +2^63-1
Integer can be as large as 9 x 10^18
n = 21 , 21!
5 * 10^19
Find factorial (25)
So that the answer still remain in the range that can be stored easily in a variable
Distributive properties
(a + b) % c = (a % c) + (b % c) % c

Modulo is distributive over +, * and -, not /
 */

// Input: nums1 = [1,7,5], nums2 = [2,3,5]
// Input: nums1 = [2,4,6,8,10], nums2 = [2,4,6,8,10]
// Input: nums1 = [1,10,4,4,2,7], nums2 = [9,3,5,1,7,4]
public class lc_5724_Minimum_Absolute_Sum_difference {
    public static void main(String[] args) {
        int[] nums1 = {1, 7, 5};
        int[] nums2 = {2, 3, 5};
        System.out.println(minAbsoluteSumDiff(nums1, nums2));


    }

    public static int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int mod = (int)1e9+7;
        int sum = 0;

        // Find the diff array
        int[] diff = new int[n];
        for (int i = 0; i < n; i++) {
            diff[i] = Math.abs(nums1[i] - nums2[i]);
            sum += diff[i];
            sum %= mod;
        }

        // Sory the array
        int[] sorted1 = new int[n];
        int[] bestDiff = new int[n];
        Arrays.sort(sorted1);
        for (int i = 0; i < n; i++) {
            // int j = lower_bound(num
            int index = Arrays.binarySearch(sorted1, nums2[i]);
            if (index != 0 && index != n) {
                int lower = Math.abs(nums2[i] - nums1[i]);
                int higher = Math.abs(nums2[i] - nums1[index-1]);
                bestDiff[i] = Math.min(lower, higher);
            } else if (index == 0) {
                bestDiff[i] = Math.abs(nums2[i] - nums1[index]);
            } else if (index < n) {
                bestDiff[i] = Math.abs(nums2[i] - nums1[index-1]);
            }
        }

        int bestSave = 0;
        for (int i = 0; i < n; i++) {
            bestSave = Math.max(bestSave, diff[i] - bestDiff[i]);
        }
        return (sum - bestSave) % mod;

    }
}





































































































