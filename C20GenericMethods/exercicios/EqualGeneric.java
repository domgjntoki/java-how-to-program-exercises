package C20GenericMethods.exercicios;

import java.util.ArrayList;

public class EqualGeneric {
    public static <T> boolean isEqualTo(T t1, T t2){
        return t1.equals(t2);
    }

    public static void main(String[] args) {
        Object o = new Object();
        Integer i = 4;
        Number n = 4;
        Double d = 4.;
        Float f = 4f;
        Boolean b = true;
        Boolean bb = Boolean.TRUE;
        System.out.println("bb = " + bb);
        System.out.println("b = " + b);
        System.out.println("f = " + f);
        System.out.println("d = " + d);
        System.out.println("n = " + n);
        System.out.println("i = " + i);
        System.out.println("o = new Object()");

        System.out.println("isEqualTo(o, i) = " + isEqualTo(o, i));
        System.out.println("isEqualTo(i, n) = " + isEqualTo(i, n));
        System.out.println("isEqualTo(n, d) = " + isEqualTo(n, d));
        System.out.println("isEqualTo(d, n) = " + isEqualTo(d, n));
        System.out.println("isEqualTo(d, f) = " + isEqualTo(d, f));
        System.out.println("isEqualTo(b, bb) = " + isEqualTo(b, bb));
        System.out.println("isEqualTo(n, i) = " + isEqualTo(n, i));
        System.out.println("isEqualTo(n, d) = " + isEqualTo(n, d));
        System.out.println("isEqualTo(f, n) = " + isEqualTo(f, n));
        System.out.println("isEqualTo(d, b) = " + isEqualTo(d, b));
        System.out.println("isEqualTo(o, i) = " + isEqualTo(o, i));
        System.out.println("isEqualTo(o, n) = " + isEqualTo(o, n));
        System.out.println("isEqualTo(o, d) = " + isEqualTo(o, d));

    }
}
