package org.panda_lang.core.interpreter.lexer.suggestion;

import org.panda_lang.core.interpreter.lexer.Token;
import org.panda_lang.core.interpreter.lexer.TokenType;

public class Separator implements Token {

    private final String separator;
    private Separator opposite;

    public Separator(char separator) {
        this(Character.toString(separator));
    }

    public Separator(String separator) {
        this.separator = separator;
    }

    public void setOpposite(Separator opposite) {
        this.opposite = opposite;
    }

    public boolean hasOpposite() {
        return opposite != null;
    }

    public Separator getOpposite() {
        return opposite;
    }

    @Override
    public String getToken() {
        return separator;
    }

    @Override
    public TokenType getType() {
        return TokenType.SEPARATOR;
    }

    @Override
    public String toString() {
        return getType().getTypeName().toLowerCase() + ": " + getToken();
    }

}
