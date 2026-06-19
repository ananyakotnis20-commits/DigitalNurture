public class CreditCardPayment implements PaymentStrategy{
    private String cardnumber;
    public CreditCardPayment(String cardnumber){
        this.cardnumber=cardnumber;
    }
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " via Credit Card: " + cardnumber);
    }
}
