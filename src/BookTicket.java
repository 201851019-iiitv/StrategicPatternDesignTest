import java.util.Date;
import java.util.Optional;

public class BookTicket {

    String passengerName ;
    String toStation;
    String fromStation;
    Date journeyDate;
     int ticketPrice;



    public BookTicket(String passengerName, String toStation, String fromStation, Date journeyDate, int ticketPrice) {
        this.passengerName = passengerName;
        this.toStation = toStation;
        this.fromStation = fromStation;
        this.journeyDate = journeyDate;
        this.ticketPrice = ticketPrice;
    }

    public void payAmount(String paymentMethod) throws Exception {
        PaymentStrategy getPaymentGateways = new paymentStrategyCondition().getPaymentMethod(paymentMethod).orElseThrow(()->new NullPointerException("No payment method found !"));
        getPaymentGateways.pay(this.ticketPrice);
    }
}
