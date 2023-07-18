package pkg04class;

import java.security.Signature;
import java.sql.SQLOutput;

public class Ex01Singleton {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        Singleton s1 = Singleton.getInstance();


        System.out.println(s);
        System.out.println(s1);
    }
}


class Singleton {
    static private Singleton singleton;

    private Singleton() {
    }

    static public Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
