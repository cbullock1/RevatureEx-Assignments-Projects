package com.revature.Week2.Day8.Exercises3;

class Question5Exception extends Exception{
    public Question5Exception(String message){
        super(message);
    }
}

class Thinking{
    public void confused() throws Question5Exception {
        throw new Question5Exception("I couldn't think of a clever way to solve this answer");
    }
}

public class Question5 {
    public static void main(String[] args) throws Question5Exception {
//        5. Program to create custom exception
        Thinking Iam = new Thinking();
        Iam.confused();

    }
}
