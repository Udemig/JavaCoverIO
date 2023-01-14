package FileInputOutput;

import java.io.*;

public class BufferedInputOutputExample {
    String name = "mehmet can seyhan dir";

    public void write(){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("/Users/mehmetseyhan/Desktop/QA 2/Cover2/src/files/isimler.txt", true);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

            // bufferedOutputStream.write(80);
            byte[] nameByte = name.getBytes();
            fileOutputStream.write(nameByte);
            bufferedOutputStream.flush();
            fileOutputStream.close();
            bufferedOutputStream.close();
        } catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

    public void read(){
        try{
            FileInputStream fileInputStream = new FileInputStream("/Users/mehmetseyhan/Desktop/QA 2/Cover2/src/files/isimler.txt");
            BufferedInputStream bufferedOutputStream = new BufferedInputStream(fileInputStream);
            int i = 0;
            while((i=bufferedOutputStream.read()) != -1){
                System.out.println((char)i);
            }
            bufferedOutputStream.close();
            fileInputStream.close();
        }catch (IOException e){
            System.out.println("can not read: " + e.getLocalizedMessage());
        }
    }
}
