package br.com.models;

public class Queng extends Ticket {
    final String[] executiveElements = {"c4", "d4", "e4", "Nbd7", "cxd6", "Bxe5", "Rbc4", "Bd7", "Qh6+!!", "Kc4"};

    @Override
    public StringBuilder codeGenerator() {
        StringBuilder principalStructure = super.codeGenerator();
        final int length = 1;
        return principalStructure.insert(4, specialStructure(executiveElements, length));
    }
}
