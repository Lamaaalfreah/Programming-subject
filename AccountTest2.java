package accounttest2;
import java.util.*;
import java.util.Date;
/*
Homework:
Homework 1‐ Account class:
Update the below the Account class as follows:
a) Add a new data field name of the String type to store the name of the customer.
b) Add a new constructor that constructs an account with the specified name, id, and balance.
c) Add a new data field named transactions whose type is ArrayList that stores the transaction for the accounts.
d) Each transaction is an instance of the Transaction class. The Transaction class is defined as shown in the below figure
e) Modify the withdraw and deposit methods to add a transaction to the transactions array list.
f) All other properties and methods are the same as in the Account class below.
g) Write a test program that creates an Account with annual interest rate 1.5%, balance 1000 , id 1122 , and name George.
   Deposit $30, $40, and $50 to the account and withdraw $5, $4, and $2 from the account.
h) Print an account summary that shows account holder name, interest rate, balance, and all transactions.
*/
public class AccountTest2
{
    public static void main(String[] args) 
    {
      Account Account1 = new Account (1122, 20000);
      Account1.setAnnualInterestRate(4.5);
      Account1.withdraw(2500);
      Account1.deposite(3000);
      System.out.println("Balance is: " +  Account1.getBalance());
      System.out.println("Monthly Interest: " + Account1.getMonthlyInterest()); 
      System.out.println("This account was created at: " +  Account1.getDateCreated());
      // new code:
      ArrayList<Integer>transactions = new ArrayList<>();
      Account Account2 = new Account ("george", 1122, 1000);
      Account2.setAnnualInterestRate(1.5);
      Account2.deposite(30);
      Account2.deposite(40);
      Account2.deposite(50);
      Account2.withdraw(5);
      Account2.withdraw(4);
      Account2.withdraw(2);
      System.out.println("Account summary:" 
              + " | 1- account customer: " +  Account2.getCustomerName() 
              + " | 2- account Balance: " +  Account2.getBalance());

    }// end of main.
}// end of AccountTest.
 
class Account 
{
 String customerName;  
 private int ID = 0;
 private double balance = 0;
 private static double annualInterestRate = 0.0;
 private Date dateCreated;
 
 
 Account()
 {
  dateCreated = new Date();       
 }// Account1.
 
 Account(int ID, double balance)
 {
 this();
 this.ID = ID;
 this.balance = balance;
 }// Account2.
 
 Account(String customerName, int ID, double balance)
 {
 this();
 this.customerName = customerName;
 this.ID = ID;
 this.balance = balance;
 }// Account2.
 void withdraw(double number)
 {
   balance-=number;   
 }// end of withdraw.
  
 void deposite(double number)
 {
   balance+=number;    
 }// end of deposite.
 
 double getBalance()
 {
   return balance;
 }// end of getBalance.
 
 double getID()
 {
   return ID;
 }// end of getID.
 
 String getDateCreated()
 {
   return  this.dateCreated.toString();
 }// end of getDateCreated.
 
 public double getAnnualInterestRate() 
 {
   return annualInterestRate; 
 }
 
 public double getMonthlyInterestRate() 
 { 
   return (annualInterestRate / 100) / 12 ;
 }
 
 public double getMonthlyInterest() 
 {
   return balance * getMonthlyInterestRate(); 
 }
 
 public String getCustomerName() 
 {
   return customerName; 
 }
 
  void setBalance(double balance)
 {
   this.balance = balance;
 }// end of setBalance.
 
 void setID(int ID)
 {
   this.ID = ID; 
 }// end of setID.
 
 public void setAnnualInterestRate(double annualInterestRate) 
 {
   this.annualInterestRate = annualInterestRate; 
 }
 
 public void setCustomerName(String customerName)
 {
   this.customerName=customerName; 
 }
}// end of Account.

class transactions 
{
 
 private char type ;
 private double amount = 0;
 private double balance = 0;
 private String description;
 
 transactions (char type, double amount, double balance, String description)
 {
  this.type = type;
  this.amount = amount;
  this.balance = balance;
  this.description = description;
 }// transactions. 
}



