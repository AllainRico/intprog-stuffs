public class Dog extends Animal{

   Dog(String name, int age, String breed){
   super(name, age, breed);
   }
   
   public String sound(){
      return "ARF!";
   }
}