package test;

import array.RemoveDuplicates;
import array.RemoveDuplicates_two;
import array.ReverseVowels;
import array.ThreeSum;
import array.move_zero;

public class Test {
    public static void main(String[] args) {
        int[] test={-1,0,1,2,-1,-4};
        ThreeSum threeSum=new ThreeSum();
        System.out.println(threeSum.threeSum(test).toString());
    }
}