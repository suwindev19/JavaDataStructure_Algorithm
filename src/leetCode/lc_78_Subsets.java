package leetCode;

import java.util.ArrayList;
import java.util.List;

public class lc_78_Subsets {
    public static void main(String[] args) {
        int[] nums = {2, 1,3};
        System.out.println(subsets(nums));
        System.out.println(subsets_1(nums));
    }

    public static List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> results = new ArrayList<>();

        // check edge case
        if(nums == null || nums.length == 0) return results;

        // Subsets
        List<Integer> subset = new ArrayList<>();
        toFindAllSubsets(nums, results, subset, 0);
        return results;
    }
    // depth first search with backtracking
    private static void toFindAllSubsets(int[] nums, List<List<Integer>> results, List<Integer> subset, int startIndex){
        results.add(new ArrayList<>(subset));
        for(int i = startIndex; i < nums.length; i++){
            subset.add(nums[i]);
            toFindAllSubsets(nums, results, subset, i+1);
            subset.remove(subset.size()-1);
        }
    }

    //--------------------------------------------------------------
    // Taking the number or not taking the number for every single in the nums
    // needs return value
    // needs recursive function call to do all the work to populate the return value
    //
    // n for iteration , 2^n for recursive steps TimeO(n + 2^n)
    // Space O(n) stack tracing for recursive call
    public static List<List<Integer>> subsets_1(int[] nums){
        // return value
        List<List<Integer>> resultSubsets = new ArrayList<>();
        generateSubsets(0, nums, new ArrayList<Integer>(), resultSubsets);
        return resultSubsets;
    }

    private static void generateSubsets(int index, int[] nums, List<Integer> current, List<List<Integer>> resultSubsets){
        resultSubsets.add(new ArrayList<>(current)); // Take a copy of current and then modify . Deep copy
        // Add the current set and then walk through the remaining subsets
        for(int i = index; i < nums.length; i++){
            current.add(nums[i]);
            generateSubsets(i+1, nums, current, resultSubsets);
            current.remove(current.size()-1); // remove the last one
        }

    }

}

/*
C++ code

class Solution {
public:
    vector<vector<int>> subsets(vector<int>& nums) {
        vector<vector<int>> subs;
        vector<int> sub;
        subsets(nums, 0, sub, subs);
        return subs;
    }
private:
    void subsets(vector<int>& nums, int i, vector<int>& sub, vector<vector<int>>& subs) {
        subs.push_back(sub);
        for (int j = i; j < nums.size(); j++) {
            sub.push_back(nums[j]);
            subsets(nums, j + 1, sub, subs);
            sub.pop_back();
        }
    }
};
 */
















