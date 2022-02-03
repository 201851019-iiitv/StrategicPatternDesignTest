public class PayWithPaytm implements IPaymentStrategy {

    String PaytmNumber;
    String PaytmPassword;


    public PayWithPaytm(String paytmNumber, String paytmPassword) {
        PaytmNumber = paytmNumber;
        PaytmPassword = paytmPassword;
    }

    @Override
    public void pay(int amount) {

        System.out.println("Amount "+amount +" with your paytm account .");

    }



}
