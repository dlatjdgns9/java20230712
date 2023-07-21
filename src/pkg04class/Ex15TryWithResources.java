package pkg04class;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex15TryWithResources {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("Ex15TryWithResources.java");
            fis.read();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        try (FileInputStream fis2 = new FileInputStream("Ex15TryWithResources.java")) {
            fis2.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
