package br.com.models;

public class VIP extends Ticket {

    private final String[] charsSpecial = {"C", "I", "K", "O", "T", "U", "V", "W"};

    @Override
    public StringBuilder codeGenerator() {
        StringBuilder structurePrincipal = super.codeGenerator();
        final int length = 2;
        return structurePrincipal.insert(7, specialStructure(charsSpecial,length));
    }
}
