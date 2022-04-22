package com.revature.Week2.Day8.Exercises3;

public class Question2 {
    public static void main(String[] args) {
        //        2. Program for multiple catch with single try
        System.out.println("Program for multiple catch with single try");
        String[] multiExecp = new String[4];
        multiExecp[0] = "Hello World";
        multiExecp[1] = "Hello";
        multiExecp[2] = "World";
        multiExecp[3] = null;

        try {
            for(int i = 0; i <= multiExecp.length+1; i++){
                System.out.println("Content of Array index "+ i + " " + multiExecp[i]);
                System.out.println("Char at the 6th index is " + multiExecp[i].charAt(5));
                System.out.println();
            }
        }catch (StringIndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }


    }
}
