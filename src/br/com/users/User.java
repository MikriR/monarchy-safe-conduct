package br.com.users;

import br.com.message.Message;

import java.util.Scanner;

public class User {
    static Scanner datesReader = new Scanner(System.in);

    public static int userInteraction() {
        System.out.println(Message.exhibitMessages(0));
        int choice = datesReader.nextInt();
        datesReader.nextLine();

        return choice;
    }

    public static String testing() {
        System.out.println(Message.exhibitMessages(1));
        String choice = datesReader.nextLine();
        datesReader.nextLine();
        return choice;
    }
}
