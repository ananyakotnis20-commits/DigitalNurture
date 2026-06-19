
public class StrategyTest {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setStrategy(new CreditCardPayment("1234-5678-9012"));
        context.executePayment(150.00);

        context.setStrategy(new PayPalPayment("user@gmail.com"));
        context.executePayment(75.50);
    }
}