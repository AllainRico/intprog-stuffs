public class ShippedOrder extends Order{
   @Override
   public double computeTotal(double quantity, double unitPrice){
      return (quantity * unitPrice) + 4.00;
   }
}