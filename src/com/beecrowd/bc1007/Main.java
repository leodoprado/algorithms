package com.beecrowd.bc1007;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numA = sc.nextInt();
        int numB = sc.nextInt();
        int numC = sc.nextInt();
        int numD = sc.nextInt();

        int result = (numA * numB) - (numC * numD);

        System.out.println("DIFERENCA = " + result);
    }
}
