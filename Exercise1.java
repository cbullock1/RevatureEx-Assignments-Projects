package com.revature.Week1.Day2;

public class Exercise1 {

    public static void main(String[] args) {

        //Question 2: Write a program to sum first n even numbers using a while loop.
        System.out.println("Ex 2");
        int n = 10;
        int index = 0;
        int sum = 0;
        while (index < n){
           // if(index%2 == 0){
                sum += index*2;
            //}
            System.out.println(sum);
            index ++;
        }

        //Question 3: Write a program to print the multiplication table of a given number n.
        System.out.println(" ");
        System.out.println("Ex 3");
        index = 0;
        while (index <= n){
            System.out.println("" + n + " * " + index + " = " + (index++ * n));
        }

        //Question 4: Write a program to print a multiplication table of 10 in reverse order.
        System.out.println(" ");
        System.out.println("Ex 4");
        index = 10;
        while (index >=0){
            System.out.println("" + 10 + " * " + index + " = " + (index-- * 10));
        }

        //Question 5: Write a program to find the factorial of a given number using for loops.
        System.out.println(" ");
        System.out.println("Ex 5");
        n = 8;
        sum = 1;
        for(int i = 1; i <= n; i++){
            sum *= i;
        }
        System.out.println("The factorial of " + n +" is " + sum);

        //Question 6: Repeat problem 5 using a while loop.
        System.out.println(" ");
        System.out.println("Ex 6");
        sum = 1;
        index = 1;
        while (index <= n){
            sum *= index++;
        }
        System.out.println("The factorial of " + n +" is " + sum);


        //Question 7: Repeat problem 1 using for/while loop.
        System.out.println(" ");
        System.out.println("Ex 7");
        //Question: Write a program to sum first n even numbers using a while loop.
        n = 10;
        sum = 0;
        for(int i = 0; i < n; i++){
            //if(i%2 == 0)
                sum += i*2;
            System.out.println(sum);

        }

        //Question 8: What can be done using one type of loop can also be done using the other two types of loops - True or False.
        System.out.println(" ");
        System.out.println("Ex 8");
        System.out.println("True");
        System.out.println(" ");

        //Question 9: Write a program to calculate the sum of the numbers occurring in the multiplication table of 8.

        System.out.println(" ");
        System.out.println("Ex 9");

        index = 0;
        sum = 0;
        while (index <= 10){
            sum += (index * 8);
            System.out.println("" + 8 + " * " + index + " = " + (index++ * 8));
        }
        System.out.println("The sum of this Multiplication table is " + sum);

    }
}
