import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book {
    private String bookId;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrow() {
        isAvailable = false;
    }

    public void returnBook() {
        isAvailable = true;
    }
}

class Patron {
    private String patronId;
    private String name;

    public Patron(String patronId, String name) {
        this.patronId = patronId;
        this.name = name;
    }

    public String getPatronId() {
        return patronId;
    }

    public String getName() {
        return name;
    }
}

class Library {
    private List<Book> books;
    private List<Patron> patrons;

    public Library() {
        books = new ArrayList<>();
        patrons = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addPatron(Patron patron) {
        patrons.add(patron);
    }

    public void borrowBook(Book book, Patron patron) {
        if (book.isAvailable()) {
            book.borrow();
            System.out.println("Book " + book.getTitle() + " borrowed by " + patron.getName());
        } else {
            System.out.println("Book " + book.getTitle() + " is not available for borrowing.");
        }
    }

    public void returnBook(Book book) {
        book.returnBook();
        System.out.println("Book " + book.getTitle() + " returned to the library.");
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("===== Library Management System =====");
            System.out.println("1. Borrow a Book");
            System.out.println("2. Return a Book");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1) {
                System.out.println("\n== Borrow a Book ==\n");
                System.out.print("Enter your name: ");
                String patronName = scanner.nextLine();

                System.out.println("\nAvailable Books:");
                for (Book book : books) {
                    if (book.isAvailable()) {
                        System.out.println(book.getBookId() + " - " + book.getTitle() + " by " + book.getAuthor());
                    }
                }

                System.out.print("\nEnter the book ID you want to borrow: ");
                String bookId = scanner.nextLine();

                Patron newPatron = new Patron("PAT" + (patrons.size() + 1), patronName);
                addPatron(newPatron);

                Book selectedBook = null;
                for (Book book : books) {
                    if (book.getBookId().equals(bookId) && book.isAvailable()) {
                        selectedBook = book;
                        break;
                    }
                }

                if (selectedBook != null) {
                    borrowBook(selectedBook, newPatron);
                } else {
                    System.out.println("\nInvalid book selection or book not available for borrowing.");
                }
            } else if (choice == 2) {
                System.out.println("\n== Return a Book ==\n");
                System.out.print("Enter the book ID you want to return: ");
                String bookId = scanner.nextLine();

                Book bookToReturn = null;
                for (Book book : books) {
                    if (book.getBookId().equals(bookId) && !book.isAvailable()) {
                        bookToReturn = book;
                        break;
                    }
                }

                if (bookToReturn != null) {
                    returnBook(bookToReturn);
                } else {
                    System.out.println("Invalid book ID or book is not borrowed.");
                }
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("Invalid choice. Please enter a valid option.");
            }
        }

        System.out.println("\nThank you for using the Library Management System!");
    }
}

public class libraryMangement {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("B001", "To Kill a Mockingbird", "Harper Lee");
        Book book2 = new Book("B002", "1984", "George Orwell");
        Book book3 = new Book("B003", "Pride and Prejudice", "Jane Austen");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.menu();
    }
}

