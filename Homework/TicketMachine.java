package Homework;

import java.util.ArrayList;
import java.util.Scanner;

public class TicketMachine {
    private static int balance = 0;
    private ArrayList<Integer> ticketPrice = new ArrayList<Integer>();

    private void initialPrice() {
        for (int i = 0; i < 5; i++) {
            int j = 100 * i + 10 * i + i + 1;
            ticketPrice.add(i, j);
        }
    }

    public void outputMenu() {
        initialPrice();
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + ":ticket" + i + ":" + ticketPrice.get(i));
        }

    }

    public int getBalance() {
        return balance;
    }

    public void insertMoney(int money, int num) {
        if (ticketPrice.get(num - 1) == money) {
            printTicket(num);
            balance = balance + money;

        } else if (ticketPrice.get(num - 1) < money) {
            System.out.println("The money you paid is enough,the rest money is in your balance.");
            balance = money - ticketPrice.get(num - 1);

        } else {
                System.out.println("The money you paid is  not enough,please insert more money.");
                Scanner sc0=new Scanner(System.in);
                money=money+sc0.nextInt();
                insertMoney(money,num);
        }
    }

    private void printTicket(int num) {
        System.out.println("Your ticket is ticket" + (num - 1) + "is here");
    }


    public static void main(String[] args) {
        TicketMachine buyer = new TicketMachine();
        System.out.println("Which ticket would you buy? Please input the serial number. ");
        buyer.outputMenu();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (num > 5 || num < 1) {
            System.out.println("What you input is wrong!Please input again");
            Scanner sc1 = new Scanner(System.in);
            num = sc1.nextInt();
        }
        System.out.println("Please insert your money.");
        Scanner sc2 = new Scanner(System.in);
        int num1 = sc.nextInt();
        buyer.insertMoney(num1,num);

    }
}

