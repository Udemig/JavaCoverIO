package FileInputOutput;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayInputOutputExample {

    public void write(){
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("/Users/mehmetseyhan/Desktop/QA 2/Cover2/src/files/isimler.txt");
            FileOutputStream fileOutputStream2 = new FileOutputStream("/Users/mehmetseyhan/Desktop/QA 2/Cover2/src/files/kisiler.txt");

            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(80);

            byteArrayOutputStream.writeTo(fileOutputStream);
            byteArrayOutputStream.writeTo(fileOutputStream2);

            byteArrayOutputStream.flush();
            byteArrayOutputStream.close(); // etkilemiyor

        } catch (IOException e){
            System.out.println(e.getLocalizedMessage());
        }
    }

    public void read(){
        byte[] sayilar = {43,46,47,38};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(sayilar);
        int i = 0;
        while ((i=byteArrayInputStream.read()) != -1){
            char value = (char) i;
            System.out.println("ASCII " + i + " Ozel " + value);
        }
    }
}
