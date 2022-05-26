package 算法.排序;

public class QuickSort {
    public static void main(String[] args) {
        int[] a = new int[]{8, 9, 1, 7, 2, 3, 5, 4, 6, 0};
        quickSort(a,0,9);
        for(int i=0;i<10;i++){
            System.out.println(a[i]);
        }
    }

    private static void quickSort(int[] array, int left, int right) {
        int l=left; //这里的l和r 是用于进行遍历的指针，相当于一堆双指针
        int r=right;
        int pivot=array[(left+right)/2];
        int temp=0;
        while(l<r){
            while(array[l]<pivot){
                l++;
            }
            while(array[r]>pivot){
                r--;
            }
            if(l>=r){
                break;
            }
            temp=array[l];
            array[l]=array[r];
            array[r]=temp;  //将两边遍历的指针进行交换
            if(array[l]==pivot){    //如果出现左边数界的值和基准值相同，就会陷入死循环
                r--;
            }
            if(array[r]==pivot){
                l++;
            }
            if(l==r){
                l++;
                r--;
            }
            if(left<r){
                quickSort(array,left,r);
            }
            if(l<right){
                quickSort(array,l,right);
            }
        }

    }


}


