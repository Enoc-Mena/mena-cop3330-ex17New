/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Enoc Mena
 */

package com.ex17;
import java.util.Scanner;

public class Ex17 {

    public static void main(String[] args) {

        int age;

        Scanner user = new Scanner(System.in);
        System.out.print("What is your age? ");
        age = user.nextInt();

        if(age >= 16) {

            System.out.print("You are old enough to legally drive!");

        } else {

            System.out.print("You are not old enough to legally drive.");

        }

    }

}
