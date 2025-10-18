package com.ecomm.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class CartItem 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int ci_id;
	
	@ManyToOne
	@JoinColumn(name="cid")
	private Cart cart;
	
	@OneToOne
	private Product p;

	public int getCi_id() {
		return ci_id;
	}

	public void setCi_id(int ci_id) {
		this.ci_id = ci_id;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public Product getP() {
		return p;
	}

	public void setP(Product p) {
		this.p = p;
	}

	@Override
	public String toString() {
		return "CartItem [ci_id=" + ci_id + ", cart=" + cart + ", p=" + p + "]";
	}

	
	
	

}
