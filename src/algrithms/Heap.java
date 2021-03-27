package algrithms;

import answer.num_1;

//MinHeap
public class Heap {
    private int[] array;
    private int size;
    private int capacity;
    public Heap(final int[] nums){
        size=nums.length;
        capacity=size*2;
        array=new int[size];
        for(int i=0;i<size;i++){
            array[i]=nums[i];
        }
        buildHeap();
    }
    private void buildHeap(){
        for(int i=size/2-1;i>=0;i--){
            adjustHeap(array, i, size);
        }
    }
    // 
    //构造最大堆
    // 
    private void adjustHeap(int[] array,int index,int length){
        int tmp=array[index];
        // for(int child=index*2+1;child<length;child=child*2+1){
        //     if(child+1<length&&array[child]>array[child+1]){
        //         child++;
        //     }
        //     if(array[child]<tmp){
        //         array[index]=array[child];
        //         index=child;
        //     }else{
        //         break;
        //     }
        // }
        while(index*2+1<length){
            int child=index*2+1;
            if(child+1<length&&array[child]>array[child+1]){
                child++;
            }
            if(array[child]<tmp){
                array[index]=array[child];
            }else{
                break;
            }
            index=child;
        }
        array[index]=tmp;
    }
    public void insert(int x){
        int hole=size++;
        while(hole/2-1>0){
            if(array[hole/2-1]>x){
                array[hole]=array[hole/2-1];
            }else{
                break;
            }
            hole=hole/2-1;
        }
        array[hole]=x;
    }
    public int[] getArray() {
        return array;
    }
    public void HeapSort(int[] arr){
        for(int size=arr.length,i=size/2-1;i>=0;i--){
            adjustHeap(arr, i, size);    
        }
        for(int j=arr.length-1;j>0;j--){
            swap(array, 0, j);
            adjustHeap(array, 0, j);
        }
    }
    private void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}