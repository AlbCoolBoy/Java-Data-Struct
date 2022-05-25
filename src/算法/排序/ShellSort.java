package 算法.排序;

/*希尔排序将记录按下标的一定增量进行分组，对每组使用直接插入算法，
 * 随着增量逐渐减少，每组包含的关键词越来越多，当增量减至1的时候，
 * 整个文件被分为一组，算法终止*/
public class ShellSort {
    public static void main(String[] args) {
        int[] a = new int[]{8, 9, 1, 7, 2, 3, 5, 4, 6, 0};
        shellSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        shellSort_better(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    private static void shellSort(int[] a) {    //交换版希尔
        int temp=0;
        for(int gap=a.length-1;gap>0;gap=gap/2){
            for(int i=gap;i<a.length;i++){
                for(int j=i-gap;j>=0;j-=gap){
                    if(a[j]>a[j+gap]){
                        temp=a[j];
                        a[j]=a[j+gap];
                        a[j+gap]=temp;
                    }
                }
            }
        }
    }
    private static void shellSort_better(int []a){  //插入版希尔
        for(int gap=a.length/2;gap>0;gap=gap/2){
            for(int i=gap;i<a.length;i++){
                int j=i;
                int temp=a[j];
                if(a[j]<a[j-gap]){
                    while(j-gap>=0&&temp<a[j-gap]){
                         a[j]=a[j-gap];
                         j-=gap;
                    }
                    a[j]=temp;
                }
            }
        }

    }
}
