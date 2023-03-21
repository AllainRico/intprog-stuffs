//allain rico muana
import java.util.Scanner;

public class Main{
Animal [] farm;
   int count;
 public Main(int size){
  farm = new Animal[size];
  count = 0;
 }
 
 public Main(){
  this(50);
 }
 
 public String displayAll(){
  StringBuffer sb = new StringBuffer();
  for(int i = 0; i < count; i++)
   sb.append(farm[i] +"\n");
  return sb.toString();
 }
 
 public void add(Animal a){
  farm[count++] = a;
 }

   public static void main(String[] args){
         Scanner scan = new Scanner(System.in);

        //  //outside the loop
        String name, breed;
        int age;
        int dog = 0, cow = 0, cat = 0;
         int count; //limits how many animals
         String type;
         
         System.out.print("Enter how many many Animals to add >> ");
         count = scan.nextInt();
         
         Main farm = new Main();
         for(int i = 0; i < count; i++){
            System.out.print("Enter type of Animal >> ");
            type = scan.next().toLowerCase();
            
            System.out.print("Enter name > ");
            name = scan.next();
            System.out.print("Enter age > ");
            age = scan.nextInt();
            System.out.print("Enter breed > ");
            breed = scan.next();
            
            if(type.equals("dog")){
               farm.add(new Dog(name,age,breed));
               System.out.println("Successfully added!");
               dog++;
            }
            else if(type.equals("cat")){
               farm.add(new Dog(name,age,breed));
               System.out.println("Successfully added!");
               cat++;
            }
            else if(type.equals("cow")){
               farm.add(new Dog(name,age,breed));
               System.out.println("Successfully added!");
               cow++;
            }
            else{
               System.out.println("error. entered animal is not acceptable!");
            }
            System.out.print("-----------------------------------\n");
         }//end loop
         
            System.out.println(farm.displayAll());
            System.out.println("Dog: " + dog +  " Cat: " + cat +  " Cow: " + cow );       
    }
}