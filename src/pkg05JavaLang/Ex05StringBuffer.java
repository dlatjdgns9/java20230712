package pkg05JavaLang;

public class Ex05StringBuffer {
    public static void main(String[] args) {
        System.out.println("=======String=========");
        String str = "hello";
        str = str + " world";
        System.out.println(str);
        System.out.println(str.hashCode());

        System.out.println("\n=====StringBuffer====");
        StringBuffer sb = new StringBuffer("hello");
        System.out.println(sb.hashCode());
        sb.append(" wrold");
        System.out.println(sb);
        System.out.println(sb.hashCode());
        System.out.println(sb.length()); //길이
        System.out.println(sb.capacity()); //용량

        System.out.println(sb.delete(5,12));
        System.out.println(sb.insert(5," world"));
        System.out.println(sb.reverse());
    }
}
