package com.library.repository;

public class BookRepository {

    private int id;
    private String title;

    public BookRepository(){}

    public BookRepository(int id,String title){
        this.id=id;
        this.title=title;
    }

    public String getBookinfo(){
        return "Book with ID: " + id + ":" + title;
    }

    public String findBookById(int id){
        return "Book with ID: " + id + " found in the repository.";
    }
}
