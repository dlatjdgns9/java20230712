package pkg04class;

public class Ex16ExceptionCustomizing {
    public static void main(String[] args) {
        try {
            throw new MyException("내가 발생시킨 예외");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}
