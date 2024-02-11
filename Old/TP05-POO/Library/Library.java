package Library;

import java.util.HashMap;

public class Library {
    private static HashMap<String,Book> books = new HashMap<String,Book>();
    public static void displayAllBooks(Book book) {
        System.out.println("the books we have are : ");
        for (String key : books.keySet()) {
            System.out.println(key);

        }
    }
    
    public static void removeBook(String book) {
        books.remove(book);
    }
    
    public static void addBook(Book book) {
        books.put(book.getTitle(), book);
    }
}
