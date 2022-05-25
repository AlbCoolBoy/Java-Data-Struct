package 算法.排序;

public class InsertSort {
    public static void main(String[] args) {
        int []a=new int[]{2,3,7,1,9,5};
        insertSort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }


    private static void insertSort(int[] a) {
        int insertVal=0;
        int insertIndex=0;
        for(int i=1;i<a.length;i++){
            insertVal=a[i]; //当前的需要进行插入的元素
            insertIndex=i-1;//这个数前面的下标

            while(insertIndex>=0&&insertVal<a[insertIndex])
            {
                a[insertIndex+1]=a[insertIndex];
                insertIndex--;
            }
            //当while循环结束的时候，说明算法已经将元素插入了正确的位置
            a[insertIndex+1]=insertVal;

        }
    }

}
