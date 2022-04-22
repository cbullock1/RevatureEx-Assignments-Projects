package com.revature.Week2.Day8.Exercises3;

public class Question4 {
    public static void main(String[] args) throws Exception {
//        4. Program for chained exception

        System.out.println("Program for chained exception");
        chainlink1();

    }
    public static void chainlink1() throws Exception {
        chainlink2();
    }
    public static void chainlink2() throws Exception {
        chainlink3();
    }
    public static void chainlink3() throws Exception {
        chainlink4();
    }
    public static void chainlink4() throws Exception {
        chainlink5();
    }
    public static void chainlink5() throws Exception {
        throw new Exception("Chaining the Exception through multiple methods");
    }


}
