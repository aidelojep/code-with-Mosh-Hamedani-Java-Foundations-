package com.codewithmosh;

import java.text.NumberFormat;
import java.util.Scanner;

public class CalculatorProject {
    public static void main(String[] args) {

          final byte MONTH_OF_YEAR = 12;
          final byte INTEREST_RATE_PERCENTAGE = 100;

          Scanner scanner = new Scanner(System.in);

        System.out.println("Principal: ");
        int principal = scanner.nextInt();

        System.out.println("Interest: ");
        double rate= scanner.nextDouble();

        double monthlyRate = rate/INTEREST_RATE_PERCENTAGE/MONTH_OF_YEAR;

        System.out.println("number of yearsPeriod)");
        byte years= scanner.nextByte();
        int numberOfPayments = years * MONTH_OF_YEAR;

        double mortgage = principal * (monthlyRate * Math.pow(1 + monthlyRate,numberOfPayments))/ (Math.pow(1 + monthlyRate,years) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println(mortgageFormatted);








    }
}
