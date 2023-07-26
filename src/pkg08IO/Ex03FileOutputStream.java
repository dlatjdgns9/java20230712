package pkg08IO;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex03FileOutputStream {
    public static void main(String[] args) {
        try  {
            FileOutputStream fos = new FileOutputStream("123.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos,5);
            for (int i = '1'; i <= '9'; i++) {
                bos.write(i);
            }
            bos.close(); //close가 될 때 flush가 된다.
            fos.close(); //순서를 지켜야 한다.
            //위 처럼 close()를 사용하려면 try-with-resource문을 사용할 것.
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
