package 算法.排序;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SelectSort {
    public static void main(String[] args) {
        int[] a = new int[]{2, 3, 7, 1, 9, 5, 76, 54, -9};
        selectSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        int[] b = new int[80000];
        for (int i = 0; i < b.length; i++) {
            b[i] = (int) (Math.random() * 80000);
        }
        System.out.println("排序前");
        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date1Str = simpleDateFormat.format(date1);
        System.out.println(date1Str);
        selectSort(b);
        Date date2 = new Date();
        System.out.println("排序后");
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date2Str = simpleDateFormat1.format(date2);
        System.out.println(date2Str);
    }

    private static void selectSort(int[] a) {
        int length = a.length;
        for (int i = 0; i < length - 1; i++) {
            int minindex = i;
            for (int j = i + 1; j < length; j++) {
                if (a[j] < a[minindex]) {
                    minindex = j;
                }
            }
            if (i != minindex) {
                int temp = a[i];
                a[i] = a[minindex];
                a[minindex] = temp;

            }
        }

    }
}
