package Helper;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class PromptHandler {
    protected Scanner scanner;
    protected String PromptMessage;
    protected String[] attribute_value;

    public PromptHandler(String[] attribute_value, String PromptMessage) {
        this.PromptMessage = PromptMessage;
        this.scanner = new Scanner(System.in);
        this.attribute_value = PromptInput(attribute_value);
    }

    protected String[] PromptInput(String @NotNull [] attribute_value){
        String[] output = new String[attribute_value.length];
        for (int i = 0; i < attribute_value.length; i++) {
            System.out.print(PromptMessage + attribute_value[i] + ": ");
            output[i] = scanner.nextLine();
        }
        return output;
    }

    public String[] getAttributeValue() {
        return attribute_value;
    }
}