
import java.util.ArrayList;

public class Library {
    
    private ArrayList<Book> books;
    
    public Library() {
        this.books = new ArrayList<Book>();
    }
    
    public void addBook(Book newBook) {
        this.books.add(newBook);
    }
    
    public void printBooks() {
        for (Book b : this.books) {
            System.out.println(b);
        }
    }
    
    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> theBooks = new ArrayList<Book>();
        for (Book b : this.books) {
            if (StringUtils.included(b.title(), title)) {
                theBooks.add(b);
            }
        }
        return theBooks;
    }
    
    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> theBooks = new ArrayList<Book>();
        for (Book b : this.books) {
            if (StringUtils.included(b.publisher(), publisher)) {
                theBooks.add(b);
            }
        }
        return theBooks;        
    }
    
    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> theBooks = new ArrayList<Book>();
        for (Book b : this.books) {
            if (b.year()== year) {
                theBooks.add(b);
            }
        }
        return theBooks;          
    }
}
