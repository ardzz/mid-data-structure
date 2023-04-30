package Items;

public class Ruler extends AbstractItem {
    String[] attribute = new String[]{
            "brand", "size", "price"
    };
    public Ruler() {
        super();
        super.setAttributeKey(attribute);
    }
}
