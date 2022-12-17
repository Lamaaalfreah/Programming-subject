
package coffeetest;
import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;

public class CoffeeTest 
{
    public static void main(String[] args) 
    {
   
     System.out.println("Welcome to Lama's online coffee store :) ");
     System.out.println("The best time to try our coffee beans is now ❤! these are some of our products ★ :");
     
     GregorianCalendar GregorianCalendar = new GregorianCalendar();

     coffee coffee1 = new coffee();
     coffee1.setCoffeeOrigin("Turkey");
     System.out.println(coffee1.toString());
     System.out.println("Production date: " + GregorianCalendar.get(GregorianCalendar.YEAR));
     System.out.println("Expiry date: " + LocalDate.now().plusYears(1).getYear());
     
     System.out.println("------------------------------------------------------");

     coffee coffee2 = new coffee("saudi", 200, 2);
     coffee2.getCoffeeOrigin();
     System.out.println(coffee2.toString());
     System.out.println("Production date: " + GregorianCalendar.get(GregorianCalendar.YEAR));
     System.out.println("Expiry date: " + LocalDate.now().plusYears(1).getYear());
     System.out.println("Enjoy your time with a cup of our coffee ☕.");
     
    }// end of main.
}// end of CoffeeTest.

class coffee 
{
    String coffeeOrigin = "Ethiopia";
    double KGPrice = 100.60;
    Date dateCreated = new Date();
    int quantity = 1;
   
 coffee()
 {
    this("Turkey", 100, 4);
 }// coffee1.
 
 coffee(String coffeeOrigin, double KGPrice, int quantity)
 {
    this.coffeeOrigin = coffeeOrigin;
    this.KGPrice = KGPrice;
    this.quantity = quantity;
 }// coffee2.
 
 String getCoffeeOrigin()
 {
   return coffeeOrigin;
 }// end of getCoffeeOrigin.
 
 double getKGPrice()
 {
   return KGPrice;
 }// end of getKGPrice.
 
 double getQuantity()
 {
   return quantity;
 }// end of getQuantity.
 
 Date getDateCreated()
 {
   return dateCreated;
 }// end of getDateCreated.
 
 void setCoffeeOrigin(String coffeeOrigin)
 {
   this.coffeeOrigin = coffeeOrigin;
 }// end of setCoffeeOrigin.
 
 void setKGPrice(double KGPrice)
 {
   this.KGPrice = KGPrice;
 }// end of setKGPrice.
 
 void setQuantity(int quantity)
 {
   this.quantity = quantity;
 }// end of setQuantity.
 
 @Override
 public String toString()
 {
   return ("Coffee origin = " + coffeeOrigin + " | KG Price = " + KGPrice + " | available quantity = " + quantity
   + " | date Created = " + dateCreated);
 }// end of toString.
}// end of coffee.











