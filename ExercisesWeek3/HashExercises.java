package com.revature.Week3.ExercisesWeek3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashExercises {
    /*
        # HashSet
        1. Write a Java program to append the specified element to the end of a hash set.
        2. Write a Java program to iterate through all elements in a hash list.
        3. Write a Java program to get the number of elements in a hash set.
        4. Write a Java program to empty an hash set.
     */

    public static void appendToEnd(HashSet<String> hS){
        System.out.println("What Student do you want to add");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        hS.add(name);

        System.out.println("Updated HashSet");
        System.out.println(hS);
        System.out.println();

    }
    public static void printItter(HashSet<String> students){

        Iterator iterator = students.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
        System.out.println();

    }
    public static void getNumber(HashSet<String> students){
        System.out.println("The number of elements in this Hash set is " + students.size());
        Iterator iterator = students.iterator();
        int i = 1;
        while (iterator.hasNext()) {
            System.out.println(i++ + ". " + iterator.next());
        }
        System.out.println();
    }

    public static void emptyHash(HashSet<String> students){
        System.out.println("Original HashSet");
        System.out.println(students);

        System.out.println();

        //to clear list
        students.clear();
        System.out.println("After Clearing the HashSet");
        System.out.println(students);
    }

    public static void main(String[] args) {
        HashSet<String> students = new HashSet<>();
        students.add("Connor");
        students.add("Nicholas");
        students.add("Thomas");
        students.add("Lisa");
        students.add("Jeffery");
        students.add("Kevin");
        students.add("Nacer");
        students.add("Dovlet");
        System.out.println("Original HashSet");
        System.out.println(students);
        System.out.println();
        System.out.println("Question 1: Write a Java program to append the specified element to the end of a hash set.\n");
        appendToEnd(students);
        System.out.println("Question 2: Write a Java program to iterate through all elements in a hash list.\n");
        printItter(students);
        System.out.println("Question 3: Write a Java program to get the number of elements in a hash set.");
        getNumber(students);
        System.out.println("Question 4: Write a Java program to empty an hash set.\n");
        emptyHash(students);
    }
}
