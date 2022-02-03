import java.util.Date;
import java.util.HashMap;
import java.util.Optional;

public class paymentStrategyCondition {

   private final HashMap<String,PaymentStrategy> paymentGateways=new HashMap<>();;

    public paymentStrategyCondition() {
        paymentGateways.put("UPI" ,new PayWithUPI("ambesh1212@paytm","12121"));
        paymentGateways.put("Paytm" ,new PayWithPaytm("1234567890","12121"));
        paymentGateways.put("DebitCard" ,new PayWithDebitCard("ambesh","12121",1234,new Date()));
        paymentGateways.put("CreditCard" ,new PayWithCreditCard("ambesh","12121",1234,new Date()));


    }

    public Optional<PaymentStrategy> getPaymentMethod(String paymentMethod) {
        return Optional.ofNullable(paymentGateways.get(paymentMethod));
    }

}
