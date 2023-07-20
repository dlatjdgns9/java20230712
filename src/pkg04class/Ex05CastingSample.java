package pkg04class;

public class Ex05CastingSample {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Table table = new Table();
        Audio audio = new Audio();
        Tv tv = new Tv();

        customer.buy(tv);
        customer.buy(table);
        customer.buy(audio);

        System.out.println("남은 잔액 : " + customer.getMoney());
        System.out.println("내가 산 제품의 목록 : ");
    }
}

class Customer {
    private int money = 1000;
    /*String[] receipt = new String[];*/

    Product[] products = new Product[10];
    int idx = 0;


    void buy(Product product) {
        money -= product.getPrice();
        System.out.println(product.getClass().getSimpleName() + "가격 : " + product.getPrice() + " 구매");
        products[idx++] = product;

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
        super(300, this.getClass().getSimpleName());
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