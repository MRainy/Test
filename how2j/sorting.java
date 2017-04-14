package cn.primary.com;

/**
 * Created by Rain on 2017/4/13.
 *
 * 首先创建一个长度是5的数组,并填充随机数。 (向数组填充随机数的办法，参考这里)
 首先用选择法正排序，然后再对其使用冒泡法倒排序
 * 选择排序的思想非常直接，不是要排序么？那好，我就从所有序列中先找到
 * 最小的，然后放到第一个位置。之后再看剩余元素中最小的，
 * 放到第二个位置……以此类推，就可以完成整个的排序工作了。
 */
public class sorting {

    public static void test(int[]a){//用选择排序法
        /*
        经过N-1次排序后变为有序序列。
        (1)从待排序序列中，找到关键字最小的元素；
        (2)如果最小元素不是待排序序列的第一个元素，将其和第一个元素互换；
        (3)从余下的 N - 1 个元素中，找出关键字最小的元素，重复(1)、(2)步，直到排序结束
        */
        /*int[] a = new int[5];
        for (int i=0;i<a.length;i++){
            a[i]=(int)(Math.random()*100);
            System.out.print(a[i]+"\t");//转义字符的用法
        }*/
        System.out.println();
        for (int i = 0; i <a.length-1 ; i++) {
            int min = a[i];
            int temp=0;
            int index=i;
            for (int j = i+1; j <a.length ; j++) {
                if (a[j]<min) {
                    min=a[j];
                    index=j;
                }

            }
            temp=a[i];
            a[i]=min;
            a[index]=temp;
        }
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+"\t");//转义字符的用法
        }
    }

    public static void test01(int[] a){//用冒泡法排序
        /*int[] a = new int[5];
        for (int i=0;i<a.length;i++){
            a[i]=(int)(Math.random()*100);
            System.out.print(a[i]+"\t");//转义字符的用法
        }*/
        /*
         每一趟排序找出最大/小值，将最值放到开头/末尾，这是选择排序法和冒泡排序法的
         相通之处，但最终如何实现将最值放置在开头/末尾稍有差别。
         1.比较相邻的元素。如果第一个比第二个大，就交换他们两个。
         2.对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。
         3.针对所有的元素重复以上的步骤，除了最后一个。
         4.持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较
        */
        int temp=0;
        for (int i = 0; i <a.length-1 ; i++) {
            for (int j = 0; j <a.length-1-i ; j++) {
                if (a[j]<a[j+1]) {
                    temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+"\t");//转义字符的用法
        }
    }

    public static void main(String[] args) {
        int[] a = new int[5];
        for (int i=0;i<a.length;i++){
            a[i]=(int)(Math.random()*100);
            System.out.print(a[i]+"\t");//转义字符的用法
        }
        test(a);//数组作为参数传递
        System.out.println();
        test01(a);
    }
}
