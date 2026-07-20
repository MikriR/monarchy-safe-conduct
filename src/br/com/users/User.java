package br.com.users;

import br.com.message.Message;

import java.util.Scanner;

public class User extends Message {
    static Scanner datesReader = new Scanner(System.in);

    public static int userInteraction() {
        System.out.println(Message.getMessages().getFirst());
        int choice = datesReader.nextInt();
        datesReader.nextLine();
        return choice;
    }

    public static String testing() {
        System.out.println(Message.getMessages().get(1));
        String choice = datesReader.nextLine();
        return choice;
    }
}
