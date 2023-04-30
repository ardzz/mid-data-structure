import Items.Book;
import LinkedList.List;

public class Main {
    public static void main(String[] args) {
        List book = new List();
        book.addFirstPrompt(new Book());
        book.addFirstPrompt(new Book());
        book.print();
    }
}
