package strategyPattern;

import java.util.ArrayList;
import java.util.List;

//Problem Statement: Strategy Pattern 
public class StrategyMain {
	public static void main(String[] args) {
//	i am trying to add products to order-list considering the products are present in the first place

		List<Order> myOrders = new ArrayList<Order>();
//		public Order(int id, String name, double price, double orderedQuantity)
		myOrders.add(new Order(1, "book", 50.0, 3));
		myOrders.add(new Order(2, "pen", 5.0, 4));
		myOrders.add(new Order(3, "scale", 15.5, 1));
		
		PaymentStrategy netBanking = new NetBankingPayment();
		PaymentStrategy creditCard = new CreditCardPayment();
		PaymentStrategy epayment = new Epayment();
		
//		public Bill(Integer billNumber, String customerName, List<Order> orderList, PaymentStrategy paymentStrategy) {		
//		 new Bill(1, "user1", myOrders, epayment).processPayment();
//		 new Bill(1, "user2", myOrders, netBanking).processPayment();
//		 new Bill(1, "user3", myOrders, creditCard).processPayment();
		
//		factoryMethod
		BillFactory bill = new BillFactory();
		bill.calculateBill(1, "user1", myOrders, epayment).processPayment();
		bill.calculateBill(1, "user2", myOrders, netBanking).processPayment();
		bill.calculateBill(1, "user3", myOrders, creditCard).processPayment();
	}			
}
	
	class BillFactory{
		public Bill calculateBill(int billNumber, String customerName, List<Order> orderList, PaymentStrategy paymentStrategy) {
			return new Bill( billNumber, customerName, orderList, paymentStrategy);
		}
	}


