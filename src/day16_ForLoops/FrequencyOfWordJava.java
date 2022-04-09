package day16_ForLoops;

import java.util.Scanner;

public class FrequencyOfWordJava {
    public static void main(String[] args) {
        /*Scanner scan = new Scanner (System.in);
        System.out.println("Please enter a sentence:");
        String sentence = scan.nextLine();
        System.out.println("Please enter a word");
        String word = scan.next();
        int frequency = 0;

        for (int i = 0; i <= sentence.length()-word.length(); i++) {

                if(sentence.substring(i,i+word.length()).equalsIgnoreCase(word)){
                    frequency +=1;

            }
        }

        System.out.println("frequency = " + frequency);*/


                /*Scanner scan = new Scanner(System.in);

                System.out.println("Enter your sentence:");
                String sentence = scan.nextLine();

                System.out.println("Enter the word to check:");
                String word = scan.next();

                int counter =0;

                for (int i = 0; i <= sentence.length()-word.length() ; i++) {
                    if (sentence.substring(i,i+word.length()).equalsIgnoreCase(word)){
                        counter +=1;
                    }
                }

                System.out.println("counter = " + counter);

                scan.close();*/

        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter your sentence:");
        String sentence = scan.nextLine();
        System.out.println("Please enter a word:");
        String word = scan.next();
        int frequency = 0;

        for(int i = 0; i<=sentence.length()-word.length();i++){
            if(sentence.substring(i, i+word.length()).equalsIgnoreCase(word)){
                frequency += 1;
            }
        }
        System.out.println(frequency);



            }


    }

/*
4. write a program that can return the frequency of the a word Java from the sentence

        Ex:
            sentence = "Java Java";

            output:
                2

            Hint: you need to create
 */