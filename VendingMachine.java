public class VendingMachine {
    enum EPayment {
        PAYNOW, GRABPAY, FAVEPAY
    }

    public static void main(String[] args) {
        VendingMachine myVendingMachine = new VendingMachine();
        myVendingMachine.makePayment(10.0); // cash
        myVendingMachine.makePayment(EPayment.GRABPAY); // cashless, no amount needed
        myVendingMachine.makePayment(EPayment.FAVEPAY);
        myVendingMachine.makePayment(EPayment.PAYNOW);

    }

    public void makePayment(double amount) {
        System.out.println("Accepting cash payment of: " + amount);
        dispenseDrink();
    }

    public void makePayment(EPayment payment) {
        boolean paymentSuccess = switch (payment) {
            case PAYNOW -> connectPayNow();
            case GRABPAY -> connectGrabPay();
            case FAVEPAY -> connectFavePay();
        };

        if (paymentSuccess) {
            dispenseDrink();
        } else {
            System.out.println("Payment unsuccessful");
        }
    }

    private void dispenseDrink() {
        System.out.println("Dispensing drink...");
    }

    private boolean connectPayNow() {
        System.out.println("Connecting to PayNow...");
        System.out.println("PayNow success!");
        return true;
    }

    private boolean connectFavePay() {
        System.out.println("Connecting to FavePay...");
        System.out.println("FavePay success!");
        return true;
    }

    private boolean connectGrabPay() {
        System.out.println("Connecting to GrabPay...");
        System.out.println("GrabPay failed!");
        return false;
    }
}
