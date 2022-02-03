import java.util.Date;

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
        IPaymentStrategy getPaymentGateways = new paymentStrategyCondition().getPaymentMethod(paymentMethod);
        getPaymentGateways.pay(this.ticketPrice);
    }
}
