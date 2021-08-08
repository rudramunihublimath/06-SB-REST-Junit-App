package com.io.junit.service;

import com.io.junit.binding.Book;
import org.springframework.stereotype.Service;


@Service
public class BookService {

	public boolean saveBook(Book book) {
		return true;
	}

}
