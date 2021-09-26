package ex33;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Evan Verdu
 */

import java.util.Random;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class ex33Test {

    public static void main(String[] Args){

        int random;
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        String[] answer = {"Yes.", "No.", "Maybe.", "Ask again later."};

        System.out.print("What's your question? \n> ");
        String question = scanner.next();

        random = rand.nextInt(4);

        System.out.print("\n" + answer[random]);


    }


}