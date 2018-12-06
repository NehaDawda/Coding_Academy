package com.jpm.jpql.dao;

import java.util.List;

import com.jpm.jpql.entities.Book;

public interface IBookDao {

	public abstract Book getBookById(int id);

	public abstract List<Book> getBookByTitle(String title);

	public abstract Long getBookCount();

	public abstract List<Book> getAuthorBooks(String author);

	public abstract List<Book> getAllBooks();

	public abstract List<Book> getBooksInPriceRange(double low, 
			double high);

}