package pkg09Generics;

public class Ex03GenericKV {
    public static void main(String[] args) {
        GenericKV<String, Integer>  genericKV = new GenericKV<>();
        genericKV.set("임성훈", 1);

        System.out.println("<String, Integer>");
        System.out.println(genericKV.getName());
        System.out.println(genericKV.getId());
    }
}


class GenericKV<K, V>{
    K name;
    V id;

    void set(K name, V id) {
        this.name = name;
        this.id = id;
    }


    K getName() {
        return name;
    }

    V getId() {
        return id;
    }
}