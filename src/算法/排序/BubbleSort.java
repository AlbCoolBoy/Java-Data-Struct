package 算法.排序;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        int []a=new int[10];
        Scanner scanner=new Scanner(System.in);

        for(int i=0;i<10;i++){
            int input=scanner.nextInt();
            a[i]=input;
        }
        Bubble(a);
        for(int i=0;i<10;i++){
            System.out.println(a[i]);
        }

    }

    public static void Bubble(int array[]){
        int length= array.length;
        for(int i=0;i<length;i++){
            for(int j=1;j<length-i;j++)
            {
                if(array[j]<array[j-1]){
                    int temp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                }
            }
        }
    }

}
