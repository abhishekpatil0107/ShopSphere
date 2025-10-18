package com.ecomm.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private String description;
	
	private double price;
	
	private int stock; 
	
	private String image_url;
	
	private String categary_name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getImage_url() {
		return image_url;
	}

	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}

	public String getCategary_name() {
		return categary_name;
	}

	public void setCategary_name(String categary_name) {
		this.categary_name = categary_name;
	}

	@Override
	public String toString() {
		return "Prouduct [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price
				+ ", stock=" + stock + ", image_url=" + image_url + ", categary_name=" + categary_name + ", getId()="
				+ getId() + ", getName()=" + getName() + ", getDescription()=" + getDescription() + ", getPrice()="
				+ getPrice() + ", getStock()=" + getStock() + ", getImage_url()=" + getImage_url()
				+ ", getCategary_name()=" + getCategary_name() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
