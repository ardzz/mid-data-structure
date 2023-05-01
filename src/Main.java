import Helper.DummyDataHandler;
import Items.*;
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

        List cart_books = new List();
        List cart_pens = new List();
        List cart_rulers = new List();

        List books_sold = new List();
        List pens_sold = new List();
        List rulers_sold = new List();

        Scanner scanner = new Scanner(System.in);

        int option = 0;
        while (option != 10){
            System.out.println("Welcome to the store!");
            System.out.println("1. View available items");
            System.out.println("2. Add available items");
            System.out.println("3. Remove available items");
            System.out.println("4. Add cart items from available items");
            System.out.println("5. View cart items");
            System.out.println("6. Remove cart items");
            System.out.println("7. Checkout");
            System.out.println("8. View sold items");
            System.out.println("9. Search available items");
            System.out.println("10. exit");

            System.out.println("Please select an option:");
            option = Integer.parseInt(scanner.next());

            switch (option) {
                case 1 -> {
                    int option1 = 0;
                    while (option1 != 4){
                        System.out.println("Available items:");
                        System.out.println("1. Books");
                        System.out.println("2. Pens");
                        System.out.println("3. Rulers");
                        System.out.println("Please select an option:");
                        option1 = Integer.parseInt(scanner.next());
                        switch (option1) {
                            case 1 -> {
                                System.out.println("Available books:");
                                available_books.print();
                            }
                            case 2 -> {
                                System.out.println("Available pens:");
                                available_pens.print();
                            }
                            case 3 -> {
                                System.out.println("Available rulers:");
                                available_rulers.print();
                            }
                        }
                    }
                }
                case 2 -> {
                    int option2 = 0;
                    while (option2 != 6){
                        System.out.println("1. Add after");
                        System.out.println("2. Add before");
                        System.out.println("3. Add first");
                        System.out.println("4. Add last");
                        System.out.println("5. Add at index");
                        System.out.println("6. Back");
                        System.out.println("Please select an option:");
                        option2 = Integer.parseInt(scanner.next());
                        switch (option2) {
                            case 1 -> {
                                System.out.println("1. Books");
                                System.out.println("2. Pens");
                                System.out.println("3. Rulers");
                                System.out.println("Please select an option:");
                                int option21 = Integer.parseInt(scanner.next());
                                switch (option21) {
                                    case 1 -> {
                                        System.out.println("Available books:");
                                        available_books.print();
                                        System.out.println("Please select an index:");
                                        int index = Integer.parseInt(scanner.next());
                                        available_books.addAfterByPrompt(new Book(), index);
                                    }
                                    case 2 -> {
                                        System.out.println("Available pens:");
                                        available_pens.print();
                                        System.out.println("Please select an index:");
                                        int index2 = Integer.parseInt(scanner.next());
                                        available_pens.addAfterByPrompt(new Pen(), index2);
                                    }
                                    case 3 -> {
                                        System.out.println("Available rulers:");
                                        available_rulers.print();
                                        System.out.println("Please select an index:");
                                        int index3 = Integer.parseInt(scanner.next());
                                        available_rulers.addAfterByPrompt(new Ruler(), index3);
                                    }
                                }
                            }
                            case 2 -> {
                                System.out.println("1. Books");
                                System.out.println("2. Pens");
                                System.out.println("3. Rulers");
                                System.out.println("Please select an option:");
                                int option22 = Integer.parseInt(scanner.next());
                                switch (option22) {
                                    case 1 -> {
                                        System.out.println("Available books:");
                                        available_books.print();
                                        System.out.println("Please select an index:");
                                        int index = Integer.parseInt(scanner.next());
                                        available_books.addBeforeByPrompt(new Book(), index);
                                    }
                                    case 2 -> {
                                        System.out.println("Available pens:");
                                        available_pens.print();
                                        System.out.println("Please select an index:");
                                        int index2 = Integer.parseInt(scanner.next());
                                        available_pens.addBeforeByPrompt(new Pen(), index2);
                                    }
                                    case 3 -> {
                                        System.out.println("Available rulers:");
                                        available_rulers.print();
                                        System.out.println("Please select an index:");
                                        int index3 = Integer.parseInt(scanner.next());
                                        available_rulers.addBeforeByPrompt(new Ruler(), index3);
                                    }
                                }
                            }
                            case 3 -> {
                                System.out.println("1. Books");
                                System.out.println("2. Pens");
                                System.out.println("3. Rulers");
                                System.out.println("Please select an option:");
                                int option23 = Integer.parseInt(scanner.next());
                                switch (option23) {
                                    case 1 -> available_books.addFirstByPrompt(new Book());
                                    case 2 -> available_pens.addFirstByPrompt(new Pen());
                                    case 3 -> available_rulers.addFirstByPrompt(new Ruler());
                                }
                            }
                            case 4 -> {
                                System.out.println("1. Books");
                                System.out.println("2. Pens");
                                System.out.println("3. Rulers");
                                System.out.println("Please select an option:");
                                int option24 = Integer.parseInt(scanner.next());
                                switch (option24) {
                                    case 1 -> available_books.addLastByPrompt(new Book());
                                    case 2 -> available_pens.addLastByPrompt(new Pen());
                                    case 3 -> available_rulers.addLastByPrompt(new Ruler());
                                }
                            }
                            case 5 -> {
                                System.out.println("1. Books");
                                System.out.println("2. Pens");
                                System.out.println("3. Rulers");
                                System.out.println("Please select an option:");
                                int option25 = Integer.parseInt(scanner.next());
                                switch (option25) {
                                    case 1 -> {
                                        System.out.println("Available books:");
                                        available_books.print();
                                        System.out.println("Please select an index:");
                                        int index = Integer.parseInt(scanner.next());
                                        available_books.addAtIndexByPrompt(new Book(), index);
                                    }
                                    case 2 -> {
                                        System.out.println("Available pens:");
                                        available_pens.print();
                                        System.out.println("Please select an index:");
                                        int index2 = Integer.parseInt(scanner.next());
                                        available_pens.addAtIndexByPrompt(new Pen(), index2);
                                    }
                                    case 3 -> {
                                        System.out.println("Available rulers:");
                                        available_rulers.print();
                                        System.out.println("Please select an index:");
                                        int index3 = Integer.parseInt(scanner.next());
                                        available_rulers.addAtIndexByPrompt(new Ruler(), index3);
                                    }
                                }
                            }
                        }
                    }
                }
                case 3 -> {
                    int option3 = 0;
                    while(option3 != 6){
                        System.out.println("1. Delete after");
                        System.out.println("2. Delete before");
                        System.out.println("3. Delete first");
                        System.out.println("4. Delete last");
                        System.out.println("5. Delete at index");
                        System.out.println("6. Back");

                        System.out.println("Please select an option:");
                        option3 = Integer.parseInt(scanner.next());
                        switch (option3) {
                            case 1 -> {
                                System.out.println("1. Books");
                                System.out.println("2. Pens");
                                System.out.println("3. Rulers");
                                System.out.println("Please select an option:");
                                int option31 = Integer.parseInt(scanner.next());
                                switch (option31) {
                                    case 1 -> {
                                        System.out.println("Available books:");
                                        available_books.print();
                                        System.out.println("Please select an index:");
                                        int index = Integer.parseInt(scanner.next());
                                        available_books.deleteAfterByIndex(index);
                                    }
                                    case 2 -> {
                                        System.out.println("Available pens:");
                                        available_pens.print();
                                        System.out.println("Please select an index:");
                                        int index2 = Integer.parseInt(scanner.next());
                                        available_pens.deleteAfterByIndex(index2);
                                    }
                                    case 3 -> {
                                        System.out.println("Available rulers:");
                                        available_rulers.print();
                                        System.out.println("Please select an index:");
                                        int index3 = Integer.parseInt(scanner.next());
                                        available_rulers.deleteAfterByIndex(index3);
                                    }
                                }
                            }
                            case 2 -> {
                                System.out.println("1. Books");
                                System.out.println("2. Pens");
                                System.out.println("3. Rulers");
                                System.out.println("Please select an option:");
                                int option32 = Integer.parseInt(scanner.next());
                                switch (option32) {
                                    case 1 -> {
                                        System.out.println("Available books:");
                                        available_books.print();
                                        System.out.println("Please select an index:");
                                        int index = Integer.parseInt(scanner.next());
                                        available_books.deleteBeforeByIndex(index);
                                    }
                                    case 2 -> {
                                        System.out.println("Available pens:");
                                        available_pens.print();
                                        System.out.println("Please select an index:");
                                        int index2 = Integer.parseInt(scanner.next());
                                        available_pens.deleteBeforeByIndex(index2);
                                    }
                                    case 3 -> {
                                        System.out.println("Available rulers:");
                                        available_rulers.print();
                                        System.out.println("Please select an index:");
                                        int index3 = Integer.parseInt(scanner.next());
                                        available_rulers.deleteBeforeByIndex(index3);
                                    }
                                }
                            }
                            case 3 -> {
                                System.out.println("1. Books");
                                System.out.println("2. Pens");
                                System.out.println("3. Rulers");
                                System.out.println("Please select an option:");

                                int option33 = Integer.parseInt(scanner.next());
                                switch (option33) {
                                    case 1 -> available_books.deleteFirst();
                                    case 2 -> available_pens.deleteFirst();
                                    case 3 -> available_rulers.deleteFirst();
                                }
                            }
                            case 4 -> {
                                System.out.println("1. Books");
                                System.out.println("2. Pens");
                                System.out.println("3. Rulers");
                                System.out.println("Please select an option:");
                                int option34 = Integer.parseInt(scanner.next());
                                switch (option34) {
                                    case 1 -> available_books.deleteLast();
                                    case 2 -> available_pens.deleteLast();
                                    case 3 -> available_rulers.deleteLast();
                                }
                            }
                            case 5 -> {
                                System.out.println("1. Books");
                                System.out.println("2. Pens");
                                System.out.println("3. Rulers");
                                System.out.println("Please select an option:");
                                int option35 = Integer.parseInt(scanner.next());
                                switch (option35) {
                                    case 1 -> {
                                        System.out.println("Available books:");
                                        available_books.print();
                                        System.out.println("Please select an index:");
                                        int index = Integer.parseInt(scanner.next());
                                        available_books.deleteByIndex(index);
                                    }
                                    case 2 -> {
                                        System.out.println("Available pens:");
                                        available_pens.print();
                                        System.out.println("Please select an index:");
                                        int index2 = Integer.parseInt(scanner.next());
                                        available_pens.deleteByIndex(index2);
                                    }
                                    case 3 -> {
                                        System.out.println("Available rulers:");
                                        available_rulers.print();
                                        System.out.println("Please select an index:");
                                        int index3 = Integer.parseInt(scanner.next());
                                        available_rulers.deleteByIndex(index3);
                                    }
                                }
                            }
                        }
                    }
                }
                case 4 -> {
                    int option4 = 0;
                    while (option4 != 4){
                        System.out.println("1. Books");
                        System.out.println("2. Pens");
                        System.out.println("3. Rulers");
                        System.out.println("4. Exit from this menu");
                        System.out.println("Please select an option:");
                        option4 = Integer.parseInt(scanner.next());
                        switch (option4) {
                            case 1 -> {
                                System.out.println("Available books:");
                                available_books.print();
                                System.out.println("Please select an index:");
                                int index = Integer.parseInt(scanner.next());
                                cart_books.addLast(available_books.getByIndex(index), new Book());
                                available_books.deleteByIndex(index);
                            }
                            case 2 -> {
                                System.out.println("Available pens:");
                                available_pens.print();
                                System.out.println("Please select an index:");
                                int index2 = Integer.parseInt(scanner.next());
                                cart_pens.addLast(available_pens.getByIndex(index2), new Pen());
                                available_pens.deleteByIndex(index2);
                            }
                            case 3 -> {
                                System.out.println("Available rulers:");
                                available_rulers.print();
                                System.out.println("Please select an index:");
                                int index3 = Integer.parseInt(scanner.next());
                                cart_rulers.addLast(available_rulers.getByIndex(index3), new Ruler());
                                available_rulers.deleteByIndex(index3);
                            }
                        }
                    }
                }
                case 5 -> {
                    int option5 = 0;
                    while (option5 != 4){
                        System.out.println("1. Books");
                        System.out.println("2. Pens");
                        System.out.println("3. Rulers");
                        System.out.println("4. Exit from this menu");
                        System.out.println("Please select an option:");
                        option5 = Integer.parseInt(scanner.next());
                        switch (option5) {
                            case 1 -> {
                                System.out.println("Cart books:");
                                cart_books.print();
                            }
                            case 2 -> {
                                System.out.println("Cart pens:");
                                cart_pens.print();
                            }
                            case 3 -> {
                                System.out.println("Cart rulers:");
                                cart_rulers.print();
                            }
                        }
                    }
                }
                case 6 -> {
                    int option6 = 0;
                    while (option6 != 4){
                        System.out.println("1. Books");
                        System.out.println("2. Pens");
                        System.out.println("3. Rulers");
                        System.out.println("4. Exit from this menu");
                        System.out.println("Please select an option:");
                        option6 = Integer.parseInt(scanner.next());
                        switch (option6) {
                            case 1 -> {
                                System.out.println("Cart books:");
                                cart_books.print();
                                System.out.println("Please select an index:");
                                int index = Integer.parseInt(scanner.next());
                                available_books.addLast(cart_books.getByIndex(index), new Book());
                                cart_books.deleteByIndex(index);
                            }
                            case 2 -> {
                                System.out.println("Cart pens:");
                                cart_pens.print();
                                System.out.println("Please select an index:");
                                int index2 = Integer.parseInt(scanner.next());
                                available_pens.addLast(cart_pens.getByIndex(index2), new Pen());
                                cart_pens.deleteByIndex(index2);
                            }
                            case 3 -> {
                                System.out.println("Cart rulers:");
                                cart_rulers.print();
                                System.out.println("Please select an index:");
                                int index3 = Integer.parseInt(scanner.next());
                                available_rulers.addLast(cart_rulers.getByIndex(index3), new Ruler());
                                cart_rulers.deleteByIndex(index3);
                            }
                        }
                    }
                }
                case 7 -> {
                    cart_books.print();
                    cart_pens.print();
                    cart_rulers.print();
                    int total_price = cart_books.getTotalPrice() + cart_pens.getTotalPrice() + cart_rulers.getTotalPrice();

                    System.out.println("Total books price: " + cart_books.getTotalPrice());
                    System.out.println("Total pens price: " + cart_pens.getTotalPrice());
                    System.out.println("Total rulers price: " + cart_rulers.getTotalPrice());
                    System.out.println("Total price: " + total_price);
                    
                    System.out.println("Are you sure you want to checkout? (y/n)");
                    String option7 = scanner.next();
                    if (option7.equals("y")){
                        System.out.println("How much money do you have? ");
                        int money = Integer.parseInt(scanner.next());
                        if (money >= total_price){
                            System.out.println("Thank you for shopping with us!");
                            System.out.println("Your change: " + (money - total_price));
                            for (int i = 0; i < cart_books.getSize(); i++) {
                                books_sold.addLast(cart_books.getByIndex(i), new Book());
                                cart_books.deleteByIndex(i);
                            }
                            for (int i = 0; i < cart_pens.getSize(); i++) {
                                pens_sold.addLast(cart_pens.getByIndex(i), new Pen());
                                cart_pens.deleteByIndex(i);
                            }
                            for (int i = 0; i < cart_rulers.getSize(); i++) {
                                rulers_sold.addLast(cart_rulers.getByIndex(i), new Ruler());
                                cart_rulers.deleteByIndex(i);
                            }
                        } else {
                            System.out.println("You don't have enough money!");
                        }
                    }
                }
                case 8 -> {
                    int option8 = 0;
                    while (option8 != 4){
                        System.out.println("1. Books");
                        System.out.println("2. Pens");
                        System.out.println("3. Rulers");
                        System.out.println("4. Exit from this menu");
                        System.out.println("Please select an option:");
                        option8 = Integer.parseInt(scanner.next());
                        switch (option8) {
                            case 1 -> {
                                System.out.println("Books sold:");
                                books_sold.print();
                                System.out.println("Total books sold: " + books_sold.getTotalPrice());
                            }
                            case 2 -> {
                                System.out.println("Pens sold:");
                                pens_sold.print();
                                System.out.println("Total pens sold: " + pens_sold.getTotalPrice());
                            }
                            case 3 -> {
                                System.out.println("Rulers sold:");
                                rulers_sold.print();
                                System.out.println("Total rulers sold: " + rulers_sold.getTotalPrice());
                            }
                        }
                    }
                }
                case 9 -> {
                    int option9 = 0;
                    while (option9 != 4){
                        System.out.println("1. Books");
                        System.out.println("2. Pens");
                        System.out.println("3. Rulers");
                        System.out.println("4. Exit from this menu");
                        System.out.println("Please select an option:");
                        option9 = Integer.parseInt(scanner.next());
                        switch (option9) {
                            case 1 -> {
                                System.out.println("Input book name:");
                                String book_name = scanner.next();
                                AbstractItem search_book = available_books.searchByString(book_name);
                                if (search_book != null){
                                    System.out.println();
                                    available_books.printFromItem(search_book);
                                    System.out.println();
                                } else {
                                    System.out.println("Book not found!");
                                }
                            }
                            case 2 -> {
                                System.out.println("Input pen name:");
                                String pen_name = scanner.next();
                                AbstractItem search_pen = available_pens.searchByString(pen_name);
                                if (search_pen != null){
                                    available_pens.printFromItem(search_pen);
                                } else {
                                    System.out.println("Pen not found!");
                                }
                            }
                            case 3 -> {
                                System.out.println("Input ruler name:");
                                String ruler_name = scanner.next();
                                AbstractItem search_ruler = available_rulers.searchByString(ruler_name);
                                if (search_ruler != null){
                                    available_rulers.printFromItem(search_ruler);
                                } else {
                                    System.out.println("Ruler not found!");
                                }
                            }
                        }
                    }
                }
            }
        }
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
