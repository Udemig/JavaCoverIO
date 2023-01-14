package FileInputOutput;

import java.io.*;

public class DataOutputInputExample {


    public void write(){
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("/Users/mehmetseyhan/Desktop/QA 2/Cover2/src/files/isimler.txt");
            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
            dataOutputStream.writeChars("nasilsiniz?");
            dataOutputStream.flush();
            dataOutputStream.close();
        }catch (IOException e){
            System.out.println(e.getLocalizedMessage());
        }
    }

    public void read(){
        try{
            InputStream inputStream = new FileInputStream("/Users/mehmetseyhan/Desktop/QA 2/Cover2/src/files/isimler.txt");
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            int count = inputStream.available();
            byte[] isimlerArray = new byte[count];
            dataInputStream.read(isimlerArray);
            for (byte value: isimlerArray) {
                char i  = (char) value;
                System.out.println(i);
            }


        }catch (IOException e){
            System.out.println(e.getLocalizedMessage());
        }
    }
}
