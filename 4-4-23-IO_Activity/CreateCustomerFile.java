//force the customer name to seven characters if it is too long or too short. 
//Issue an error message, and do not save the records 
//if the user tries to save a record with an ID number that has already been used
import java.io.*;
import java.util.*;

public class CreateCustomerFile{

   public static void main(String[] args){
         Scanner console = new Scanner(System.in);
         int id_num;
         String lastname;
         int zipcode;

         try{
         PrintWriter out = new PrintWriter("Customer_File.txt");
            System.out.print("three-digit ID num >> ");
            id_num = console.nextInt();
            System.out.print("Six-character Lastname >> ");
            lastname = console.next();
            CheckLastName(lastname);
            System.out.print("Five-digit Zipcode >> ");
            zipcode = console.nextInt();
            
            //if lastname > 6
          out.println("ID Number: " + id_num);
          out.println("Last Name: " + lastname);
          out.println("Zipcode: " + zipcode);
          out.close();
         }
         catch(Exception e){
            System.out.println("Error! Input will not be saved!");
         }
         
   }
   public static void CheckLastName(String lastN){
      String s = lastN;
      if(s.length() > 6){
         System.out.println("Error! The input is too long!");
         System.exit(1);
      }
      else if(s.length() < 6){
         System.out.println("Error! The input is too short!");
         System.exit(1);
      }
      
   }
}