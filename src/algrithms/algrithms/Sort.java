package algrithms;
import java.util.Random;

public class Sort {
    public static void swap(int[] nums, int i, int j) {
        int tmp;
        tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
    public static final Random RANDOM = new Random(25);
    private static final int N=200000;

   /* public static void main(String[] args) {
        Sort n = new Sort();
        int[] test = new int[N];
        int[] temp=new int[test.length];

        for (int j = 0; j <N ; j++) {
            test[j] = RANDOM.nextInt(20000000);
        }
        long starttime=System.currentTimeMillis();
        n.MergeSort(test,0,test.length-1,temp);
        //n.QuickSort(test,0,test.length-1);
        //n.InsertSort(test);
        for (int i = 0; i < test.length; i++)
            System.out.println(test[i]);
        long endtime=System.currentTimeMillis();
        long totaltime=endtime-starttime;
        System.out.println("The total time of sortion is "+totaltime+"ms");
    }*/

    //quicksort
    public void QuickSort(int[] nums, int left, int right) {
        int i, j;
        if (right - left > 0) {
            int center = PartIntion(nums, left, right);
            QuickSort(nums, left, center - 1);
            QuickSort(nums, center + 1, right);
        }
    }

    public int PartIntion(int[] nums, int left, int right) {
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
    public int[] ShellSort(int[] nums) {
        int Increment, length, tmp, i, j;
        length = nums.length;
        for (Increment = length / 2; Increment > 0; Increment /= 2) {
            for (i = Increment; i < length; i++) {
                tmp = nums[i];
                for (j = i; j - Increment >= 0 && tmp < nums[j - Increment]; j -= Increment) {
                    swap(nums, j, j - Increment);
                }
            }
        }
        return nums;
    }


    //mergesort
    public void MergeSort(int[] nums, int left, int right,int[] temp) {

        if (left < right) {
            int center = (left + right) / 2;
            MergeSort(nums, left, center,temp);
            MergeSort(nums, center + 1, right,temp);
            Merge(nums, left, center, right,temp);
        }
    }

    public void Merge(int[] A, int left, int center, int right,int[] temp) {
        System.arraycopy(A, left, temp, left, right + 1 - left);
        int length=right-left+1;
        int i,j,k;//i,j,k分别为左边下标，右边下标，临时数组下标
        i=left;
        j=center+1;
        k=0;
        while (i<=center&&j<=right){
            if(A[i]<=A[j]){
                temp[k]=A[i];
                k++;
                i++;
            }else {
                temp[k]=A[j];
                j++;
                k++;
            }
        }

        while (i<=center){
            temp[k]=A[i];
            i++;
            k++;
        }
        while (j<=right){
            temp[k]=A[j];
            j++;
            k++;
        }
        for(i=0;i<length;i++){
            A[i+left]=temp[i];
        }
    }


    //InsertionSort
    public void InsertSort(int[] nums){
        int length=nums.length;
        int i,j;
        for(i=1;i<length;i++){
            for(j=i;j>0;j--){
                if(nums[j]<nums[j-1]){
                    swap(nums,j,j-1);
                }
            }
        }
    }
}
