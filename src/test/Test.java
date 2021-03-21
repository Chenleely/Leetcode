package test;

import array.RemoveDuplicates;
import array.RemoveDuplicates_two;
import array.move_zero;

public class Test {
    public static void main(String[] args) {
        int[] test={1,1,1,2,2,3};
        for(int num:test){
            System.out.print(num+"  ");
        }
        System.out.println("");
        RemoveDuplicates_two removeDuplicates_two=new RemoveDuplicates_two();
        int index=removeDuplicates_two.removeDuplicates(test);
        for(int i=0;i<index;i++){
            System.out.print(test[i]+"  ");
        }
    }
}