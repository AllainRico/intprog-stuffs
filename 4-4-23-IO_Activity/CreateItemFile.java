//Todo: Write a program that creates a file of items carried by the company.
//Include a three-digit item number and up to a 20-character description for each item.
//Issue an error message if the user tries to store an item number that has already been used. 
//Save the program as CreateItemFile.java
import java.io.*;
import java.util.*;
public class CreateItemFile{
   public static void main(String[] args){
      Scanner console = new Scanner(System.in);
      int item_number;
      String item_description;
      
      System.out.print("Item number >> ");
      item_number = console.nextInt();
      System.out.print("Item Description >> ");
      item_description = console.next();
      
      
   }
}