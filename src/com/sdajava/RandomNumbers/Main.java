package com.sdajava.RandomNumbers;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Random random = new Random();

        int[][] tablica = new int[10][10];

        for(int row=0; row<tablica.length; row++) {
            for (int col = 0; col < tablica.length; col++) {

                tablica[row][col] = random.nextInt() & 50;
            }
        }
        for (int row=0; row<tablica.length; row++){
            for(int col=0; col<tablica.length; col++){
                System.out.print(tablica[row][col] + "\t\t");
            }
            System.out.println();
        }
    }
}
