package guvitask;

import java.util.ArrayList;
import java.util.List;

public class Library {
 private List<Book> books;

 public Library() {
     books = new ArrayList<>();
 }

 public void addBook(Book book) {
     books.add(book);
 }

 public boolean removeBook(int bookID) {
     return books.removeIf(book -> book.getBookID() == bookID);
 }

 public Book searchBook(int bookID) {
     for (Book book : books) {
         if (book.getBookID() == bookID) {
             return book;
         }
     }
     return null;
 }

 public void displayBooks() {
     for (Book book : books) {
         System.out.println(book);
     }
 }
}
