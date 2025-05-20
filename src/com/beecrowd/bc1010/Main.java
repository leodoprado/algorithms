package com.beecrowd.bc1010;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        int codPeca1, qtdPeca1, codPeca2, qtdPeca2;
        double valUnitPeca1, valUnitPeca2, valor;

        codPeca1 = Scan.nextInt();
        qtdPeca1 = Scan.nextInt();
        valUnitPeca1 = Scan.nextDouble();

        codPeca2 = Scan.nextInt();
        qtdPeca2 = Scan.nextInt();
        valUnitPeca2 = Scan.nextDouble();

        valor = qtdPeca1 * valUnitPeca1 + qtdPeca2 * valUnitPeca2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valor);
    }
}
