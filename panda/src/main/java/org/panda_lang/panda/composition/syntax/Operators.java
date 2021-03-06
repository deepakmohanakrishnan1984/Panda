package org.panda_lang.panda.composition.syntax;

import org.panda_lang.core.interpreter.token.suggestion.Operator;

public class Operators {

    public static final Operator ASSIGNMENT = new Operator("=");

    public static final Operator ADDITION = new Operator("+");

    public static final Operator SUBTRACTION = new Operator("-");

    public static final Operator MULTIPLICATION = new Operator("*");

    public static final Operator DIVISION = new Operator("/");

    public static final Operator MODULE = new Operator("%");

    public static final Operator INCREMENT = new Operator("++");

    public static final Operator DECREMENT = new Operator("--");

    public static final Operator EQUAL_TO = new Operator("==");

    public static final Operator NOT_EQUAL_TO = new Operator("!=");

    public static final Operator GREATER_THAN = new Operator(">");

    public static final Operator LESS_THAN = new Operator("<");

    public static final Operator GREATER_THAN_OR_EQUAL_TO = new Operator(">=");

    public static final Operator LESS_THAN_OR_EQUAL_TO = new Operator("<=");

    public static final Operator NOT = new Operator("!");

    public static final Operator AND = new Operator("&&");

    public static final Operator OR = new Operator("||");

    public static final Operator BITWISE_NOT = new Operator("~");

    public static final Operator BITWISE_AND = new Operator("&");

    public static final Operator BITWISE_OR = new Operator("|");

    public static final Operator BITWISE_XOR = new Operator("^");

    public static final Operator BITWISE_LEFT_SHIFT = new Operator("<<");

    public static final Operator BITWISE_RIGHT_SHIFT = new Operator(">>");

    private static final Operator[] VALUES = new Operator[23];

    static {
        VALUES[0] = ASSIGNMENT;
        VALUES[1] = ADDITION;
        VALUES[2] = SUBTRACTION;
        VALUES[3] = MULTIPLICATION;
        VALUES[4] = DIVISION;
        VALUES[5] = MODULE;
        VALUES[6] = INCREMENT;
        VALUES[7] = DECREMENT;
        VALUES[8] = EQUAL_TO;
        VALUES[9] = NOT_EQUAL_TO;
        VALUES[10] = GREATER_THAN;
        VALUES[11] = LESS_THAN;
        VALUES[12] = GREATER_THAN_OR_EQUAL_TO;
        VALUES[13] = LESS_THAN_OR_EQUAL_TO;
        VALUES[14] = NOT;
        VALUES[15] = AND;
        VALUES[16] = OR;
        VALUES[17] = BITWISE_NOT;
        VALUES[18] = BITWISE_AND;
        VALUES[19] = BITWISE_OR;
        VALUES[20] = BITWISE_XOR;
        VALUES[21] = BITWISE_LEFT_SHIFT;
        VALUES[22] = BITWISE_RIGHT_SHIFT;
    }

    public static Operator[] values() {
        return VALUES;
    }

}
