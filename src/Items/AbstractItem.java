package Items;

import Helper.PromptHandler;

public abstract class AbstractItem {

    private String[] attribute_key;
    private String[] attribute_value;

    public void setAttributeValue(String[] attribute) {
        this.attribute_value = attribute;
    }

    public void setAttributeKey(String[] attribute) {
        this.attribute_key = attribute;
    }
    
    public String[] getAttributeKey() {
        return attribute_key;
    }

    public String[] getAttributeValue() {
        return attribute_value;
    }

    public PromptHandler PromptInput(){
        String promptMessage = "[*] Input data for ";
        return new PromptHandler(attribute_key, promptMessage);
    }
}
