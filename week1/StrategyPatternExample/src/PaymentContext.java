public class PaymentContext {
    private PaymentStrategy strategy;
    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;       // swap strategy anytime!
    }

    public void executePayment(double amount) {
        strategy.pay(amount);
    }
}
