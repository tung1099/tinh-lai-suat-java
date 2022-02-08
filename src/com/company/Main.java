package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số tiền gửi: ");
        money = sc.nextDouble();
        System.out.print("Nhập số tháng gửi: ");
        month = sc.nextInt();
        System.out.print("Nhập lãi suất: ");
        interestRate = sc.nextDouble();

        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate/100)/12 * month;
        }
        System.out.printf("Tổng lãi suất là: %f", totalInterest);
    }
}
