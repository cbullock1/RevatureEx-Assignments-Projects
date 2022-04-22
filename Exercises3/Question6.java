package com.revature.Week2.Day8.Exercises3;

import java.util.Scanner;

class StudentAlreadyVerifiedException extends Exception{

    StudentAlreadyVerifiedException(String message){
        super(message);
    }

}

class StudentRecordValidation {
    private String name;
    private int id;
    private String grade;
    private boolean verified = false;
    StudentRecordValidation(String name, int id, String grade){
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }
    public void checkInfo(){
        System.out.println(name);
        System.out.println(id);
        System.out.println(grade);
    }

    public boolean isVerified() {
        return verified;
    }

    public void changeInfo(String name, int id, String grade) throws StudentAlreadyVerifiedException {
        if(!verified) {
            this.name = name;
            this.id = id;
            this.grade = grade;
        }
        else
            throw new StudentAlreadyVerifiedException("Student has already verified");
    }
}

public class Question6 {
    public static void main(String[] args) throws StudentAlreadyVerifiedException {
//        6. Program to validate student record
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Student Name");
        String name = input.next();
        System.out.println("Enter Student Id");
        int id = input.nextInt();
        System.out.println("Enter Grade");
        String grade = input.next();
        StudentRecordValidation student = new StudentRecordValidation(name, id, grade);
        verify(student);
    do {
        System.out.println("Are you done Y or N");
        String choice = input.next();
        if (!("Y".equals(choice))) {
            verify(student);
        }
    }while (!student.isVerified());

    }

    public static void verify(StudentRecordValidation student) throws StudentAlreadyVerifiedException {
        Scanner input = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Is this information correct?");
        student.checkInfo();
        System.out.println("Please type y to validate this information or n to see further instructions");
        String ui = input.next();
        switch (ui){
            case "y":
            case "Y":
                student.setVerified(true);
                break;

            default:
                System.out.println("Enter Student Name");
                String name = input.next();
                System.out.println("Enter Student Id");
                int id = input.nextInt();
                System.out.println("Enter Grade");
                String grade = input.next();
                student.changeInfo(name,id,grade);
        }
        return;
    }
}
