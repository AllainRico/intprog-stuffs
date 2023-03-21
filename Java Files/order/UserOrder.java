import java.util.*;
public class UserOrder{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String custName;
      int custNumber, quantity;
      double totalPrice, unitPrice;
      
      System.out.print("custName >> ");
      custName = sc.nextLine();
      System.out.print("custNumber >> ");
      custNumber = sc.nextInt();
      System.out.print("quantity >> ");
      quantity = sc.nextInt();
      System.out.print("unitPrice >> ");
      unitPrice = sc.nextDouble();
      
      Order order = new Order();
      order.setcustName(custName);
      order.setcustNumber(custNumber);
      order.setcustQuantity(quantity);
      order.setUnitPrice(unitPrice);
      order.displayValues();
      ShippedOrder uo = new ShippedOrder();
      System.out.print("total + shipping: " + uo.computeTotal(quantity,unitPrice));

   }
}