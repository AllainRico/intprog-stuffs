import java.util.*;
public class GotooFar{
   public static void main(String[] args){
   Scanner s = new Scanner(System.in);
      int array[] = new int[5];
      
      try{
         for(int i=1; i < 7; i++){
         System.out.print(i + " >> ");
         array[i] = s.nextInt();
         }
      }   
      catch(ArrayIndexOutOfBoundsException e){
         System.out.println("Now you\'ve gone too far");
      }    
      catch(InputMismatchException i){
         System.out.println("bogo man ka bai");
      }
   }
}