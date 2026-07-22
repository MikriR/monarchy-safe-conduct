package br.com.logicOperation;

import br.com.date.DataBase;
import br.com.message.Message;
import br.com.models.Common;
import br.com.models.Queng;
import br.com.models.VIP;
import br.com.users.User;

import java.util.InputMismatchException;
import java.util.Optional;

public class SystemHeart {
    final Common commonCode = new Common();
    final VIP vipCode = new VIP();
    final Queng quengCode = new Queng();

    StringBuilder ticketChoices() {
        while (true) {
            try {
                int choiceTest = User.userInteraction();

                Optional<StringBuilder> processing = switch (choiceTest) {
                    case 1 -> Optional.of(commonCode.noRepetition());
                    case 2 -> Optional.of(vipCode.noRepetition());
                    case 3 -> Optional.of(quengCode.noRepetition());
                    default -> Optional.empty();
                };
                if (processing.isPresent()) {
                    StringBuilder codifying = processing.get();
                    DataBase.savingCode(codifying, Message.exhibitMessages(3));
                    return codifying;
                }
                Message.exhibitMessages(4);
            } catch (InputMismatchException e) {
                Message.exhibitMessages(5);
            }
        }
    }

    void checking() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        if (DataBase.codeVerifying(User.testing())) {
            Message.exhibitMessages(6);
        } else {
            Message.exhibitMessages(7);
            System.exit(0);
        }
    }
}
