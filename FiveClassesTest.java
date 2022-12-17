
package fiveclassestest;

public class FiveClassesTest
{
    public static void main(String[] args) 
    {
    student student = new student("Lama", 4250107);
    System.out.println("Student information: " + student.toString());
    faculty faculty = new faculty("Lama", 4250107, "student");
    System.out.println("Faculty information: " + faculty.toString());
    staff staff = new staff("Lama", 4250107, "a");
    System.out.println("Staff information: " + staff.toString());
    }// end of main.
}// end of FiveClassesTest.

class person
{
 private String name;   
 String getName()
 {    
  return name;
 }//end of getName.
 void setName(String name)
 {    
  this.name=name;
 }//end of setName.
}// end of person.

class student extends person
{
 private long studentID;
 student(String name, long studentID )
 {
  setName(name);
  this.studentID=studentID;
 }// end of student.
 @Override
 public String toString()
 {
   String information = "name: " + getName() + " | studentID: " + studentID;
   return information;
 }// end of toString.
}// end of student.

class employee extends person
{
 private int employeeID;
 int getEmployeeID()
 {    
  return employeeID;
 }//end of getEmployeeID.
 void setEmployeeID(int employeeID)
 {    
  this.employeeID=employeeID;
 }//end of setEmployeeID.
}// end of employee.

class staff extends employee
{
 private String title;
 staff(String name, int employeeID, String title)
 {
  setName(name);
  setEmployeeID(employeeID);
  this.title=title;   
 }// end of staff.
 @Override
 public String toString()
 {
   String information = "name: " + getName() + " | employeeID: " + getEmployeeID() + " | title: " + title;
   return information;
 }// end of toString.
}// end of staff.

class faculty extends employee
{
 private String rank;
 faculty(String name, int employeeID, String rank)
 {
  setName(name);
  setEmployeeID(employeeID);
  this.rank=rank;      
 }// end of faculty.
 @Override
 public String toString()
 {
   String information = "name: " + getName() + " | employeeID: " + getEmployeeID() + " | rank: " + rank;
   return information;
 }// end of toString.
}// end of faculty.
