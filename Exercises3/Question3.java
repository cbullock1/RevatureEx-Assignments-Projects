package com.revature.Week2.Day8.Exercises3;

class WrongAnswer extends Exception{
    WrongAnswer(String message){
        super(message);
    }
}

class Mistake{

    public void wrong() throws WrongAnswer {
        throw new WrongAnswer("You Answered this question incorrectly");
    }

}

public class Question3 {
    public static void main(String[] args) throws WrongAnswer {
        // 3. Program illustrating throws keyword
        System.out.println("Program illustrating throws keyword");
        Mistake mistake = new Mistake();
        mistake.wrong();
    }
}
