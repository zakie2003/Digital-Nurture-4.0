package com.library.service;

import com.library.repository.BookRepository;

public class BookServices {
    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public String getBook(){
        return "Book with ID: " + bookRepository.getBookinfo();
    }
    
    public String getBookTitle() {
        return "The Great Gatsby";
    }
}
