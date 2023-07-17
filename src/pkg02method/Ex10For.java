package pkg02method;

public class Ex10For {
    public static void main(String[] args) {
        int result = 0;
        //result = 1+2+3+4+5+6+7+8+9+10;
        result = result +1;
        result = result +2;
        result = result +3;
        result = result +4;
        result = result +5;
        System.out.println(result);
        //반복문은 중복되는 규칙성을 찾아내는 것이 중요하다.


        result =0;
        for (int i = 1; i < 6; i++) {
            result = result + i;
        }
        System.out.println(result);


        result = 0;
        for (int i = 1; i < 11; i++) {
            result = result +i;
        }
        System.out.println(result);

        result = 0;
        for (int i = 2; i <10 ; i++) {
            for (int j = 1; j <10 ; j++) {
                result = i * i;
                System.out.println(i + " x " + j + " = " + result);
            }
        }
        System.out.println("");


        for (int i = 2; i <10 ; i+=3) {
            for (int j = 1; j <10 ; j++) {
                for (int k = 0; k < 3; k++) {
                    if (i + k == 10) {
                        break;
                    }
                    System.out.printf("%d x %d = %d \t", i+k, j, (i+k)*j);
                }
                System.out.println("");
            }
            System.out.println("");

        }



    }
}
