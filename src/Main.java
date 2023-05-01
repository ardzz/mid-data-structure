import Helper.DummyDataHandler;
import Items.AbstractItem;
import Items.Book;
import Items.Pen;
import Items.Ruler;
import LinkedList.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List[] available_items = new Main().importData();

        List available_books = available_items[0];
        List available_pens = available_items[1];
        List available_rulers = available_items[2];

        List books_cart = new List();
        List pens_cart = new List();
        List rulers_cart = new List();

        List books_sold = new List();
        List pens_sold = new List();
        List rulers_sold = new List();

        Scanner scanner = new Scanner(System.in);


    }

    public List[] importData(){
        DummyDataHandler dummy = new DummyDataHandler();

        Book book_instance = new Book();
        Pen pen_instance = new Pen();
        Ruler ruler_instance = new Ruler();

        JSONArray dummy_books = dummy.getDummyData(book_instance);
        JSONArray dummy_pens = dummy.getDummyData(pen_instance);
        JSONArray dummy_rulers = dummy.getDummyData(ruler_instance);

        List available_books = new List();
        List available_pens = new List();
        List available_rulers = new List();

        for (Object dummyBook : dummy_books) {
            JSONObject book = (JSONObject) dummyBook;
            String[] dummy_book_data = new String[]{
                    book.get(book_instance.getAttributeKey()[0]).toString(),
                    book.get(book_instance.getAttributeKey()[1]).toString(),
                    book.get(book_instance.getAttributeKey()[2]).toString(),
            };
            available_books.addLast(dummy_book_data, new Book());
        }

        for (Object dummyPen : dummy_pens) {
            JSONObject pen = (JSONObject) dummyPen;
            String[] dummy_pen_data = new String[]{
                    pen.get(pen_instance.getAttributeKey()[0]).toString(),
                    pen.get(pen_instance.getAttributeKey()[1]).toString(),
                    pen.get(pen_instance.getAttributeKey()[2]).toString(),
            };
            available_pens.addLast(dummy_pen_data, new Pen());
        }

        for (Object dummyRuler : dummy_rulers) {
            JSONObject ruler = (JSONObject) dummyRuler;
            String[] dummy_ruler_data = new String[]{
                    ruler.get(ruler_instance.getAttributeKey()[0]).toString(),
                    ruler.get(ruler_instance.getAttributeKey()[1]).toString(),
                    ruler.get(ruler_instance.getAttributeKey()[2]).toString(),
            };
            available_rulers.addLast(dummy_ruler_data, new Ruler());
        }
        return new List[]{available_books, available_pens, available_rulers};
    }
}
