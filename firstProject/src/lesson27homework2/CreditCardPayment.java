package lesson27homework2;
	public class CreditCardPayment extends Payment {
	    @Override
	    public void pay(double amount) {
	        System.out.println("Оплата картой на сумму " + amount);
	    }
}
