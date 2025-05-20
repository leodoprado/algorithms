package com.beecrowd.bc1006;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double notaA = sc.nextDouble();
        double notaB = sc.nextDouble();
        double notaC = sc.nextDouble();

        double media = ((notaA * 2) + (notaB * 3) + (notaC * 5)) / 10;

        System.out.printf("MEDIA = %.1f\n", media);
    }
}
