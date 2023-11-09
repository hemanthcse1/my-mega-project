package com.hemanth.problemsolving.strings.easy;

public class JewelsAndStones771 {

    public static void main(String[] args) {

        String jewels = "z";
        String stones = "ZZ";


        System.out.println(numJewelsInStones(jewels,stones));

    }

    public static int numJewelsInStones(String jewels, String stones){

        int count = 0;
        for (char c: stones.toCharArray()){

            for (char d: jewels.toCharArray()){
                if (c == d){
                    count++;
                }
            }
        }

        return count;
    }
}
