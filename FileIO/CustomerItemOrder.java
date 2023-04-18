import java.util.*;
import java.io.*;

public class CustomerItemOrder{
   public static void main(String[] args){
      Scanner console = new Scanner(System.in);
      
      String customerNumber, itemNumber;
      
      
      System.out.print("Customer Number>> ");
      customerNumber = console.next();
      System.out.print("Item Number>> ");
      itemNumber = console.next();
      System.out.println("------------------------------------");
      
      String customer = "customers.txt";
      String item = "items.txt";
        
      ArrayList<String> userids = new ArrayList<String>();
      ArrayList<String> itemids = new ArrayList<String>();
              
        try (BufferedReader reader = new BufferedReader(new FileReader(customer))) {
            String line;
            while ((line = reader.readLine()) != null) {
                int startIndex = line.indexOf(": ") + 2; 
                int endIndex = line.length();
                if (startIndex != -1 && endIndex != -1 && startIndex < endIndex) {
                    String data = line.substring(startIndex, endIndex);
                    userids.add(data);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(userids.contains(customerNumber)){
             int indexofName = (userids.indexOf(customerNumber) + 1);
             int indexofZip = (userids.indexOf(customerNumber) + 2);
             System.out.println("Customer ID: " + userids.get(userids.indexOf(customerNumber)));
             System.out.println("Name: " + userids.get(indexofName));
             System.out.println("Zipcode: " + userids.get(indexofZip));
             System.out.println("------------------------------------");
        }
        else{
         System.out.println("Customer ID number does not exist!");
         System.out.println("------------------------------------");
        }
        
        try (BufferedReader reader = new BufferedReader(new FileReader(item))) {
            String line;
            while ((line = reader.readLine()) != null) {
                int startIndex = line.indexOf(": ") + 2; 
                int endIndex = line.length();
                if (startIndex != -1 && endIndex != -1 && startIndex < endIndex) {
                    String data = line.substring(startIndex, endIndex);
                    itemids.add(data);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(itemids.contains(itemNumber)){
             int indexofDescription = (itemids.indexOf(itemNumber) + 1);
             System.out.println("Item Number: " + itemids.get(itemids.indexOf(itemNumber)));
             System.out.println("Item Description: " + itemids.get(indexofDescription));
             System.out.println("------------------------------------");
        }
        else{
         System.out.println("Item ID number does not exist!");
         System.out.println("------------------------------------");
        }
   }
}