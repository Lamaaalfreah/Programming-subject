package rectangletest;
/*
*Exercise ‐ Rectangle class:
*Design a class named Rectangle to represent a rectangle. The class contains:
* ■ Two double data fields named width and height that specify the width
  and height of the rectangle. The default values are 1 for both width and height.
* ■ A no‐arg constructor that creates a default rectangle.
* ■ A constructor that creates a rectangle with the specified width and height.
* ■ A method named getArea() that returns the area of this rectangle.
* ■ A method named getPerimeter() that returns the perimeter.
* Draw the UML diagram for the class and then implement the class.
* Write a test program that creates two Rectangle objects—one with width 4 and height 40
  and the other with width 3.5 and height 35.9.
* Display the width, height, area, and perimeter of each rectangle in this order.
*/
public class RectangleTest 
{
    public static void main(String[] args) 
    {    
        Rectangle Rectangle1 = new Rectangle();
        System.out.println("Rectangle1 width= " + Rectangle1.width);
        System.out.println("Rectangle1 hight= " + Rectangle1.hight);
        System.out.println("Rectangle1 Area= " + Rectangle1.getArea());
        System.out.println("Rectangle1 Perimeter= " + Rectangle1.getPerimeter());
        
        System.out.println("----------------------------");

        Rectangle Rectangle2 = new Rectangle(4,40);
        System.out.println("Rectangle2 width= " + Rectangle2.width);
        System.out.println("Rectangle2 hight= " + Rectangle2.hight);
        System.out.println("Rectangle2 Area= " + Rectangle2.getArea());
        System.out.println("Rectangle2 Perimeter= " + Rectangle2.getPerimeter());
    }// end of main.    
}// end of RectangleTest.

class Rectangle
{
  double width = 1;
  double hight = 1;
  
  Rectangle()
  {
  }//Rectangle1.
  
  Rectangle(double width, double hight)
  {
   this.width = width;
   this.hight = hight;
  }//Rectangle2.
  
  double getArea()
  {
      return width * hight;
  }// end of getArea.
  
   double getPerimeter()
  {
      return 2 * width * hight;
  }// end of getPerimeter.
}// end of Rectangle.





