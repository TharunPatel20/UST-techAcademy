package strategyPattern;

import java.util.Date;

/*
 * A customer can purchase multiple items then pay through either credit-card,net-banking or e-payment procedure like payPal,payTM etc. 
  	
	RioParana levies:- 
	for credit-card no extra charges but entry of card number & expiry date, 
	for net-banking 2.5% of total billing amount as banking charge and entry of bank name, a/c number ,ifsc-code , 
	for e-payment 5% of total billing amount as charge, name of cash card (i.e	payPal or payTM etc), card number date of expiry.
	
 */


public interface PaymentStrategy {

	 void collectPaymentDetails();
	 double calculateTotalAmount(double billAmount);
}

//for credit-card no extra charges but entry of card number & expiry date, 
class CreditCardPayment implements PaymentStrategy{
	
	private String CardNO;
	private Date expiryDate;

	@Override
	public void collectPaymentDetails() {
		System.out.println("supposed to enter card details like, card number and expiry date");
		
	}

	@Override
	public double calculateTotalAmount(double billAmount) {
		return billAmount;
	}
	
}

//for net-banking 2.5% of total billing amount as banking charge and entry of bank name, a/c number ,ifsc-code , 
class NetBankingPayment implements PaymentStrategy{
	
	private String AccountNO;
	private String IFSCcode;
	private String BankName;
	

	@Override
	public void collectPaymentDetails() {
		System.out.println("supposed to enter net-banking details : bank name, a/c number, ifsc-code ");
		
	}

	@Override
	public double calculateTotalAmount(double billAmount) {
		return (billAmount * 0.025) + billAmount;
	}
	
}

//for e-payment 5% of total billing amount as charge, name of cash card (i.e.. payPal or payTM etc), card number, date of expiry.
class Epayment implements PaymentStrategy{
	
	private String CardNO;
	private String expiryDate;
	private String name;

	@Override
	public void collectPaymentDetails() {
		System.out.println("supposed to enter card details like, name of cash card (i.e.. payPal or payTM etc), card number, date of expiry");
		
	}

	@Override
	public double calculateTotalAmount(double billAmount) {
		return billAmount +(billAmount* 0.05);
	}
	
}