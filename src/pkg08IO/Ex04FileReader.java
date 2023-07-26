package pkg08IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex04FileReader {
    public static void main(String[] args) {
        String fileName = "test.txt";
        try {
            FileInputStream fis = new FileInputStream(fileName); //byte기반
            FileReader fr = new FileReader(fileName); //char기반
            int data = 0;

            //byte기반 보조스트림 한글깨짐
            while ((data = fis.read()) != -1) System.out.print((char) data);
            System.out.println("\n");
            fis.close();

            //char기반 보조스트림 없어도 한글안깨짐
            while ((data=fr.read())!=-1) System.out.print((char)data);
            System.out.println();
            fr.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
