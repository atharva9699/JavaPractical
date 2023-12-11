public interface strategyDesignPattern //PaymentStrategy
 { 
    public void pay(int amount);
}


//----------------------------------------------------------------

public class CreditCardPayment implements PaymentStrategy{ 
    private String cardNo;
    public CreditCardPayment(String cardNo) { 
        this.cardNo=cardNo;
        }

    public void pay(int amount) 
    {
        System.out.println("Paid"+ amount +"using card number"+ cardNo);
    }
}




//----------------------------------------------------------------

public class PaypalPayment implements PaymentStrategy{ 
    private String email;
public PaypalPayment(String email) { 
    this.email=email;
}

public void pay(int amount) {
    System.out.println("paid"+ amount +"using email id"+ email);
}
}


//----------------------------------------------------------------


public class BitCoinAddressPayment implements PaymentStrategy{
    private String bitcoin;
public BitCoinAddressPayment(String bitcoin) { 
    this.bitcoin=bitcoin;
}
public void pay(int amount) {
System.out.println("Paid"+ amount +"using bitcoin address"+ bitcoin);
}
}



//----------------------------------------------------------------


public class Shoppingcart{
private PaymentStrategy paymentStrategy;

public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
    this.paymentStrategy=paymentStrategy; }
public void output(int amount) { 
    paymentStrategy.pay(amount);
} }




//----------------------------------------------------------------


public class Main {
    private static PaymentStrategy bitcoin; 
    private static PaymentStrategy email; 
    private static PaymentStrategy cardNo;
    public static void main(String[] args) {
PaymentStrategy cardNo =new CreditCardPayment("1234-5678-9101112");

PaymentStrategy email =new PaypalPayment("example014@gmail.com");
PaymentStrategy bitcoin=new BitCoinAddressPayment("1a2b3c4d-5E6F7G8H");
Shoppingcart s=new Shoppingcart(); s.setPaymentStrategy(cardNo); s.output(100);
s.setPaymentStrategy(email); s.output(222);
s.setPaymentStrategy(bitcoin); s.output(123);
}

}