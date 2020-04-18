package answer;

import Algrithms.Sort;
import java.util.*;
import java.lang.reflect.Array;

public class num_16 {
    public int threeSumClosest(int[] nums, int target) {
        int i,j,k,ans,sum;
        ans=nums[0]+nums[1]+nums[2];
        for(i=0;i<nums.length;i++){
            for(j=0;i<nums.length;i++){
                for(k=0;i<nums.length;i++){
                    sum=nums[i]+nums[j]+nums[k];
                    if(Math.abs(sum-target)<Math.abs(ans-target)){
                        ans=sum;
                    }
                }
            }
        }
        return ans;
       /* HeapSort(nums);
        int ans,sum,start,end,i;
        ans=nums[0]+nums[1]+nums[2];
        for(i=0;i<nums.length;i++){
            start=i+1;end=nums.length-1;
            while (start<end){
                sum=nums[start]+nums[i]+nums[end];
                if(Math.abs(sum-target)<Math.abs(ans-target)){
                    ans=sum;
                }
                if(sum>target){
                    end--;
                }else if(sum<target){
                    start++;
                }else {
                    return ans;
                }
            }*/



    }
    public static void swap(int[] nums, int i, int j) {
        int tmp;
        tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
    private void HeapSort(int[] nums){
        int len=nums.length;
        int i;
        //BuildHeap
       for(i=len/2;i>=0;i--){
           PerDown(nums,i,len);
        }
       for(i=len-1;i>=0;i--){
           swap(nums,0,i);
           PerDown(nums,0,i);//deletemin
       }
    }
    private void PerDown(int[] nums,int i,int N){
        int child,tmp;
        for(tmp=nums[i];i*2<N;i=child){
            child=2*i;
            if(child!=N-1 && nums[child]<nums[child+1]){
                child++;
            }
            if(tmp<nums[child]){
                nums[i]=nums[child];
            }else {
                break;
            }
        }
        nums[i]=tmp;
    }
}
