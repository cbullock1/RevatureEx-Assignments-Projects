package com.revature.Week3.ExercisesWeek3;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class IOExercises {

    static void listContents(File file){
        for (String name : file.list()) {
            System.out.println(name);
        }
        System.out.println();
    }

    static void getFilesByExt(File dir){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What extension are you looking for?");
        String ext = scanner.next();
        System.out.println();


        ArrayList<File> files = new ArrayList<>();
        String[] names = dir.list();
        for(String name : names){
            if (name.endsWith(ext)){
                files.add(new File(dir.getAbsolutePath()+ "/" + name));
                System.out.println("Found " + name + " in " + dir.getName());
            }
        }
        if(files.isEmpty())
            System.out.println("No matches to extension");
        System.out.println();
    }

    static void checkFOrD(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type the pathname you wanted checked");
        File unknown = new File(scanner.next());

        if(unknown.exists()) {
            if (unknown.isFile())
                System.out.println("The given pathname is a File");
            else
                System.out.println("The given pathname is a Directory");
        }
        else
            System.out.println("The pathname does not exist");
        System.out.println();
    }

    static void fileRead() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the path to the File you wish to read");
        File file = new File(scanner.next());

        // I utilized https://stackoverflow.com/questions/33892453/how-to-read-line-by-line-by-using-filereader
        // In order to utilize the buffer reader

        if(file.exists()){
            if(file.isFile()){

                FileReader fileIn = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileIn);
                String line = bufferedReader.readLine();
                while (line != null){
                    System.out.println(line);
                    line = bufferedReader.readLine();
                }

            }
            else
                System.out.println("The Path that was given was to a Directory");
        }
        else
            System.out.println("Path does not exist");
        System.out.println();
    }
    static void readThree() throws IOException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Path to File");
        File file = new File(scanner.next());
        FileReader fileIN = new FileReader(file);
        BufferedReader fileLines = new BufferedReader(fileIN);
        for (int i = 0; i < 3; i++)
            System.out.println(fileLines.readLine());
        System.out.println();
    }

    static void longestWord() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter file path");
        File file = new File(scanner.next());

        FileReader fileIn = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileIn);
        String line = bufferedReader.readLine();
        int count = 0;
        int largest = 0;
        String longest = null;
        String[] splits;
        while (line != null){
            splits = line.split(" ");
            for (String s: splits) {
                if(largest < s.length()){
                    largest = s.length();
                    longest = s;
                }
            }
            line = bufferedReader.readLine();
        }
        System.out.println("The longest word is " + largest + " charater long");
        System.out.println("That word is: " + longest);



    }

    public static void main(String[] args) throws IOException {
        /*
        1. Write a Java program to get a list of all file/directory names from the given.
        2. Write a Java program to get specific files by extensions from a specified folder.
        3. Write a Java program to check if a file or directory specified by pathname exists or not.
        4. Write a Java program to check if given pathname is a directory or a file.
        5. Write Java program to read input from java console.
        6. Write a Java program to read a file content line by line.
        7. Write a Java program to read first 3 lines from a file
        8. Write a Java program to find the longest word in a text file.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the path to the dir starting after java-demo/\n");
        String fp = scanner.next();
        File file = new File(fp);
        listContents(file);//Q1
        getFilesByExt(file);//Q2
        checkFOrD();//Q3 and Q4

        //Q5 I used the args since I have been using a scanner
        System.out.println("Argument entered into the console" + args[0]);
        File unknown = new File(args[0]);
        if (unknown.exists()){
            if (unknown.isDirectory())
                System.out.println("Command line arg provided a dir");
            else
                System.out.println("Command line arg provided a file");
        }
        else
            System.out.println("File path provided upon compile does not exist");

        fileRead();
        readThree();
        longestWord();






    }
}
