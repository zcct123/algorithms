package com.zclvct.v1.v1v1;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author zhaochong
 * @version 1.0
 * @description: TODO
 * @date 2021/9/8 20:49
 */
public class test {
    public static void main(String[] args)
    {
        int M=4;
        int N=3;
        int [][] a=new int [M][N];
        for (int i = 0; i <M ; i++)
        {
            for (int j = 0; j <N ; j++)
            {
                a[i][j]=i+j;
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        int [][] b=new int[N][M];
        for (int i = 0; i <N ; i++)
        {
            for (int j = 0; j <M ; j++)
            {
                b[i][j]=a[j][i];
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
}
