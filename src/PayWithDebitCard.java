import java.util.Date;

public class PayWithDebitCard implements IPaymentStrategy {

        String name;
        String CardNumber;
        int cvv;
        Date expiryDate;

        public PayWithDebitCard(String name, String cardNumber, int cvv, Date expiryDate) {
                this.name = name;
                CardNumber = cardNumber;
                this.cvv = cvv;
                this.expiryDate = expiryDate;
        }


        @Override
        public void pay(int amount) {
                System.out.println("Amount "+amount +" paid with your debit card .");
        }
}
