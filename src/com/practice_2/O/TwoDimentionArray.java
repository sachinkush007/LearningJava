package com.practice_2.O;

import java.util.Arrays;

public class TwoDimentionArray {
    public static void main(String[] args) {
        int [][] arr=new int[2][3];
        //2 Row and 3 column
        arr[0][0]=10;
        arr[0][1]=20;
        arr[0][2]=30;
        arr[1][0]=40;
        arr[1][1]=50;
        arr[1][2]=60;
        System.out.println(Arrays.deepToString(arr));
        System.out.println("**********************************************************");
        int[][] twoDArray=new int[3][3];

        // Initializing values in the 2D array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                twoDArray[i][j] = i * 3 + j + 1;
//                System.out.print(twoDArray[i][j] + " ");
            }
        }
        // Accessing and printing values from the 2D array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
