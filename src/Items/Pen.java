package Items;

public class Pen extends AbstractItem {
    String[] attribute = new String[]{
            "brand", "size", "price"
    };
    public Pen() {
        super();
        super.setAttributeKey(attribute);
    }
}
