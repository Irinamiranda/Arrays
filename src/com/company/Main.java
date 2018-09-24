package com.company;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class Main {

    public static void main(String[] args) {
        //There is the list of 10 last presidents

        ArrayList<String> myList = new ArrayList();
        System.out.println("Enter the word");

        Scanner myWord = new Scanner(System.in);
        String word = "";


        while (!word.equalsIgnoreCase("history") ){
            word = myWord.nextLine();
            myList.add(word);
            if (word.equalsIgnoreCase("history")) {
                myList.remove(word);
            }
       }
        System.out.println(myList.toString());
        Collections.reverse(myList);
        System.out.println(myList);


        /*int length = myList.size();
        for (int i = length - 1; i > 0; i--) {
            System.out.println(myList.toString());*/
        }


       /* myList.add("Kennedy");
        myList.add("Johnson");
        myList.add("Nixon");
        myList.add("Ford");
        myList.add("Carter");
        myList.add("Reagan");
        myList.add("Bush");
        myList.add("Clinton");
        myList.add("Bush");
        myList.add("Obama");

        for ( element : myList) {

            System.out.println(element);



        if (wordHistory == "history") {

            for (int i = myList.length() - 1; i > 0; i--) ;
            System.out.println(myList[i] + " ");
        } else {


            }


            // write your code here
        }*/
    }
