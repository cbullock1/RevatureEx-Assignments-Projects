package com.revature.Week3.ExercisesWeek3;

import java.util.ArrayList;
import java.util.Scanner;

public class ExerciseWeek3Q3 {
    /*# Linked List and ArrayList
        3. Write a Java program to iterate through all elements in a linked list starting at the specified position.
        4. Write a Java program to iterate a linked list in reverse order.
        5. Write a Java program to insert the specified element at the specified position in the linked list.
*/
    public static void main(String[] args) {
        System.out.println("Pick a starting index for (0-99)");
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <= 100 ; i++)
            numbers.add(i);

        Scanner input = new Scanner(System.in);
        int start = input.nextInt();
        System.out.println("From index " + start + " this program display the remaining indexes");
        for (int i = start; i < numbers.size(); i++)
            System.out.println(numbers.get(i));
    }

}
