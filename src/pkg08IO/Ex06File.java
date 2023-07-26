package pkg08IO;

import java.io.File;
import java.io.IOException;

public class Ex06File {
    public static void main(String[] args) {
        //1) File객체는 file과 directory를 다룰 수 있는 객체이다.
        File file = new File(".");
        if (file.exists() && file.isDirectory()) {
            String[] fileList = file.list();
            for (int i = 0; i < fileList.length; i++) {
                System.out.println(fileList[i]);
            }
        } else {
            System.out.println("해당 경로는 폴더가 아닙니다.");
        }

        //2) File객체는 file을 다룰수 있는 객체
        file = new File("test.txt");
        if (file.exists()) {
            try {
                System.out.println("file.getName :" + file.getName());
                System.out.println("file.getPath :" + file.getPath());
                System.out.println("file.getAbsolutePath :" + file.getAbsolutePath());
                System.out.println("file.getCanonicalPath :" + file.getCanonicalPath());
                System.out.println("file.getParent :" + file.getParent());
                System.out.println();

                if(file.canWrite()) System.out.println(file.getName() + " 쓸 수 있다.");
                if(file.canRead()) System.out.println(file.getName() + " 읽을 수 있다.");
                if(file.isFile()) System.out.println(file.getName() + " is file");
                else if (file.isDirectory()) System.out.println(file.getName() + " is folder");
                else System.out.println(file.getName() + " is not both of them.");
                System.out.println(file.getName() + "의 길이는 " + file.length() + " 입니다.");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


        //3) File 객체는 Drive의 정보를 알 수 있다.
        String drive;
        double totalSpace, usedSpace, freeSpace, usalbeSpace;
        File[] roots = File.listRoots();
        for (File root : roots) {
            drive = root.getAbsolutePath();
            totalSpace = root.getTotalSpace() / Math.pow(1024, 3);
            usalbeSpace = root.getUsableSpace() / Math.pow(1024, 3);
            freeSpace = root.getFreeSpace() / Math.pow(1024, 3);
            usedSpace = totalSpace - usalbeSpace;
            System.out.printf("Drive: %5.2f GB %n" , totalSpace);
            System.out.printf("usalbeSpace: %5.2f GB %n" , usalbeSpace);
            System.out.printf("freeSpace: %5.2f GB %n" , freeSpace);
            System.out.printf("usedSpace: %5.2f GB %n" , usedSpace);
            System.out.println();
        }
    }
}
