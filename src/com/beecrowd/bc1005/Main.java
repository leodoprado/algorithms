package com.beecrowd.bc1005;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        double media = ((num1 * 3.5) + (num2 * 7.5)) / 11;

        System.out.printf("MEDIA = %.5f\n", media);
    }
}
