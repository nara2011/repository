package lesson27homework2;

public class Main {
	 public static void main(String[] args) {
		 CreditCardPayment creditCardPayment = new CreditCardPayment();
	        creditCardPayment.pay(1700.5);

	        Payment paypalPayment = new PayPalPayment();
	        paypalPayment.pay(789.75);
	    }
}
