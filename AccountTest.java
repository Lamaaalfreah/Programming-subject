
package accounttest;
import java.util.Date;
/*
* Exercise ‐ Account class:
* Design a class named Account that contains:
a. A private int data field named id for the account (default 0)
b. A private double data field named balance for the account (default 0)
c. A private Date data field named dateCreated that stores the date when the
account was created
d. A no‐arg constructor that creates a default account
e. A constructor that creates an account with the specified id and initial balance
f. The accessor and mutator methods for id and balance.
g. The accessor method for dateCreated
h. A method named withdraw() that withdraws a specified amount from the account
i. A method named deposit() that deposits a specified amount to the account
1. Draw the UML diagram for the Account class
2. Implement the Account class
3. Use the test program given bellow that creates an Account object with an account ID of 1122, and a balance of $20,000.
   Use the withdraw() method to withdraw $2,500, use the deposit() method to deposit $3,000, 
   and print the balance, and the date when this account was created.
*/
public class AccountTest
{
    public static void main(String[] args) 
    {
      Account Account1 = new Account (1122, 20000);
      Account1.withdraw(2500);
      Account1.deposite(3000);
      System.out.println("Balance is: " +  Account1.getBalance());
      System.out.println("This account was created at: " +  Account1.getDateCreated());
    }// end of main.
}// end of AccountTest.
 
class Account 
{
 private int ID = 0;
 private double balance = 0;
 private Date dateCreated = new Date();
 
 Account()
 {
         
 }// Account1.
 
 Account(int ID, double balance)
 {
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
 
  void setBalance(double balance)
 {
   this.balance = balance;
 }// end of setBalance.
 
 void setID(int ID)
 {
   this.ID = ID; 
 }// end of setID.
 
 Date getDateCreated()
 {
   return dateCreated;
 }// end of getDateCreated.
}// end of Account.





