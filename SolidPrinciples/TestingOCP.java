package SolidPrinciples;

interface Payment {
    void pay();
}

class CreditCardPayment implements Payment {
    public void pay() { System.out.println("Credit card payment"); }
}

class PaypalPayment implements Payment {
    public void pay() { System.out.println("PayPal payment"); }
}

class PaymentProcessor {
    public void process(Payment payment) {
        payment.pay();
    }
}

public class TestingOCP {

    public static void main(String[] args){
        PaymentProcessor p = new PaymentProcessor();
        p.process(new CreditCardPayment());
        p.process(new PaypalPayment());
    }
}
