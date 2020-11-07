package org.example;

import java.util.ArrayList;

import java.util.Arrays;

public class App {


    public static void main(String[] args) {
        intArrayEx();
        //indexOfArray();
        sortArray();
        copyOfArray();
        landsArray();
        averageOfArray();
        oddNumArray();
        //dublecateArray();
        //addElament();
        multiplicationTable();

        diagonalElements();


    }

    public static void intArrayEx() {

        int[] element = new int[]{11, 13, 20, 7};

        System.out.println("Exercise 1 : \n ");

        int i;

        for (i = 0; i < element.length; i++) {

            System.out.println("Element[" + i + "] = " + element[i]);
        }

        System.out.println();

        System.out.println("   ****************  ");

    }


    public static void sortArray() {
        String[] cities = {"Paris      ", "London     ", "New york    ", "Stokholm     "};

        System.out.println("Exercise 3 : \n ");

        System.out.print("String array     : ");

        for (String city : cities) {

            System.out.print(city );

        }

        Arrays.sort(cities);

        System.out.println("    ");

        System.out.print("Sort string array: ");

        for (String city : cities) {

            System.out.print(city);

        }

        System.out.println();

        System.out.println("   ");

        System.out.println("   ****************  ");

    }
    public static void copyOfArray()

    {

        int degrees[]= {1,15,20};
        System.out.println("Exercise 4 : \n ");
        int degrees2[]= Arrays.copyOf(degrees,degrees.length);
        for (int degreesOfStudent:degrees2)
        {
            System.out.println("Degrees Of Student are :" +degreesOfStudent);
        }
        System.out.println();

        System.out.println("   ");

        System.out.println("   ****************  ");


    }

    public static void landsArray() {

        String[][] names = {{"France    ", "Paris   "}, {"Sweden   ", "Stockholm   "}};

        System.out.println("Exercise 5 :\n");

        for (int i = 0; i < names.length; i++) {

            for (int j = 0; j < names[i].length; j++) {

                System.out.print(names[i][j] + "  ");

            }

            System.out.println();

        }

        System.out.println("   ");

        System.out.println("   ****************  ");

    }

    public static void averageOfArray() {
        double[] num = {43, 5, 23, 17, 2, 14};

        double sum = 0;
        System.out.println("Exercise 6 :\n");

        System.out.print(" Array :  ");

        for (int i = 0; i < num.length; i++) {

            System.out.print(" " + num[i] + " ");

            sum = sum + num[i];

        }

        double average = sum / num.length;

        System.out.println();

        System.out.format("The Average Of Array is: %.1f", average);

        System.out.println();

        System.out.println("      ");

        System.out.println("   ****************  ");


    }

    public static void oddNumArray() {
        int odd[] = {12, 7, 23, 22, 78, 55, 80, 3, 42, 33};

        System.out.println("Exercise 7 :\n");
        System.out.print("Array is             :   ");
        for (int org : odd) {

            System.out.print(org + " \t ");
        }


        System.out.println();

        System.out.print("Odd Numbers In Array :   ");

        for (int i = 0; i < odd.length; i++) {
            if (odd[i] % 2 != 0)

                System.out.print(odd[i] + "  \t  ");

        }
        System.out.println();

        System.out.println("\n");

        System.out.println("   ****************  ");

    }


    public static void multiplicationTable() {
        int table[][] = new int[10][10];


        System.out.println("Exercise 10 :\n");

        System.out.println(" Multiblication Table");

        System.out.println();

        for (int i = 0; i < table.length; i++) {

            for (int j = 0; j < table[i].length; j++) {

                table[i][j] = (i + 1) * (j + 1);

            }
        }

        for (int i = 0; i < table.length; i++) {

            for (int j = 0; j < table[i].length; j++) {

                System.out.print(table[i][j] + "\t");
            }

            System.out.println();
        }

        System.out.println();

        System.out.println("      ");

        System.out.println("   ****************  ");

    }


    public static void diagonalElements() {

        int dElements[][] = new int[3][3];

        System.out.println("Exercise 12 :\n");

        for (int i = 0; i < dElements.length; i++) {

            for (int j = 0; j < dElements[i].length; j++) {

                dElements[i][j] = (i + 1) * (j + 1);


                System.out.print(dElements[i][j] + "\t");
            }

            System.out.println();
        }

        System.out.print(" Diagonail Elements are :   ");
        for (int i = 0; i < dElements.length; i++) {
            for (int j = 0; j < dElements[i].length; j++) {
                if (i == j)
                    System.out.print(dElements[i][j] + " \t");
            }
        }
        System.out.println();

        System.out.println("      ");

        System.out.println("   ****************  ");




    }


}