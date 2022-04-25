package com.revature.Week3.ExercisesWeek3;

import com.sun.source.tree.Tree;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeExercises {

    /*
    # TreeSet
        1. Write a Java program to create a new tree set, add some colors (string) and print out the tree set.
        2. Write a Java program to iterate through all elements in a tree set.
        3. Write a Java program to add all the elements of a specified tree set to another tree set.
        4. Write a Java program to create a reverse order view of the elements contained in a given tree set.
        5. Write a Java program to get the first and last elements in a tree set
     */
    public static void Question2(TreeSet<String> tree){

        System.out.println("Question 2: Iterating through tree --------------------------------------------------------------------------------------------------");
        Iterator iterator = tree.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());

        System.out.println();

    }

    public static void Question3(TreeSet<String> tree, TreeSet<String> Addtree){
        System.out.println("Question 3: Write a Java program to add all the elements of a specified tree set to another tree set.--------------------------------");
        System.out.println("Added " + Addtree + " to " + tree);

        tree.addAll(Addtree);

        System.out.println();
        System.out.println(tree);

        System.out.println();

    }
    public static void Question4(TreeSet<String> tree){
        System.out.println("Question 4: Write a Java program to create a reverse order view of the elements contained in a given tree set. ---------------------");
        System.out.println("Original Order of Tree");
        System.out.println(tree);
        System.out.println();

        System.out.println("Reverse order of Tree");
        Iterator iterator = tree.descendingIterator();
        while (iterator.hasNext())
            System.out.print(" " +iterator.next());
        System.out.println();
        System.out.println();
    }
    public static void Question5(TreeSet<String> tree){

        System.out.println("Question 5: Write a Java program to get the first and last elements in a tree set ------------------------------------------------");

        System.out.println("Tree Provided");
        System.out.println(tree);

        System.out.println("First Element: " + tree.pollFirst());
        System.out.println("Last Element: " + tree.pollLast());
        System.out.println();

    }

    public static void main(String[] args) {
        TreeSet<String> treeColor = new TreeSet<>();
        treeColor.add("Blue");
        treeColor.add("Green");
        treeColor.add("Black");
        treeColor.add("Red");
        treeColor.add("Orange");

        TreeSet<String> moreColors = new TreeSet<String>();
        moreColors.add("Yellow");
        moreColors.add("Purple");
        moreColors.add("White");

        System.out.println("Original Tree");
        System.out.println(treeColor);
        System.out.println();
        Question2(treeColor);
        Question3(treeColor, moreColors);
        Question4(treeColor);
        Question5(treeColor);


    }

}
