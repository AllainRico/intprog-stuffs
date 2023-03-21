public abstract class Animal{
   public abstract String sound();
   private String name;
   private int age;
   private String breed;
 
 //constructors
   public Animal(String name, int age, String breed){
      this.name = name;
      this.age = age;
      this.breed = breed;
 }
 
 public Animal(){}

 //setters
 public void setName(String name){
  if(name != null)
   this.name = name;
 }
 
 public void setAge(int age){
  if(age <= 50)
   this.age = age;
 }
 
 public void setBreed(String breed){
  this.breed = breed;
 }
 
 //getters
 public String getName(){
  return name;
 }
 
 public String getBreed(){
  return breed;
 }
 
 public int getAge(){
  return age;
 }
 
 //toString()
 public String toString(){
  return "Name: " +  getName() + "\n" + "Breed: " + getBreed() + "\n" + "Age: " + getAge() +"\n";
 }
}