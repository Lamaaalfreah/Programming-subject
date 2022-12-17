package stocktest;
import java.util.Scanner;
import java.util.Random;
/*
* Homework – Stock and Random classes:
* Design a class named Stock that contains:
* ■ A string data field named symbol for the stock’s symbol.
* ■ A string data field named name for the stock’s name.
* ■ A double data field named previousClosingPrice that stores the stock price for the previous day.
* ■ A double data field named currentPrice that stores the stock price for the current time. 
* ■ An integer data field named ID that stores the identifier number of stock.
* ■ A constructor that creates a stock with the specified symbol, name, and ID.
* ■ A method named getChangePercent() that returns the percentage changed from previousClosingPrice to currentPrice.
* Draw the UML diagram for the class and then implement the class. Write a test program that 
* ■ creates a Random object from the Random class (java.util.Random). 
  – We will use this object for the ID number of Stock between (0 to 100)‐
* ■ asks a user for the name and symbol of Stock. 
  So, you should create two string variables in the test program.
* ■ creates a Stock object with the stock symbol (from the user), 
  the name of symbol (from the user), 
  and ID (from Random object by using nextInt(100) method).
* ■ asks the user for the previous closing price and the current price.
  Note: Don't create two variables for them. 
  You can use the stock object to assign the values of these two variables from the user.
* ■ finally, displays the stock name, the stock symbol, the stock ID, and the price‐change percentage.
*/
public class StockTest 
{
    public static void main(String[] args) 
    {
     Scanner input = new Scanner(System.in);
     System.out.print("Enter the name of Stock: ");
     String name = input.nextLine();  
     System.out.print("Enter the symbol of Stock: ");
     String symbol = input.next();  
     System.out.print("Enter the previous closing price: ");
     double previousClosingPrice = input.nextDouble();  
     System.out.print("Enter the current price: ");
     double currentPrice = input.nextDouble(); 
     System.out.println(" -------------------------- ");
     Random random = new Random();
     int ID = random.nextInt(100);
     Stock Stock1 = new Stock(name, symbol, ID);
     
     Stock Stock2 = new Stock(previousClosingPrice, currentPrice);
     System.out.println("Price-change percentage: " + Stock2.getChangePercent());
    }// end of main.  
}// end of StockTest.  

class Stock 
{
  double previousClosingPrice;
  double currentPrice;
  Stock(String name, String symbol, int ID)
  {
     System.out.println("Stock name: " + name);
     System.out.println("Stock symbol: " + symbol);  
     System.out.println("Stock ID: " + ID);
  }// Stock.
  
  Stock(double newPreviousClosingPrice, double newCurrentPrice)
  {
     previousClosingPrice = newPreviousClosingPrice;
     currentPrice = newCurrentPrice;
  }// Stock.
  
  double getChangePercent()
  {
     double PriceChangePercentage =currentPrice - previousClosingPrice;
     return PriceChangePercentage;
  }// end of getChangePercent.
}// end of Stock.  











