import java.util.Scanner;
public class exercise2{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      try{
         System.out.print("Try to enter a Double >>  ");
         String s = sc.next();
         Integer.parseInt(s);
      }
      
      catch(NumberFormatException n){
         System.out.println("You entered a double instead of an int");
      }
      
   }
}