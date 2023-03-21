public class Order{
   private String custName;
   private int custNumber, quantity;
   private double totalPrice, unitPrice;
   
   public void setcustName(String custName){
      this.custName = custName;
   }
   public void setcustNumber(int custNumber){
      this.custNumber = custNumber;
   }
   public void setcustQuantity(int custQuantity){
      this.quantity = custQuantity;
   }
   public void setUnitPrice(double unitPrice){
      this.unitPrice = unitPrice;
   }
      
   public String getcustName(){
      return this.custName;
   }
   public int getcustNumber(){
      return this.custNumber;
   }
   public int getQuantity(){
      return this.quantity;
   }
   
   public double getUnitPrice(){
      return this.unitPrice;
   }
   
   public double computeTotal(double quantity, double unitPrice){
      return quantity * unitPrice;
   }
   public void displayValues(){
      System.out.println("name : "+ getcustName() + 
                       "\nnumber: " + getcustNumber() +
                       "\nquantity: " + getQuantity() + 
                       "\nunitp: " + getUnitPrice() + 
                       "\ntotal: " + computeTotal(getQuantity(), getUnitPrice()));
   }
}