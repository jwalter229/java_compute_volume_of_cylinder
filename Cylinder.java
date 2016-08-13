/*compute the volume of a cylinder
write  a program that reads in the radius and
length of a cylinder and computes the area
and volume using the following formulas
   area = radius * radius * 3.14
   volume =  area * length
*/

   //importing a scanner
   import java.util.Scanner;
   
//Name of the Class   
public class Cylinder {
   //compute the volume of a cylinder  
   
   //Main Method
   public static void main(String[] args) {
   
      //creating a new scanner
      Scanner input = new Scanner(System.in);
      
      //prompting the user to enter the radius
      System.out.println("Enter the radius: ");      
      //taking input from a user for the radius
      double radius = input.nextDouble();
            
      //prompting the user to enter the length
      System.out.println("Enter the length: ");
      //taking input from the user for the
      //length of a cylinder
      double length = input.nextDouble();
      
      //calculating the area of a cylinder
      double area = radius * radius * 3.14;
      //calculating the volume of a cylinder
      double volume = area * length;
      
      //displaying the area of the cylinder
      System.out.println("Area: " + area);
      //displaying the volume of a cylinder
      System.out.println("Volume: " + volume);      
   
   }
}//end of cylinder class         
