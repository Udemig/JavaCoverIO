package FileInputOutput;

import java.io.*;

public class FileInputOutputExample {

    String name = "mehmet can seyhan dir";
    FileInputStream fileInputStream;

    void openStream() {
        try {
            fileInputStream = new FileInputStream("/Users/mehmetseyhan/Desktop/QA 2/Cover2/src/files/isimler.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

    public void write(){
        try {
            File file = new File("/Users/mehmetseyhan/Desktop/QA 2/Cover2/src/files/isimler.txt");
            if (file.exists()){
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                byte nameByte[] = name.getBytes();
                // fileOutputStream.write(80);
                fileOutputStream.write(nameByte);
                fileOutputStream.close();
                System.out.println("writing success");
            } else {
                file.createNewFile();
                System.out.println("not exists but created");
            }
        } catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

    public void read()  {
        try{
            openStream();
            int value = fileInputStream.read();
            fileInputStream.close();
            char valueChar = (char)value;
            System.out.println("value: "+ valueChar);
        }catch (IOException e){
            System.out.println("can not read: " + e.getLocalizedMessage());
        }

    }

    public void readAllBytes(){
        try{
            openStream();
            int i = 0;
            while((i=fileInputStream.read()) != -1){
                System.out.println((char)i);
            }
        }catch (IOException e){
            System.out.println(e.getLocalizedMessage());
        }
    }
}
