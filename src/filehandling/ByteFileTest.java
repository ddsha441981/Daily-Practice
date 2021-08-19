package filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteFileTest {

//    ByteFile contains 8 bit
//    Char File contains 16 bit

    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("my.text");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
