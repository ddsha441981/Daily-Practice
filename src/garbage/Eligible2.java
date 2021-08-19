package garbage;

import java.io.BufferedReader;

public class Eligible2 {
    public static void main(String[] args) {
        StringBuffer str1 = new StringBuffer("Hello");
        StringBuffer str2 = new StringBuffer("Java");

        System.out.println(str1 + " " + str2);


        str1 = str2;
        System.out.println(str1);
        System.out.println(str2);

    }
}
