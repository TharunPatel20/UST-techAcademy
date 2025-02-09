package practice.spring_practice.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Product {
	private int productId;
	private String productName;
	private double productPrice;
	private double productRating;
	private String productUrl;
}
