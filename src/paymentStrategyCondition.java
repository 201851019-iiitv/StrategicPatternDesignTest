import java.util.Date;
import java.util.HashMap;
import java.util.Optional;

public class paymentStrategyCondition {

   private final HashMap<String, IPaymentStrategy> paymentGateways=new HashMap<>();;

    public paymentStrategyCondition() {
        paymentGateways.put("UPI" ,new PayWithUPI("ambesh1212@paytm","12121"));
        paymentGateways.put("Paytm" ,new PayWithPaytm("1234567890","12121"));
        paymentGateways.put("DebitCard" ,new PayWithDebitCard("ambesh","12121",1234,new Date()));
        paymentGateways.put("CreditCard" ,new PayWithCreditCard("ambesh","12121",1234,new Date()));


    }

    public IPaymentStrategy getPaymentMethod(String paymentMethod) {
        IPaymentStrategy paymentStrategy;
        try {
             paymentStrategy = paymentGateways.get(paymentMethod);
        }
        catch (Exception e){
               throw  new NullPointerException("Payment Method does not exist !");
        }

        return paymentStrategy;
    }

}
