package com.jatin.book_project;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jatin.book_project.model.Book;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        BeanFactory context = new ClassPathXmlApplicationContext("Beans.xml");

        Book b1 = (Book) context.getBean("book1");
        Book b2 = (Book) context.getBean("book2");
        Book b3 = (Book) context.getBean("book3");
        Book b4 = (Book) context.getBean("book4");
        Book b5 = (Book) context.getBean("book5");
        Book b6 = (Book) context.getBean("book6");

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
        System.out.println(b6);

        ((AbstractApplicationContext) context).close();
    }
}
