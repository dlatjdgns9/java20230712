package pkg08IO;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Ex01ByteArrayIOStream {
    public static void main(String[] args) {
        //Input Output
        byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        byte[] outSrc = null;

        ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.out.println("input: " + Arrays.toString(inSrc));
        System.out.println("-----------------------------------------");

        //1) 입력스트림에서 데이터를 읽은 후 출력 스트림으로 바로 전달하는 경우
        int data =0;
        while ((data = input.read()) != -1) {  //input.read()로 읽어들어서 data를 담는다.
            output.write(data);
        }
        outSrc = output.toByteArray();
        System.out.println(Arrays.toString(outSrc));
        System.out.println("\n\n");


        //2) 입력 스트림의 데이터를 일정 양을 채워서 출력 스트림으로 전달하는 경우
        byte[] tmp = new byte[4];
        input = new ByteArrayInputStream(inSrc);
        output = new ByteArrayOutputStream();
        while (input.available() > 0) { //available = 현재 읽을수 있는 바이트수를 반환.
            try {
                int length = input.read(tmp); //input.read()로 읽어들여서 배열 tmp에 담는다. 그리고 길이 값을 length에다가 저장.
                output.write(tmp,0,length);
                outSrc = output.toByteArray();
                System.out.println("tmp: " + Arrays.toString(tmp));
                System.out.println("outSrc: "+ Arrays.toString(outSrc));
            } catch (IOException e) {
                throw new RuntimeException();
            }
            outSrc = output.toByteArray();
            System.out.println(Arrays.toString(tmp));
            System.out.println(Arrays.toString(outSrc));
        }
    }
}
