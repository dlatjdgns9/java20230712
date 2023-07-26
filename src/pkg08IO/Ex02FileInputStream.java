package pkg08IO;

import java.io.*;

public class Ex02FileInputStream {
    public static void main(String[] args) {
        //1) 파일을 읽어들여서 콘솔로 출력
        try {
            FileInputStream fis = new FileInputStream("C:\\workspace\\java20230712\\src\\pkg08IO\\Ex02FileIOStream.java");
            InputStreamReader reader = new InputStreamReader(fis,"UTF-8");
            BufferedReader br = new BufferedReader(reader);
            int data = 0;
            while ((data = br.read()) != -1) {
                char c =(char) data;
                System.out.print(c);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



        //2) 파일을 읽어들여서 파일로 출력
        try {
            FileInputStream fis = new FileInputStream("C:\\workspace\\java20230712\\src\\pkg08IO\\Ex02FileIOStream.java");
            FileOutputStream fos = new FileOutputStream("C:\\workspace\\java20230712\\src\\pkg08IO\\Ex02FileIOStreamCopy.java");
            int data = 0;
            while ((data = fis.read()) != -1) {
                fos.write(data);

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
