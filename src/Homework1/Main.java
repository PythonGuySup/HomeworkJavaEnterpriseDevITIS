package Homework1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int[] array = new int[201];
        int inputInteger;
        int formattedInteger;
        int maxElem = -1;
        int maxElemIndex = 0;

        Scanner scan = new Scanner(System.in);
        inputInteger = scan.nextInt();

        while (inputInteger != -1) {
            formattedInteger = inputInteger + 100;
            array[formattedInteger] += 1;

            inputInteger = scan.nextInt();
        }

        for (int i=0; i<=200; i++) {
            if (maxElem < array[i]) {
                maxElem = array[i];
                maxElemIndex = i;
            }
        }

        System.out.println(maxElemIndex - 100);

    }
}






