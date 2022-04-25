package com.revature.Week3.ExercisesWeek3;

import java.util.ArrayList;

public class ExerciseWeek3Q4 {
    /*# Linked List and ArrayList
       4. Write a Java program to iterate a linked list in reverse order.
        5. Write a Java program to insert the specified element at the specified position in the linked list.
*/
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList();

        for (int i = 0; i <= 100 ; i++)
            numbers.add(i);

        System.out.println("Printing all List is reverse order");
        for (int i = numbers.size()-1; i >= 0; i--)
            System.out.println(numbers.get(i));

    }
}
