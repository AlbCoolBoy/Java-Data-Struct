package 算法.排序;

import java.util.Scanner;


public class BubbleSort {
    public static void main(String[] args) {
        int []a=new int[]{2,3,7,1,9,5};
        bubbleSort_better(a);
        for(int i=0;i<a.length;i++) {
            System.out.println(a[i]);
        }
    }
    private static void bubbleSort(int[] a) {
        int temp=0;
        int length=a.length;
        for(int i=0;i<length-1;i++){
            for(int j=0;j<length-i-1;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
    //可以对冒泡排序的函数进行优化，如果其中某一趟没有发生交换，就提前结束操作
    private static void bubbleSort_better(int a[]){
        int temp=0;
        int length=a.length;
        for(int i=0;i<length-1;i++){
            boolean exchange=true;
            for(int j=0;j<length-1-i;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    exchange=true;
                }else{
                    exchange=false;
                }
            }
            if(exchange==false){
               break;
            }
        }
    }
}
