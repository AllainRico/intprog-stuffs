import java.util.*;
import java.io.*;
public class CreateCustomerFile{
   public static void main(String[] args){
      File thisfile = new File("customers.txt");
      
      String lastname=null, ID=null, zipcode=null;
      
      HashSet<String> usedIds = new HashSet<>();
      
      int stop = 0;
      while(stop != 1){
         Scanner console = new Scanner(System.in);
         System.out.print("ID>> ");
         ID = console.next();
         if (usedIds.contains(ID)) {
         System.out.println("Error: ID number already in use. Please enter a different ID number.");
         ID = null;
         continue; 
         }
         else{
            usedIds.add(ID);
         }
                  
         System.out.print("lastname>> ");
         lastname = console.next();
         if(lastname.length() > 7){
            System.out.println("input too long");
            continue;
         }
         else if(lastname.length() < 7){
            System.out.println("input too short");
            continue;
         }
         System.out.print("zipcode>> ");
         zipcode = console.next();
        
         
       try {
                FileWriter writer = new FileWriter(thisfile, true);
                writer.write("ID : " + ID + "\n" + "Customer Name : " + lastname + "\n" + "Zip Code : " + zipcode + "\n\n");
                writer.close();
                System.out.println("Customer information has been saved to file.");
            } catch (IOException e) {
                System.out.println("Error writing to file.");
                e.printStackTrace();
            }
            
         System.out.print("stop?");
         stop = console.nextInt();
     }

   }
}