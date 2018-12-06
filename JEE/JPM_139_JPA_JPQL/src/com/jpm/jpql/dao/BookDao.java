/**
 * 
 */
package com.jpm.jpql.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jpm.jpql.entities.Book;
import com.jpm.jpql.util.JPAUtil;

/**
 * @author Administrator
 *
 */
public class BookDao implements IBookDao {
	private EntityManager entityManager;
	private Logger logger;
	
	public BookDao() {
		entityManager = JPAUtil.getEntityManager();
		logger = LoggerFactory.getLogger(BookDao.class);
	}
	
	@Override
	public Book getBookById(int id) {
		Book book = entityManager.find(Book.class, id);
		logger.info("Invoked getBookById() at BookDao for Id:" + id,book);
		return book;
	}

	@Override
	public List<Book> getBookByTitle(String title) {
		TypedQuery<Book> query = entityManager.createQuery("SELECT b FROM Book b WHERE b.title like :book_title",Book.class);
		query.setParameter("book_title","%"+ title + "%");
		List<Book> books = query.getResultList();
		logger.info("Invoked getBookByTitle() at BookDao for title:" + title,books);
		return books;
	}

	@Override
	public Long getBookCount() {
		TypedQuery<Long> query = entityManager.createQuery("SELECT count(b.id) FROM Book b",Long.class);
		Long count = query.getSingleResult();
		logger.info("Invoked getBookCount() at BookDao:",count);
		return count;
	}

	@Override
	public List<Book> getAuthorBooks(String author) {
		TypedQuery<Book> query = entityManager.createQuery("SELECT b FROM Book b WHERE b.author like :book_author",Book.class);
		query.setParameter("book_author", "%" + author + "%");
		List<Book> books = query.getResultList();
		logger.info("Invoked getAuthorBooks() at BookDao for author:" + author,books);
		return books;
	}

	@Override
	public List<Book> getAllBooks() {
		TypedQuery<Book> query = entityManager.createNamedQuery("getAllBooks", Book.class);
		List<Book> books = query.getResultList();
		logger.info("Invoked getAllBooks() at BookDao",books);
		return books;
	}

	@Override
	public List<Book> getBooksInPriceRange(double low, double high) {
		TypedQuery<Book> query = entityManager.createQuery("SELECT b FROM Book b WHERE b.price between :low_price and :high_price",Book.class);
		query.setParameter("low_price", low);
		query.setParameter("high_price", high);
		List<Book> books = query.getResultList();
		logger.info("Invoked getBooksInPriceRange() at BookDao for range:" + low + "-" + high,books);
		return books;
	}
}
