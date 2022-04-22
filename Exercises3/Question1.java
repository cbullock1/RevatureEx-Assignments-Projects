package com.revature.Week2.Day8.Exercises3;

public class Question1 {
    public static void main(String[] args) {

//        1. Program with try and catch & finally block

        System.out.println("Program with try and catch & finally block");
        int[] count = new int[]{1,2,3};
        try{
            for (int i = 0; i < 4; i++){
                System.out.println(count[i]);
            }
        }catch (NullPointerException ex){
            System.out.println(ex.getMessage());
        }finally {
            System.out.println("Reached the finally");
        }
//        7. Program to prevent creation of second object


    }
}
