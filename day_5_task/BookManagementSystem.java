
package guvitask; 

import java.util.Scanner;

public class BookManagementSystem {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Library library = new Library();

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add a new book");
            System.out.println("2. Search for a book");
            System.out.println("3. Remove a book");
            System.out.println("4. Display all books");
            System.out.println("5. Exit");
            System.out.print("Enter an option: ");

            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    addBookToLibrary();
                    break;
                case 2:
                    searchForBookInLibrary();
                    break;
                case 3:
                    removeBookFromLibrary();
                    break;
                case 4:
                    displayAllBooksInLibrary();
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }

        scanner.close();
    }

    private static void addBookToLibrary() {
        System.out.print("Enter book ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter author name: ");
        String author = scanner.nextLine();

        Book newBook = new Book(id, title, author,false);
        library.addBook(newBook);
        System.out.println("Book added successfully.");
    }

    private static void searchForBookInLibrary() {
        System.out.print("Enter book ID to search: ");
        int id = scanner.nextInt();
        Book book = library.searchBook(id);

        if (book != null) {
            System.out.println("Book found: " + book);
        } else {
            System.out.println("Book not found.");
        }
    }

    private static void removeBookFromLibrary() {
        System.out.print("Enter book ID to remove: ");
        int id = scanner.nextInt();

        if (library.removeBook(id)) {
            System.out.println("Book removed successfully.");
        } else {
            System.out.println("Book not found or could not be removed.");
        }
    }

    private static void displayAllBooksInLibrary() {
        System.out.println("Displaying all books:");
        library.displayBooks();
    }
}
