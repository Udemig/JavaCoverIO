package FileInputOutput;

import java.io.*;

public class FilterOutputInputExample {

    public void write(){
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("/Users/mehmetseyhan/Desktop/QA 2/Cover2/src/files/isimler.txt");
            FilterOutputStream filterOutputStream = new FilterOutputStream(fileOutputStream);
            String name = "memo";
            byte[] nameByte = name.getBytes();
            filterOutputStream.write(nameByte);
            filterOutputStream.flush();
            filterOutputStream.close();
            fileOutputStream.close();
        }catch (IOException e){
            System.out.println(e.getLocalizedMessage());
        }
    }

    public void read(){
        try{
            File file = new File("/Users/mehmetseyhan/Desktop/QA 2/Cover2/src/files/isimler.txt");
            FileInputStream fileInputStream = new FileInputStream(file);
            FilterInputStream filterInputStream = new BufferedInputStream(fileInputStream);
            int i = 0;
            while ((i=filterInputStream.read()) != -1){
                System.out.println((char)i);
            }
            fileInputStream.close();
            filterInputStream.close();
        }catch (IOException e){
            System.out.println(e.getLocalizedMessage());
        }
    }
}
