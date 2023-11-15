package com.hemanth.problemsolving.sorting;

import java.util.ArrayList;
import java.util.List;

public class CountPairLeetcode2824 {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(-6, 2, 5, -2, -7, -1, 3));
      //  List<Integer> nums = new ArrayList<>(List.of(-1,1,2,3,1));

        int target = -2;

        System.out.println(countPair(nums, target));
    }

    public static int countPair(List<Integer> nums, int target) {


        int count = 0;
        for (int i = 0; i< nums.size(); i++){

            for (int j = i+1; j<nums.size(); j++){
                if ((nums.get(i) + nums.get(j)) < target){
                    System.out.println("("+i+","+j+") ="+(nums.get(i) + nums.get(j)));
                    count++;
                }
            }
        }

        return count;
    }
}
