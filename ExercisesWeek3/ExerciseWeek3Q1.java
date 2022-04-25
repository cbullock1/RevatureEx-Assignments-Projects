package com.revature.Week3.ExercisesWeek3;

import java.util.ArrayList;
import java.util.Scanner;

public class ExerciseWeek3Q1 {

    public static ArrayList<String> appendToEnd(ArrayList<String> s, String addEnd){
        s.add(addEnd);
        System.out.println();
        System.out.println("Added String element to end of Arraylist");
        System.out.println(s);
        return s;
    }

    public static void main(String[] args) {
        /*# Linked List and ArrayList
        1. Write a Java program to append the specified element to the end of a linked list.
        2. Write a Java program to iterate through all elements in a linked list.
        3. Write a Java program to iterate through all elements in a linked list starting at the specified position.
        4. Write a Java program to iterate a linked list in reverse order.
        5. Write a Java program to insert the specified element at the specified position in the linked list.
*/
        ArrayList<String> students = new ArrayList<>();
        students.add("Mark");
        students.add("Paul");
        students.add("Edward");

        System.out.println("List before append");
        System.out.println(students);
        System.out.println();

        System.out.println("Please type a name to append");
        Scanner input = new Scanner(System.in);
        String name = input.next();

        students = appendToEnd(students, name);

    }
}
