package com.cg.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import com.cg.entities.*;

@Entity
@Table(name="Author")
public class Author {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer ID;
	private String name;
	
	/**
	 * Author have MANY TO MANY relationship with Book
	 * As an Author can have multiple Books 
	 * */
	@ManyToMany(targetEntity=Book.class)
	private Book books;
	
	public Author() {
		// TODO Auto-generated constructor stub
	}

	public Author(Integer iD, String name, Book books) {
		super();
		ID = iD;
		this.name = name;
		this.books = books;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Book getBooks() {
		return books;
	}

	public void setBooks(Book books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Author [ID=" + ID + ", name=" + name + ", books=" + books + "]";
	}
	
	
}
