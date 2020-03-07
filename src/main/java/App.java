import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class App {
    static Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        Book book1 = new Book("123456", "Story","Tas tur", 666);
        Book book2 = new Book("789056", "Story of Her Time","Her majesty", 13);
        Book book3 = new Book("234689", "Just A Story","Unknown", 420);
        Book book4 = new Book("313313", "Story of a story","No vina",81);

        BookShelf bookShelf = new BookShelf();
        bookShelf.add(book1);
        bookShelf.add(book2);
        bookShelf.add(book3);
        bookShelf.add(book4);

        bookShelf.getBooks().forEach(book -> log.info(book.getTitle()));

        }
    }