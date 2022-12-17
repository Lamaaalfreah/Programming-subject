package primetest;
import java.util.Scanner;
/*
Homework* – Prime factors and prime numbers:
Write a program that prompts the user to enter a positive integer which is greater than one
and displays all its smallest factors in decreasing order.
For example, if the integer is 140, the smallest factors are displayed as 7, 5, 2, 2. 
Use the StackOfIntegers class to store the factors (e.g., 2, 2, 5, 7) and retrieve and display them in reverse order.
After that, write a program that displays all the prime numbers less than the number
– which is used in the prime factors (e.g: 140)‐ in decreasing order.
Use the StackOfIntegers class to store the prime numbers (e.g., 2, 3, 5, ...) and retrieve and display them in reverse order.
*/
public class PrimeTest 
{
    public static void main(String[] args) 
    {
     Scanner input = new Scanner(System.in); 
     StackOfIntegers stack = new StackOfIntegers();
     System.out.println("To use the prime factors you must enter a positive integer which is greater than one:");
     int number = input.nextInt();
     int number2 = number;
     
     int factor = 2;
     while (factor <= number) 
     {
        if (number % factor == 0) 
        {
        stack.push(factor);
        number = number /factor ;
        } 
        else 
        factor++;    
     }// end of while.
     
     System.out.println("The smallest factors in decreasing order:");
     while (!stack.empty()) 
     {
        System.out.print(stack.pop() + " ");
     }// end of while.
     
     System.out.println("");
     System.out.println("The prime numbers under the positive number " + number2 + ":");
 
     for (int i = 2; i <= number2; i++)
     {
      if (isPrime(i)) 
      {
      stack.push(i);
      }// end of if.
     }// end of for.
     
     while (!stack.empty()) 
     {
        System.out.print(stack.pop() + " ");
     }// end of while.
    }// end of main.
    
    public static boolean isPrime(int number) 
    {
     boolean isPrime = true;
     for (int divisor = 2; divisor < number ; divisor++) 
     {
     if (number % divisor == 0)
     {
     isPrime = false;
     break; 
     }// end of if.
     }// end of for.
     return isPrime;
    }// end of isPrime.
}// end of PrimeTest.

class StackOfIntegers 
{
     private int[] elements;
     private int size;
     public static final int DEFAULT_CAPACITY = 16;

     // Construct a stack with the default capacity 16:
     public StackOfIntegers()
     {
      this(DEFAULT_CAPACITY);
     }// end of StackOfStrings.
     
     //Construct a stack with the specified maximum capacity:  
     public StackOfIntegers(int capacity) 
     {
      elements = new int[capacity];   
     }// end of StackOfStrings.
     
     //Push a new integer into the top of the stack:
     public void push(int value) 
     {
      if (size >= elements.length) 
      {
        int[] temp = new int[elements.length * 2];
        System.arraycopy(elements, 0, temp, 0, elements.length);
        elements = temp;
      }
      elements[size++] = value;
     }// end of push.
     
     //Return and remove the top element from the stack:
     public int pop() 
     {
      return elements[--size];
     }// end of pop.

     // Return the top element from the stack:
     public int peek() 
     {
      return elements[size - 1];
     }// end of peek.

     //Test whether the stack is empty:
     public boolean empty() 
     {
      return size == 0;
     }// end of empty.

     //Return the number of elements in the stack:
     public int getSize() 
     {
      return size;
     }// end of getSize.
}// end of StackOfStrings.














