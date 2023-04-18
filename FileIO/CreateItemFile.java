import java.util.*;
import java.io.*;

public class CreateItemFile{
   public static void main(String[] args){
      Scanner console = new Scanner(System.in);
      
      File thisfile = new File("items.txt");
      
      String itemnumber, description;
      HashSet<String> usedItems = new HashSet<>();
      
      int stop = 0;
      while(stop !=1){
         System.out.print("Item number>> ");
         itemnumber = console.next();
         
         if(usedItems.contains(itemnumber)){
            System.out.println("Error: Item number already used. Enter another item number please.");
            continue;
         }
         else{
            usedItems.add(itemnumber);
         }
         
         System.out.print("Item Description>> ");
         description = console.next();
         console.nextLine();
         
          try {
                FileWriter writer = new FileWriter(thisfile, true);
                writer.write("Item number : " + itemnumber + "\n" + "Description : " + description + "\n\n");
                writer.close();
                System.out.println("Customer information has been saved to file.");
            } catch (IOException e) {
                System.out.println("Error writing to file.");
                e.printStackTrace();
            }

         
         System.out.print("Stop?[1/0] ");
         stop = console.nextInt();
      }
      
   }
}