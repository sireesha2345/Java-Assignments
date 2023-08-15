package com.lumen.client;

import java.util.ArrayList;
import java.util.List;

import com.lumen.exceptions.BookNotFoundException;
import com.lumen.model.Book;
import com.lumen.services.BookServiceImpl;
import com.lumen.services.IBookService;

public class BookMain{

public static void main(String[] args) {
	IBookService bookService = new BookServiceImpl();
	List<Book> books = new ArrayList<>();
	books = bookService.getAll();
	System.out.println(books);
	try {
		books = bookService.getByAuthorContains("Jeff Kinney");
	} catch (BookNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(books);
	try {
		books = bookService.getByCategory("Tech");
		String booksByCategory = "Tech";
		if (booksByCategory.isEmpty()) {
			throw new BookNotFoundException("Sorry, Book Category not found!");
		}
	} catch (BookNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
		
	}

	System.out.println(books);
	try {
		books = bookService.getByAuthorContainsAndCategory("J. K. Rowling","super natural");
	} catch (BookNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(books);
	try {
		books = bookService.getByPriceLessThan(900.0);
	} catch (BookNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(books);
	
	
	
	
}
}