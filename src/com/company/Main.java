package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the number to stop at:");
        int stop = scan.nextInt();
        for (int i = 1; i <= stop; i++){
            boolean flag = true;
            if (i % 3 == 0){
                System.out.print("Fizz");
                flag = false;
            }
            if (i % 5 == 0){
                System.out.print("Buzz");
                flag = false;
            }
            if (flag){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
