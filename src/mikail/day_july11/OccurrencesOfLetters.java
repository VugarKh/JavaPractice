package mikail.day_july11;

import java.util.Scanner;

public class OccurrencesOfLetters {
    public static void main(String[] args) {

        occurrenceOfLetter("abrakadabra");

    }

    public static void occurrenceOfLetter(String sentence) {  // abrakadabra


        String checked = "";

        for (int i = 0; i < sentence.length(); i++) {    //0. i: a

            int count = 0;
            if (!checked.contains(sentence.charAt(i) + "")) {

                for (int j = 0; j < sentence.length(); j++) {

                    if (sentence.charAt(i) == sentence.charAt(j)) { //0. j: a // 1. j : b //2 j: r // 3 j : a


                        count++; // 1+1+1+1+1
                    }
                }
                checked += sentence.charAt(i) + ""; // a

                System.out.println(sentence + " = has " + count + " times " + sentence.charAt(i));

            }
        }
    }
//Printing frequency of each character just after its consecutive occurrences
}