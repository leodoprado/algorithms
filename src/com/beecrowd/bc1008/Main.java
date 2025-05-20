package com.beecrowd.bc1008;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int hours = sc.nextInt();
        double salaryHour = sc.nextDouble();

        double totalSalary = (salaryHour * hours);

        System.out.println("NUMBER = " + num);
        System.out.printf("SALARY = U$ %.2f\n", totalSalary);
    }
}
