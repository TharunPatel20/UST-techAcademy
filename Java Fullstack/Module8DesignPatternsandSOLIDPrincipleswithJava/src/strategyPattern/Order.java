package strategyPattern;

//RioParana allows customers to put order through website. For that purpose it has a class 
//public class Order{ 
//private Integer id; 
//private String name; 
//private Double price; 
//private Double orderedQuantity; 
////getter/setter & constructor 
//}

public class Order{ 
	private int id; 
	private String name; 
	private double price; 
	private double orderedQuantity; 
	
	//getter/setter & constructor 
	
	public Order(int id, String name, double price, double orderedQuantity) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.orderedQuantity = orderedQuantity;
	}
	
	double getTotalPrice() {
		return orderedQuantity * price;
		
	}

}