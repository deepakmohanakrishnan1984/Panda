package org.panda_lang.panda.core.element;

public class Operator implements Token {

    private final String operator;

    public Operator(String operator) {
        this.operator = operator;
    }

    @Override
    public String getToken() {
        return operator;
    }

}
