package Items;

public class Book extends AbstractItem {
    String[] attribute = new String[]{
            "brand", "size", "price"
    };
    public Book() {
        super();
        super.setAttributeKey(attribute);
    }
}
