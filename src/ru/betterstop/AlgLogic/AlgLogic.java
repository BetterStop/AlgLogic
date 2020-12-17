package ru.betterstop.AlgLogic;

import java.util.Arrays;

public class AlgLogic {
    public static void main(String[] args) {
        System.out.println("Algebra Logics");
        And and = new And();
        System.out.println(and.getOut());
        System.out.println();

        And and2 = new And(new And(1, new And(1, 1)), new And(1, 1));
        System.out.println("and2 " + and2.getOut());



    }
}
