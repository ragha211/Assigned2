public class Q12 {
    public static void main(String[] args) {
    }
    public class CreditCard {
        private double balance;
        public void makePayment(double amount) {
            if (amount < 0) {
                throw new IllegalArgumentException("Payment amount cannot be negative");
            }

            balance -= amount;
        }
    }
}
