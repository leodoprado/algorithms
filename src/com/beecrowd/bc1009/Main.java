package com.beecrowd.bc1009;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String seller = sc.nextLine();
        double salary = sc.nextDouble();
        double totalSell = sc.nextDouble();

        double salaryBonusTotal = salary + (totalSell * 0.15);

        System.out.printf("TOTAL = R$ %.2f\n", salaryBonusTotal);
    }
}
