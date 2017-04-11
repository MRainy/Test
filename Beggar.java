package cn.primary.com;

import java.util.Map;

/**
 * Created by Rain on 2017/4/7.
 * 天朝有一个乞丐姓洪，去天桥要钱
 第一天要了1块钱
 第二天要了2块钱
 第三天要了4块钱
 第四天要了8块钱
 以此类推
 问题： 洪乞丐干10天，收入是多少？
 */
public class Beggar {

    /*public static int test(int n){
        int sum=0;
        if (n==1){
            return 1;
        }else {
            return sum+2*test(n-1);
        }
    }*/
    public static int test01(int n){
        int i=1;
        int count = 0+i; //第一天收入1
        for(int j=0;j<n-1;j++){//第二天开始循环
            i=i*2;
            count=count+i;
        }
        return  count;
    }

        static int sum=0;
        static int num=1;
    public static int test02(int n){
        if (num<=n){
            sum+= Math.pow(2,num-1);
            num++;
            test02(n);
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(test01(10));
        System.out.println(test02(10));


    }

}
