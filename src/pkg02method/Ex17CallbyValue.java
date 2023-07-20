package pkg02method;

public class Ex17CallbyValue {
    public static void main(String[] args) {
        Data d = new Data();
        System.out.println(d.val);
        d.val = 100;
        System.out.println(d.val);

        change(d.val);
        System.out.println(d.val);

        change(d);
        System.out.println(d.val);
    }

    static void change(int val) {
        val = 500;
        System.out.println(val);
    }

    static void change(Data data) {
        data.val = 800;

    }
}

class Data {
    int val;
}