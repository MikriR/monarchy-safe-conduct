package br.com.message;

import java.util.ArrayList;

public class Message {
    static final ArrayList<String> messages = new ArrayList<>();

    static {
        messages.add("""
                                Choose a Ticket Category:
                
                        1 - Common
                        2 - VIP
                        3 - Queng
                
                """);
        messages.add("""
                                Choose a Code to Validate
                
                                IR846JRF93452F4
                                Your code generated
                
                           Copy and paste any code to test it.
                """);
        messages.add("Ticket Saved");
        messages.add("");
        messages.add("Invalid Option. Try again.\n");
        messages.add("Only accepted numbers.\n");
        messages.add("Code Found on System!");
        messages.add("No Found on System!");
    }

    public static ArrayList<String> getMessages() {
        return messages;
    }

    public static String exhibitMessages(int messagesElement) {
        System.out.println(getMessages().get(messagesElement));
        return getMessages().get(messagesElement);
    }
}
