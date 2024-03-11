package com.InventoryItem;

public class InventoryItem{
	
	public static int totalItems = 0;
	public String itemName = "";
	public int quantity;
	
	public static int getTotalItems() {
		return totalItems;
	}
	
	public void addToInventory(int amount) {
		quantity += amount;
		totalItems += amount;
	}
	
	public void removeFromInventory(int amount) {
		if(quantity >= amount) {
			quantity -= amount;
			totalItems -= amount;
		}else {
			System.out.println("Not enought item in stock");
		}
	}
	
}




