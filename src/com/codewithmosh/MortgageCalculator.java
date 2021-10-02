package com.codewithmosh;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final byte MONTH_OF_THE_YEAR = 12;
        final byte MONTHLY_PERCENTAGE = 100;

        System.out.println("Principal: ");
        int principal = scanner.nextInt();

        System.out.println("Interest: ");
        double interest = scanner.nextDouble();

        System.out.println("Year(Period): ");
        byte year = scanner.nextByte();
        int numberOfPayments = year * MONTH_OF_THE_YEAR;

        double monthlyRates = interest/MONTHLY_PERCENTAGE/MONTH_OF_THE_YEAR;

        double mortgage = principal * (monthlyRates * Math.pow(1 + monthlyRates, numberOfPayments))/(Math.pow(1 + monthlyRates, year)- 1);

        String finalValue = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.println(finalValue);




    }
}
