package pkg10Thread;

public class Ex07Sychronized {
    public static void main(String[] args) {
        Customer customer = new Customer();
        new Thread(customer).start();
        new Thread(customer).start();
    }
}


class Account {
    private int balance = 1000;
    public int getBalance() {
        return balance;
    }

    synchronized public void withdraw(int money) {  //synchronized는 스레드간 동기화를 하여 데이터의 안정성을 보장.
        if (balance >= money) {

            try {
                Thread.sleep(300);
            } catch (Exception e) {
            }
            balance -= money;
        }
    }
}


class Customer implements Runnable {
    Account acc = new Account();

    @Override
    public void run() {
        while (acc.getBalance() > 0) {
            int money = (int) (Math.random() * 3 + 1) * 100;
            acc.withdraw(money);
            System.out.println("잔액: " + acc.getBalance());
        }
    }
}