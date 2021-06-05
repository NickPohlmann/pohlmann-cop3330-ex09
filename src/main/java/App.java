/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Pohlmann
 */

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        int gallonPerF2 = 350;
        String lengthString = myApp.readInput("What is the lenth of the ceiling? ");
        String widthString = myApp.readInput("What is the width of the ceiling? ");
        int length = myApp.convertInputString(lengthString);
        int width = myApp.convertInputString(widthString);
        int f2 = myApp.computeF2(length, width);
        int gallonsNeeded = myApp.computeGallonsNeeded(gallonPerF2, f2);
        String outputString = myApp.generateOutputString(gallonsNeeded, f2);
        myApp.printOutputString(outputString);
    }

    private String readInput(String str) {
        System.out.print(str);
        String input = in.nextLine();
        return input;
    }

    private int convertInputString(String inputString) {
        int input = Integer.parseInt(inputString);
        return input;
    }

    private int computeF2(int length, int width) {
        int f2 = length * width;
        return f2;
    }

    private int computeGallonsNeeded(int gallonPerF2, int f2) {
        int gallonsNeeded = f2 / gallonPerF2;
        if (f2 % gallonPerF2 != 0) {
            gallonsNeeded++;
        }
        return gallonsNeeded;
    }

    private String generateOutputString(int gallosNeeded, int f2){
        return String.format("You will need to purchase %d gallons of paint to cover %d square feet.", gallosNeeded, f2);
    }

    private void printOutputString(String outputString) { System.out.println(outputString); }
}
