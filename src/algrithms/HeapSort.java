package algrithms;

import java.util.List;

public class HeapSort {
    public void sort(int[] array){
        //
        //左儿子;2i+1   右儿子:2i+2
        //从第一个非叶子结点从下到上，从左到右调整结构
        //
        for(int size=array.length,i=size/2-1;i>=0;i--){
            adjustHeap(array, i, size);    
        }
        //每次交换最大的元素到堆底，然后调整堆，交换n次以后就可以得到一个递增的数组
        //时间复杂度为O(nlogn)
        for(int j=array.length-1;j>0;j--){
            swap(array, 0, j);
            adjustHeap(array, 0, j);
        }
    }
    //最小堆
    public void adjustHeap(int[] arr,int i,int length){
        int temp=arr[i];
        for(int k=i*2+1;k<length;k=k*2+1){
            if(k+1<length&&arr[k]<arr[k+1]){
                k++;
            }
            //比较左右儿子的大小，将左右儿子中大的一个上滤
            //如果此时temp比最小的一个还要小，那么就已经满足性质:小于它的一个子结点
            if(arr[k]>temp){
                arr[i]=arr[k];
                i=k;
            }else{
                break;
            }
        }
        arr[i]=temp;
    }
    private void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}