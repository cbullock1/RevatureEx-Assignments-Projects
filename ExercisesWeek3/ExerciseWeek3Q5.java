package com.revature.Week3.ExercisesWeek3;

import java.util.ArrayList;
import java.util.Scanner;

public class ExerciseWeek3Q5 {
    /*# Linked List and ArrayList
      5. Write a Java program to insert the specified element at the specified position in the linked list.
*/
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Mark");
        names.add("Kevin");
        names.add("Nick");
        names.add("Ryan");

        System.out.println("These are the names currently on the list");
        System.out.println(names);
        System.out.println();

        Scanner input = new Scanner(System.in);
        System.out.println("What name would you like to add");
        String name = input.next();
        System.out.println("What position? Note please pick a number within 0 - " + (names.size()-1));
        int index = input.nextInt();
        names.add(index, name);

        System.out.println("This is the updated List");
        System.out.println(names);

    }
}
