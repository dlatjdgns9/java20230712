package pkg04class;

public class Ex13Throws {
    public static void main(String[] args) throws Exception{
        method1();
    }
    private static void method1() throws Exception{
        methode2();
    }

    private static void methode2() throws Exception{
        method3();
    }

    private static void method3() throws Exception{
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("예외 처리");
            try {
                throw new Exception();
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}

