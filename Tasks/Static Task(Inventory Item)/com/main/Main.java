package com.main;
import com.InventoryItem.InventoryItem;

public class Main {
	public static void main(String args[]) {
		InventoryItem item1 = new InventoryItem();
		item1.itemName = "Laptop";
		item1.quantity = 3;
		InventoryItem.totalItems += 3;
		
		InventoryItem item2 = new InventoryItem();
		item2.itemName = "Mobile";
		item2.quantity = 5;
		InventoryItem.totalItems += 5;
		
		InventoryItem item3 = new InventoryItem();
		item3.itemName = "Books";
		item3.quantity = 20;
		InventoryItem.totalItems += 20;
		
		item1.addToInventory(2);
		item2.addToInventory(5);
		item3.addToInventory(15);
		
		
		item1.removeFromInventory(1);
		item2.removeFromInventory(2);
		item3.removeFromInventory(3);
		
		System.out.println("Total items in the stock: " + InventoryItem.getTotalItems());
	}
}
