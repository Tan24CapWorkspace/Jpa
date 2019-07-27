package com.cg.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Book")
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer ISBN;
	private String title;
	private Double price;
	
	/**
	 * Book have MANY TO MANY relationship with Author
	 * As a Book can have multiple Authors 
	 * */
	@ManyToMany(targetEntity=Author.class)
	private Author authors;
	
	
	public Book() {
		// TODO Auto-generated constructor stub
	}


	public Book(Integer iSBN, String title, Double price, Author authors) {
		super();
		ISBN = iSBN;
		this.title = title;
		this.price = price;
		this.authors = authors;
	}


	public Integer getISBN() {
		return ISBN;
	}


	public void setISBN(Integer iSBN) {
		ISBN = iSBN;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	public Author getAuthors() {
		return authors;
	}


	public void setAuthors(Author authors) {
		this.authors = authors;
	}


	@Override
	public String toString() {
		return "Book [ISBN=" + ISBN + ", title=" + title + ", price=" + price + ", authors=" + authors + "]";
	}
	
	
}
