package lesson27homework2;
	public class PayPalPayment extends Payment {
	    @Override
	    public void pay(double amount) {
	        System.out.println("Оплата через PayPal на сумму " + amount);
	    }
}
