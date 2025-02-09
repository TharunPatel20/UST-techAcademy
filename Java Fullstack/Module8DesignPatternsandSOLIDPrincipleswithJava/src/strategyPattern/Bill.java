package strategyPattern;

import java.util.List;

/* 
	You need to develop payment	strategies for billing of RioParana according to Strategy pattern and implement in the Bill class
	At present The Bill class is as follows: 
	Class Bill{ 
	private Integer billNumber; 
	private String customerName; 
	private List<Order> orderList; 
	private Double billAmount; 
	private Double finalAmount; 
	getter/setter methods 
	}; 

The finalAmount is amount billAmount plus any extra charge. 
You are required to recreate the class to fit as per strategy.
*/


public class Bill {
	private int billNumber; 
	private String customerName; 
	private List<Order> orderList; 
	private double billAmount; 
	private double finalAmount;
	private PaymentStrategy paymentStrategy;
	
	//getter/setter methods
	
	public Bill(Integer billNumber, String customerName, List<Order> orderList, PaymentStrategy paymentStrategy) {
		
		this.billNumber = billNumber;
		this.customerName = customerName;
		this.orderList = orderList;
		this.paymentStrategy = paymentStrategy;
		getTotalBillAmount();
	}

	private void getTotalBillAmount() {
		this.billAmount = orderList.stream().mapToDouble(order->order.getTotalPrice()).sum();
	}
	
	
	void processPayment() {
		paymentStrategy.collectPaymentDetails();
		this.finalAmount = paymentStrategy.calculateTotalAmount(billAmount);
		System.out.println("total Amount to be paid by "+ customerName+" : "+ String.format("%.2f",finalAmount) +"/rs-");
	}
	
}
