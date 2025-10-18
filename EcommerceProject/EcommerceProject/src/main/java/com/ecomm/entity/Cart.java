package com.ecomm.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import java.util.List;

@Entity
public class Cart 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cid;
	
	@OneToOne
	private User user;
	
	@OneToMany
	@JoinColumn(name="ci_id")
	private List<CartItem> clist;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<CartItem> getClist() {
		return clist;
	}

	public void setClist(List<CartItem> clist) {
		this.clist = clist;
	}

	@Override
	public String toString() {
		return "Cart [cid=" + cid + ", user=" + user + ", clist=" + clist + "]";
	}

}