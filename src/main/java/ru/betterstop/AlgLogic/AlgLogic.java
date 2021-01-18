package ru.betterstop.AlgLogic;

import java.util.Arrays;

public class AlgLogic {
    public static void main(String[] args) {
        System.out.println("Algebra Logics");

        System.out.println();

        And and2 = new And(new And(1, new And(1, 1)), new Or(1, 0));
        System.out.println("and2 " + and2);
        Or or = new Or(1, 0);
        Or or2 = new Or(1, 0);
        LogElement no1 = new Not(0);
        LogElement no2 = new Not(1);

        LogElement lE = new And(new And(new Or(0, 1), 1), new Or(0, 1));
        System.out.println(lE);

        LogElement le  = new Not(new And(0, 1));
        System.out.println("toString: " + le);
        System.out.println(le.equals(lE));
        System.out.println(le.hashCode());
        System.out.println(lE.hashCode());
        System.out.println(or.hashCode());
        System.out.println(no1.hashCode());
        System.out.println(no2.hashCode());
        System.out.println(no1.equals(lE));
        System.out.println(or.equals(or2));
        
        System.out.println("Test Git Branch");






    }
}
