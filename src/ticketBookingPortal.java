import java.util.Date;

public class ticketBookingPortal {

    public static void main(String[] args) throws Exception {

        BookTicket ticket=new BookTicket("ambesh","LKO","BSE",new Date(),100);

        // payment through upi
        ticket.payAmount("UPI");
        //payment through paytm
        ticket.payAmount("Paytm");
        // payment through credit card
        ticket.payAmount("CreditCard");
        // payment through debit card
        ticket.payAmount("DebitCard");


    }
}
