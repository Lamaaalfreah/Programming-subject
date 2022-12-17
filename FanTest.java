package fantest;
/*
Homework ‐ Fan class:
Design a class named Fan to represent a fan. The class contains:
■ Three constants named SLOW, MEDIUM, and FAST with the values 0, 1, and 2 to denote the fan speed.
■ A private int data field named speed that specifies the speed of the fan (the default is SLOW).
■ A private boolean data field named on that specifies whether the fan is on (the default is false).
■ A private double data field named radius that specifies the radius of the fan (the default is 4).
■ A string data field named color that specifies the color of the fan (the default is red).
■ The accessor and mutator methods for all four data fields.
■ A no‐arg constructor that creates a default fan.
■ A no‐arg constructor that creates a default fan.
■ A method named toString() that returns a string description for the fan. 
If the fan is on, the method returns the fan speed, color, and radius in one combined string.
If the fan is not on, the method returns the fan color and radius along with the string “fan is off” in one combined string.
Draw the UML diagram for the class and then implement the class.
Write a test program that creates two Fan objects.
Assign maximum speed, radius 10, color yellow, and turn it on to the first object.
Assign medium speed, radius 4, color red, and turn it off to the second object. 
Display the objects by invoking their toString method.
*/    
public class FanTest 
{
    public static void main(String[] args) 
    {
    Fan fan1 = new Fan ();
    fan1.setSpeed(Fan.FAST);
    fan1.setRadius(10);
    fan1.setColor("yellow");
    fan1.setOn(true);
    System.out.println(fan1.toString());
    
    Fan fan2 = new Fan();
    fan2.setSpeed(Fan.MEDIUM);
    fan2.setRadius(4);
    fan2.setColor("red");
    fan2.setOn(false);
    System.out.println(fan2.toString());
    }// end of main.
}// end of AccountTest.

class Fan 
{
    public final static int SLOW = 0;
    public final static int MEDIUM = 1;
    public final static int FAST = 2;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 4;
    String color = "red";
    String information;
 
 Fan()
 {
         
 }// Fan1.
 
 int getSpeed()
 {
   return speed;
 }// end of getSpeed.
 
 boolean getOn()
 {
   return on;
 }// end of getOn.
 
 double getRadius()
 {
   return radius;
 }// end of getRadius.
 
 String getColor()
 {
   return color;
 }// end of getcolor.
 
 void setSpeed(int speed)
 {
   this.speed = speed;
 }// end of setSpeed.
 
 void setOn(boolean on)
 {
   this.on = on;
 }// end of setOn.
 
 void setRadius(double radius)
 {
  this.radius = radius;
 }// end of setRadius.
 
 void setColor(String color)
 {
   this.color = color;
 }// end of setColor.
  
 public String toString()
 {
   if ( on == true)
   {
    information = ("Fan is On | Speed = " + speed + " | Color = " + color + " | Radius = " + radius);
   }
   else
   {
    information = ("Fan is Off | Speed = " + speed + " | Color = " + color + " | Radius = " + radius);
   }
   return information;
 }// end of toString.
}// end of Fan.

  
