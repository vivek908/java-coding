// Given an array of integers, return the indices of the two numbers such that they add up to a specific target. 
// You may assume that each input would have exactly one solution, 
// and you may not use the same element twice. Input: 
// nums = [2, 7, 11, 15, 6, 3], target = 9 Output: [0, 1] [4, 5]
//  Explanation: nums[0] + nums[1] = 2 + 7 = 9, so the indices 
//  of 2 and 7 are returned as [0, 1] [4,5].

import java.util.ArrayList;
import java.util.List;

public class Target {
    public static void main(String[] args) {
        int nums[] = {2, 7, 11, 15, 6, 3};
        int target=9;
        List<int[]> result=findPairs(nums,target);
        for(int[] pair:result){
            System.out.println("["+pair[0]+" "+pair[1]+"]");
        }
    }
    private static List<int[]> findPairs(int[] nums,int target){
        List<int[]> pairs=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    pairs.add(new int[]{i,j});
                }
            }
        }
        return pairs;
    }
    
}
