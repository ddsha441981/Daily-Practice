package practice_set_1;

import java.util.ArrayList;

public class CheckImport{
	public static void main(String arg[]){
	
		System.out.println("Class Running");
		//Defining arraylist
		ArrayList arrList = new ArrayList();

    // Now resolve the problem in 2 way
    // 1. By using java.util.ArrayList arr = new java.util.ArrayList();
    // 2. By Using import keyword
		
	}
	
}
// 1=> When compile this code we'll ger an error because jvm do not find any ArrayList Pacakge inside the programm
//2=> To Resolve that error there two method 
		//(a) use Java.util.ArrayList
		//(B) Use import keyword
 

/* CheckImport.java:6: error: cannot find symbol
                ArrayList arrList = new ArrayList();
                ^
  symbol:   class ArrayList
  location: class CheckImport
CheckImport.java:6: error: cannot find symbol
                ArrayList arrList = new ArrayList();
                                        ^
  symbol:   class ArrayList
  location: class CheckImport
2 errors
 */
