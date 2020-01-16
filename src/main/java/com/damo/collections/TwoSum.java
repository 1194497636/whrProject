package main.java.com.damo.collections;

import java.util.HashMap;

public class TwoSum {
    //Given nums = [2 , 7 , 11 , 15] , target = 9,
    //
    //Because nums[0] + nums[1] = 2 + 7 = 9
    //return [0,1]
    public static int[] sumTwo(int[] nums,int target){
        int len = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < len; i++){
            final Integer value = map.get(nums[i]);
            if(value != null){
                return new int[]{value, i};
            }
            map.put(target - nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2,11,7,15};
        int[] result = sumTwo(nums,9);
        System.out.println(result[0] + " " +result[1]);
    }
}
