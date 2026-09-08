package com.task;

import java.util.ArrayList;
import java.util.List;

class Product {

	int productId;
	String productName;
	String category;
	double price;

	public Product(int productId, String productName, String category, double price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.category = category;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", category=" + category
				+ ", price=" + price + "]";
	}
}

class ProductManager {

	List<Product> products = new ArrayList<>();

	void addProduct(Product p) {
		products.add(p);
	}

	void displayProducts() {

		for (Product p : products) {
			System.out.println(p);
		}
	}

	void findProduct(int id) {

		for (Product p : products) {

			if (p.productId == id) {
				System.out.println("Product Found: " + p);
				return;
			}
		}

		System.out.println("Product Not Found");
	}

	void removeProduct(int id) {

		for (Product p : products) {

			if (p.productId == id) {
				products.remove(p);
				System.out.println("Product Removed");
				return;
			}
		}

		System.out.println("Product Not Found");
	}

	void displayByPrice(double amount) {

		for (Product p : products) {

			if (p.price > amount) {
				System.out.println(p);
			}
		}
	}
}

public class ProductManagementSystem {

	public static void main(String[] args) {
        ProductManager pm = new ProductManager();
        
        Product p1 = new Product(101, "Laptop", "Electronics", 50000);
        Product p2 = new Product(102, "Mobile", "Electronics", 25000);
        Product p3 = new Product(103, "Shoes", "Fashion", 3000);
        Product p4 = new Product(104, "Watch", "Fashion", 5000);

        pm.addProduct(p1);
        pm.addProduct(p2);
        pm.addProduct(p3);
        pm.addProduct(p4);

        System.out.println("All Products:");
        pm.displayProducts();

        System.out.println("Find Product ID 102:");
        pm.findProduct(102);

        System.out.println("Remove Product ID 104:");
        pm.removeProduct(103);

        System.out.println("Products After Removal:");
        pm.displayProducts();

        System.out.println("Products Price Greater Than 10000:");
        pm.displayByPrice(10000);


	}

}
