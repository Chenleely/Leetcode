package test;

import algrithms.Heap;
import algrithms.HeapSort;
import array.RemoveDuplicates;
import array.RemoveDuplicates_two;
import array.ReverseVowels;
import array.ThreeSum;
import array.move_zero;

public class Test {
    public static void main(String[] args) {
        int[] test={5,3,7,0,1,9};
        HeapSort sort=new HeapSort();
        for(int num:test){
            System.out.print(num+" ");
        }
        System.out.println(" ");
        sort.sort(test);
        for(int num:test){
            System.out.print(num+" ");
        }
    }
}