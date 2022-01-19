package 数据结构.线性结构.排序.冒泡排序;

import java.util.Scanner;

public class BubbleOrder {
    public static void main(String[] args) {
        System.out.println("输入要进行排序的数据的数量");
        int total;
            Scanner input=new Scanner(System.in);
        total=input.nextInt();
        int array[]=new int[total];
        System.out.println("请输入数组数据");
        for (int i = 0; i < total; i++) {
            int number=input.nextInt();
            array[i]=number;
        }
        bubble(array);
        for(int i=0;i<total;i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void bubble(int array[]){
        for(int i=0;i<array.length;i++){
            for(int j=i;j<array.length-1;j++){
                if(array[j]>array[j+1]){
                    int temp;
                    temp=array[j];
                    array[i]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }
}
