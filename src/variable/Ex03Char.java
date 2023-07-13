package variable;

import util.Util;

public class Ex03Char {
    public static void main(String[] args) {
        char c1 = 'a'; //97
        System.out.println((int)c1);

        char c2 = 'A'; //65
        System.out.println((int)c2);

        char c3 = '0'; //48
        System.out.println((int)c3);

        System.out.println((char)(c1 + c2));
        Util.typeof(c1 + c2);

        System.out.println('a' + 'b');
        System.out.println(++c1);
    }
}