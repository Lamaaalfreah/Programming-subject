package removeduplicate;
import java.util.*;
/*
Challenge Question:
Question 1‐ Remove duplicates:
 Write a method that removes the duplicate elements from an array list of integers using the following header:
public static void removeDuplicate(ArrayList<Integer> list)
 Write a test program that prompts the user to enter 10 integers to a list and displays the distinct integers separated by exactly one space. 
*/

public class RemoveDuplicate 
{
    public static void main(String[] args) 
    {
     ArrayList<Integer>list = new ArrayList<>();
     
     Scanner input = new Scanner(System.in); 
     System.out.println("Enter ten integers: ");
     int number;
     
     for (int i = 0; i<10; i++)
     {
         number = input.nextInt();
         if(!list.contains(number))
         list.add(number);
     } 
     
     System.out.println("The distinct integers are: ");
     for (int i = 0; i<list.size(); i++)
     System.out.println(list.get(i) + " ");
     
     // Or i can use (list.toString()).
     //System.out.println(list.toString());
      
    }// end of main.    
}// end of RemoveDuplicate.










