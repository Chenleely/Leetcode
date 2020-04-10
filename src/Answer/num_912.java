package Answer;

import java.util.Random;
public class num_912 {
    public static final Random RANDOM=new Random();
    /*ublic static void main(String[] args) {
        num_912 n=new num_912();
        int test[]={5,2,3,1};
        n.QuickSort(test,0,test.length-1);
        for(int i=0;i<test.length;i++)
        System.out.println(test[i]);

    }*/
    //quicksort
    public int[] QuickSort(int[] nums,int left,int right){
        int i,j;
        if(right-left>0){
            int center=PartIntion(nums,left,right);
            QuickSort(nums,left,center-1);
            QuickSort(nums,center+1,right);
        }
        return nums;
    }
    public int PartIntion(int[] nums,int left,int right){
        int randomIndex = RANDOM.nextInt(right - left + 1) + left;
        swap(nums, left, randomIndex);
        // 基准值
        int pivot = nums[left];
        int lt = left;
        // 循环不变量：
        // all in [left + 1, lt] < pivot
        // all in [lt + 1, i) >= pivot
        for (int i = left + 1; i <= right; i++) {
            if (nums[i] < pivot) {
                lt++;
                swap(nums, i, lt);
            }
        }
        swap(nums, left, lt);
        return lt;
    }

    //shellsort Increment=1 2 4 8 ....
    public int[] ShellSort(int[] nums){
        int Increment,length,tmp,i,j;
        length=nums.length;
        for(Increment=length/2;Increment>0;Increment/=2){
            for(i=Increment;i<length;i++){
            tmp=nums[i];
                for(j=i;j-Increment>=0&&tmp<nums[j-Increment];j-=Increment){
                     swap(nums,j,j-Increment);
                }
            }
        }
        return nums;
    }
    public static void  swap(int[] nums,int i,int j){
            int tmp;
            tmp=nums[i];
            nums[i]=nums[j];
            nums[j]=tmp;
    }

    //mergesort

}
