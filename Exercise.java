package com.revature.Week1.Day1;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {

       //Ex1
        for (int i = 1; i<=5; i++){
            for (int j = 1; j<= i; j++)
                System.out.print("*");
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println(" ");

        System.out.println("********************************");
        //Ex2
        System.out.println("");
        for (int i = 1; i<=5; i++){
            for(int j = 5; j >= i ; j--)
                System.out.print("*");
            System.out.println("");
        }
        System.out.println(" ");
        System.out.println(" ");

        System.out.println("********************************");
        System.out.println("");

        //Ex3

        System.out.println(" ");
        for(int i = 0; i<4; i++){

            for (int k = i*2; k <= 5; k++)
                System.out.print(" ");
            for (int j = 1; j <= (2 * i + 1); j++) {
                    System.out.print("* ");
                }
                System.out.println("");
            }

        System.out.println(" ");
        //Ex4
        for (int i = 3; i > 0; i--) {
            for (int s = i*2; s <= 5; s++)
                System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }
            System.out.println("");

        }

        System.out.println(" ");

        //Ex 5
        for (int i = 5; i>=1; i--){
            for (int j = 1; j<= 5; j++) {
                if (j < i)
                    System.out.print("  ");
                else
                    System.out.print(" *");
            }
            System.out.println(" ");
        }

        System.out.println(" ");

        //ex 6

        long[] inputs = new long[] {78, 87, 25};
        for(int i = 0; i < inputs.length; i++){
            long placeholder = 0;
            for (int k = 0; k < inputs.length; k++){
            if(i!=k && inputs[i] < inputs[k]){
                placeholder = inputs[k];
                inputs[k] = inputs[i];
                inputs[i] = placeholder;
                }
            }

        }
        System.out.println(inputs[0]);
        System.out.println(inputs[1]);
        System.out.println(inputs[2]);


        //Ex 7
        System.out.println(" ");
        System.out.println(" ");
        int given = 5;

        for(int index = 0; index <= given; index++)
            System.out.println(given + " x " + index + " = " + (given*index));

        //Ex 8
        System.out.println(" ");
        System.out.println(" ");
        int size = 10;
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (col <= row)
                    System.out.print(col);
                else
                    System.out.print(" ");
            }
            System.out.println(" ");
        }

        //ex 9
        System.out.println(" ");
        System.out.println(" ");
        int sizeR = 4;
        for (int row = sizeR; row >= 1; row--){
            for (int col = 0; col <= row; col++){
                    System.out.print(" ");
            }
            for (int col = 0; col < sizeR-row+1; ++col)
                System.out.print(sizeR-row+1+ " ");
            System.out.println(" ");
        }

        System.out.println(" ");
        System.out.println(" ");

        //Ex10
        int diamond = 9;
        for (int row = 0; row <= 2*diamond; row++){
            if (row < diamond){
                for (int col = 1; col < 2 * diamond; col++) {
                    if ((col >= diamond- row && col <= diamond + row))
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println(" ");
            }
            if(row > diamond+1) {
                for (int col = 1; col < 2 * diamond; col++) {
                    if (col >= row-diamond && col <= 2 * diamond - (row-diamond))
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println(" ");
            }
        }

        System.out.println("\n");

        int x,y,z;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter rows for full diamond");
        int n = scanner.nextInt();

        for(x = 0; x < n ; x++){
            for(y = 0; y < n - x -1; y++)
                System.out.print(" ");
            for(z = 0; z < 2*x +1; z++)
                System.out.print("*");
            System.out.println(" ");
        }
        for (x = n-1; x>0; x--){
            for (y = n-1; y >= x; y--)
                System.out.print(" ");
            for (z = 2*x -1; z > 0 ; z--)
                System.out.print("*");
            System.out.println(" ");
        }



    }




}
