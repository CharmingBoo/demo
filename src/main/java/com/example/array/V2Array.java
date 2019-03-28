/*
 *
 *  * 文 件 名:  V2Array.java
 *  * :  
 *  * 描    述:  <描述>
 *  * 版    本： 1.0.0
 *  * 创 建 人:  wangzhao
 *  * 创建时间:  18-8-29 上午10:38
 *
 */

package com.example.array;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wangzhao
 * @version [版本号, 2018/8/29]
 * @see  [相关类/方法]
 * @since [产品/模块版本]
 */
public class V2Array
{
    private static void printArray(int[][] a) {
        for (int i = 0; i < a.length; ++i) {
            System.out.println(a[i]);
        }
        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; a[i] != null && j < a[i].length; ++j) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Example I:");
        int[][] a = new int[2][5];
        System.out.println(a.length);
        printArray(a);
        System.out.println("Example II:");
        int[][] b = new int[2][];
        printArray(b);
        System.out.println("Example III:");
        b[0] = new int[3];
        b[1] = new int[5];
        printArray(b);

        int arrs [][] = {{1,2,3},{4,5,6},{7,8,9}};
        int [] res  = findDiagonalOrder(arrs);
    }

    /**
     * 对角线遍历
     * 给定一个含有 M x N 个元素的矩阵（M行，N列），请以对角线遍历的顺序返回这个矩阵中的所有元素，对角线遍历如下图所示。
     *
     * 索引和为偶数：
     * 元素在第一行，往右走
     * 元素在最后一列，往下走
     * 其他情况，往右上走
     *
     * 索引和为奇数：
     * 元素在第一列，往下走
     * 元素在最后一行，往右走
     * 其他情况，往左下走
     * @param matrix
     * @return
     */
    public static int[] findDiagonalOrder(int[][] matrix)
    {

        if (matrix.length == 0) return new int[0];

        int m = matrix.length;
        int n = matrix[0].length;

        int r = 0;
        int c = 0;

        int [] arr = new int[m*n];

        for(int i = 0; i <m*n ; i++)
        {
            arr[i] = matrix[r][c];
            if((r+c)%2 == 0)
            {
                if(c == n-1) // 元素在最后一列，往下走
                {
                    r++;
                }
                else if(r==0) //元素在第一行，往右走
                {
                    c++;
                }
                else //其他情况，往右上走
                {
                    c++;
                    r--;
                }

            }
            else
            {
                if(r == m-1) //元素在最后一行，往右走
                {
                    c++;
                }
                else  if(c==0) //元素在第一列，往下走
                {
                    r++;
                }
                else  //其他情况，往左下走
                {
                    c--;
                    r++;
                }
            }
        }
        return arr;
    }

    /**
     * 螺旋矩阵
     * 给定一个包含 m x n 个元素的矩阵（m 行, n 列），请按照顺时针螺旋顺序，返回矩阵中的所有元素。
     * @param matrix
     * @return
     */
    public List<Integer> spiralOrder(int[][] matrix)
    {
        int m = matrix.length;
        int n = matrix[0].length;

        int left = 0;
        int right = n-1;
        int top = 0;
        int bottom = m-1;

        List<Integer> list = new ArrayList<>();

        return null;
    }
}
