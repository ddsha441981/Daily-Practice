package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandlingTest {

    //   Creating  Physical File
    public static void main(String[] args) throws IOException {
        File file = new File("physical.txt");
        boolean newFile = file.createNewFile();
        if (newFile) {
            System.out.println("File is Created Successfully!!!");
        } else {
            System.out.println("File is already Present!!!!");
        }

        // Creating Directory
        File f2 = new File ("File code");
        boolean mkdirs = f2.mkdirs();
        if(mkdirs){
            System.out.println("Directory is created!!!!");
        }else{
            System.out.println("Directory is already Present!!!");
        }

        //File Creating Inside Directory
        File f3 = new File("File code","code.text");
        boolean exists = f3.exists();
        if(exists){
            System.out.println("FIle is already Present");
        }
        else{
            boolean newFile1 = f3.createNewFile();

        }
    }
}
