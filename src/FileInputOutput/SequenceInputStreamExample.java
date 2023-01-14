package FileInputOutput;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceInputStreamExample {

    public void read(){
       try{
           FileInputStream fileInputStream = new FileInputStream("/Users/mehmetseyhan/Desktop/QA 2/Cover2/src/files/isimler.txt");
           FileInputStream fileInputStream1 = new FileInputStream("/Users/mehmetseyhan/Desktop/QA 2/Cover2/src/files/kisiler.txt");
           SequenceInputStream sequenceInputStream = new SequenceInputStream(fileInputStream,fileInputStream1);
           int i = 0;
           while ((i=sequenceInputStream.read()) != -1){
               System.out.println((char)i);
           }
           sequenceInputStream.close();
           fileInputStream.close();
           fileInputStream1.close();
       }catch (IOException e){

       }
    }

    public void readThreeAndMoreStreams(){
        try{
            FileInputStream fileInputStream = new FileInputStream("/Users/mehmetseyhan/Desktop/QA 2/Cover2/src/files/isimler.txt");
            FileInputStream fileInputStream1 = new FileInputStream("/Users/mehmetseyhan/Desktop/QA 2/Cover2/src/files/kisiler.txt");
            FileInputStream fileInputStream2 = new FileInputStream("/Users/mehmetseyhan/Desktop/QA 2/Cover2/src/files/siniflar.txt");

            Vector vector = new Vector();
            vector.add(fileInputStream);
            vector.add(fileInputStream1);
            vector.add(fileInputStream2);

            Enumeration enumeration = vector.elements();

            SequenceInputStream sequenceInputStream = new SequenceInputStream(enumeration);
            int i = 0;
            while ((i=sequenceInputStream.read()) != -1){
                System.out.println((char)i);
            }
            sequenceInputStream.close();
            fileInputStream.close();
            fileInputStream1.close();
            fileInputStream2.close();
        }catch (IOException e){

        }
    }
}
