package com.jpm.jpql.client;

import com.jpm.jpql.services.BookService;
import com.jpm.jpql.services.IBookService;

public class BookClient {
	public static void main(String[] args){
		IBookService service = new BookService();
		System.out.println();
		System.out.println("*********************Listing book with id 101*******************");
		System.out.println("Book with ID 101: " + service.getBookById(101));
		
		System.out.println();
		System.out.println("*********************Listing book with title 'EE'*******************");
		System.out.println("Book with ID 'Pro Java 8 Programming': " + service.getBookByTitle("EE"));
		
		System.out.println();
		System.out.println("*********************Listing book with author 'Budi'*******************");
		System.out.println("Book with ID 'Pro Java 8 Programming': " + service.getAuthorBooks("Budi"));
		
		System.out.println();
		System.out.println("*********************Listing book with price between 300 and 500*******************");
		System.out.println("Book with ID 'Pro Java 8 Programming': " + service.getBooksInPriceRange(300, 500));
		
		System.out.println();
		System.out.println("*********************Total Book Count*******************");
		System.out.println("Total Books : " + service.getBookCount());
		
		System.out.println();
		System.out.println("*********************Listing All books *******************");
		System.out.println("Books : " + service.getAllBooks());
		
		
	}
}
