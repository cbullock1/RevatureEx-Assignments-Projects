package com.revature.Week3.ExercisesWeek3;

import java.util.ArrayList;

public class ExerciseWeek3Q2 {
    public static void main(String[] args) {
        /*# Linked List and ArrayList
        2. Write a Java program to iterate through all elements in a linked list.
        3. Write a Java program to iterate through all elements in a linked list starting at the specified position.
        4. Write a Java program to iterate a linked list in reverse order.
        5. Write a Java program to insert the specified element at the specified position in the linked list.
*/
        ArrayList<String> states = new ArrayList<>();
        states.add("Florida");
        states.add("Texas");
        states.add("Tennessee");
        states.add("South Carolina");
        states.add("Michigan");
        states.add("Georgia");

        System.out.println("Printing the entire ArrayList");
        for (String state: states) {
            System.out.println(state);
        }

    }
}
