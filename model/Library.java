package com.library.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.stereotype.Component;


@Entity
@Component
public class Library {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private long number;
	private String name;
	private float price;
	
	public Library() {
		
	}
	
	
	public Library(int id, long number, String name, float price) {
		super();
		this.id = id;
		this.number = number;
		this.name = name;
		this.price = price;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Library [id=" + id + ", number=" + number + ", name=" + name + ", price=" + price + "]";
	}
	

}
