package test;

import algrithms.Heap;
import algrithms.HeapSort;
import answer.num_1;
import array.RemoveDuplicates;
import array.RemoveDuplicates_two;
import array.ReverseVowels;
import array.ThreeSum;
import array.move_zero;

public class Test {
    public static void main(String[] args) {
        int[] test={13,21,16,24,31,19,68,65,26,32,3,1002,88,44,99};
        Heap heap=new Heap(test);
        for(int num:test){
            System.out.print(num+" ");
        }
        System.out.println(" ");
        for(int num:heap.getArray()){
            System.out.print(num+" ");
        }
        System.out.println(" ");
        heap.HeapSort(test);
        for(int num:heap.getArray()){
            System.out.print(num+" ");
        }
        

        
        
    }
}