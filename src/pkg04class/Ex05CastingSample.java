package pkg04class;

import java.util.ArrayList;

public class Ex05CastingSample {
    public static void main(String[] args) {
        System.out.println("Polymorphism(다형성) => 객체의 형변환이 이루어지는 내용");
        Customer customer = new Customer();
        Table table = new Table();
        Audio audio = new Audio();
        Tv tv = new Tv();

        customer.buy(tv);
        customer.buy(table);
        customer.buy(audio);

        System.out.println("남은 잔액 : " + customer.getMoney());
        System.out.println("\n영수증");
        customer.printItemList();

        //매개변수로 참조할 변수를 전달받는 경우
        //1) 같은 타입일 때
        //2) 객체의 상속관계일 때
        //3) Interface의 상속관계일 때
    }
}

class Customer {
    private int money = 1000;
    /*String[] receipt = new String[];*/

    Product[] products = new Product[10];
    ArrayList<Product> list = new ArrayList<>();
    int idx = 0;


    void buy(Product product) {
        money -= product.getPrice();
        System.out.println(product.getClass().getSimpleName() + "가격 : " + product.getPrice() + " 구매");
        products[idx++] = product;
        list.add(product);

    }

    void printItemList() {
        /*for (int i = 0; i < idx; i++) {
            System.out.println(products[i].getModel() + " / 가격 : " + products[i].getPrice());
        }*/
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getModel() + "/" + list.get(i).getPrice());
        }
    }
    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }


}


class Product {
    private int price;
    private String model;

    public Product(int price, String model) {
        this.price = price;
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }
}


class Table extends Product{

    public Table() {
        super(300, "테이블");
    }
}

class Audio extends Product{
    public Audio() {
        super(350, "오디오");
    }
}

class Tv extends Product{
    public Tv() {
        super(350, "티비");
    }
}