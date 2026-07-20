package br.com.models;

import br.com.date.DataBase;

import java.security.SecureRandom;

public class Ticket {
    private final String codeLayout = "ABDEFGHJLMNPQRSXYZ0123456789";

    public StringBuilder codeGenerator() {
        final int length = 15;
        SecureRandom randomCode = new SecureRandom();
        StringBuilder codeStructure = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int indexRandom = randomCode.nextInt(codeLayout.length());
            codeStructure.append(codeLayout.charAt(indexRandom));
        }
        return codeStructure;
    }

    StringBuilder specialStructure(String[] elements, int length) {
        SecureRandom randomCode = new SecureRandom();
        StringBuilder specialDetails = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int indexRandom = randomCode.nextInt(elements.length);
            specialDetails.append(elements[indexRandom]);
        }
        return specialDetails;
    }

    public StringBuilder noRepetition(String description) {
        StringBuilder createCode;
        boolean saving = false;

        do {
            createCode = codeGenerator();
            saving = DataBase.savingCode(createCode, description);

        } while (!saving);
        return createCode;
    }

    public String getCodeLayout() {
        return codeLayout;
    }
}
