package com.main3;

import com.book.Book;

import com.publisher.Publisher;

public class Main {

	public static void main(String[] args) {
		
		Publisher publisherObject=Publisher.getPublisherObject("BOOKPublisher","hyd","PUB123");
		
		Book bookObject=Book.getBookObject("story", "ram",publisherObject, 100);
		
		System.out.println(bookObject);
		if( publisherObject==null) {
			System.out.println("invalid book details/publisher details");
		}
	}
	
}
