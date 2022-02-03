public class PayWithUPI implements IPaymentStrategy {

    String UpiId;
    String password ;


    public PayWithUPI(String upiId, String password) {
        UpiId = upiId;
        this.password = password;
    }


    @Override
    public void pay(int amount) {
        System.out.println("Amount "+amount +" paid with your upi account .");
    }
}
