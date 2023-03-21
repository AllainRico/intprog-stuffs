import java.util.Scanner;
public class NegativeArray{
   public static void main(String[] args){
   Scanner s = new Scanner(System.in);
      try{
         String size = s.nextLine();
         int array[] = new int[Integer.parseInt(size)];
         
      }
      catch(NegativeArraySizeException n){
         System.out.println("-");
      }
      catch(NumberFormatException nu){
         System.out.println("!");
      }
   }
}