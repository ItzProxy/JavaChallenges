//package Assignment2.a2p1;

import java.util.Date;
import java.util.Scanner;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account() {
        this.id = 0;
        this.balance = 0.0D;
        this.annualInterestRate = 0.0D;
        this.dateCreated = new Date();
    }

    public Account(int _id, double _balance) {
        this.id = _id;
        this.balance = _balance;
        this.dateCreated = new Date();
    }

    public Account(int _id, double _balance, double _annualInterestRate) {
        this.id = _id;
        this.balance = _balance;
        this.annualInterestRate = _annualInterestRate;
        this.dateCreated = new Date();
    }

    public double getBalance() {
        return this.balance;
    }

    public double getId() {
        return (double)this.id;
    }

    public Date getDate() {
        return this.dateCreated;
    }

    public void setBalance(double _balance) {
        this.balance = _balance;
    }

    public void setId(int _id) {
        this.id = _id;
    }

    public void setAnnualRate(double _annualInterestRate) {
        this.annualInterestRate = _annualInterestRate;
    }

    private double getMonthlyInterestRate() {
        return this.annualInterestRate / 12.0D;
    }

    private double getMonthlyInterest() {
        return this.balance * (this.getMonthlyInterestRate() / 100.0D);
    }

    private void withdraw(double val) {
        System.out.println("Withdrawing: $ " + val);
        this.balance -= val;
    }

    private void deposit(double val) {
        System.out.println("Depositing: $" + val);
        this.balance += val;
    }

    public void menu() {
        Scanner sc = Test.sc;

        int choice;
        do {
            System.out.println("Main Menu");
            System.out.println("1: Check Balance");
            System.out.println("2: Withdraw");
            System.out.println("3: Deposit");
            System.out.println("4: Exit");
            choice = sc.nextInt();
            switch(choice) {
            case 1:
                System.out.println("Balance: " + this.getBalance());
                break;
            case 2:
                System.out.println("Enter amount to withdraw: ");
                this.withdraw(sc.nextDouble());
                break;
            case 3:
                System.out.println("Enter amount to deposit: ");
                this.deposit(sc.nextDouble());
                break;
            case 4:
                System.out.println("Good-bye");
            }
        } while(choice != 4);
    }
}
