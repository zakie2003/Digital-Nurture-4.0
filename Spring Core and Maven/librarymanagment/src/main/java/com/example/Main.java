package com.example;
import com.library.service.BookServices;
import com.library.repository.BookRepository;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String[] args)
    {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml"))
        {
            BookServices bookService = (BookServices) context.getBean("bookService");
            BookRepository bookRepository = (BookRepository) context.getBean("bookRepository");

            System.out.println("--------------------My Output Starting--------------------");
            System.out.println();
            System.out.println(bookService.getBookTitle());
            System.out.println(bookRepository.findBookById(1));
            System.out.println();
            System.out.println("--------------------My Output Ending--------------------");
        }
    }
}