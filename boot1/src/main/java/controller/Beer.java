package controller;

import javax.validation.constraints.Min;

public class Beer {
	private String color;
	
	@Min(300)
	private int beerPrice;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return beerPrice;
	}

	public void setPrice(int price) {
		this.beerPrice = price;
	}

}
