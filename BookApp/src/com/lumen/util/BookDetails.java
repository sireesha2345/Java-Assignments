package com.lumen.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.lumen.model.Book;


public class BookDetails {
	public static List<Book> BookList(){
		return Arrays.asList(
			new Book("Harry Potter", "J. K. Rowling", "super natural", 1, 900.90),
			new Book("Wimpy Kid", "Jeff Kinney", "Children's Book", 2, 300.68),
			new Book("Goosebumps", "R. L. Stine", "Tech", 3, 1900.45),
			new Book("The Daffodil Sky", "Jeff Kinney", "Children's Book", 4, 700.06),
			new Book("Java in Action", "Java DavJohn Hopper", "Selfhelp", 5, 800.56)
			);
	
	


	}
}