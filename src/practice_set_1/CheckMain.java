package practice_set_1;


/*
If i run this .java class compile successfully and create 4 .class
AAA.class
BBB.class
CCCC.class
DDDD.class

But now i want to run checkMain.class then we'll get error 
ClassDefException
ClassNotFound Exception like that
Because CheckMain is java class name and in java program there no public class in program so that CheckMain.java compile successfully but
.class not created that why we going to get an error
**/


class AAA {
//	Compile AAA.class successfully
	
	public static void main(String[] args) {
		System.out.println("CLass One");
	}
}
	
class BBB{
	
//	Compile BBB.class successfully
	
	public static void main(String[] args) {
			
		System.out.println("CLass B");
		}
	}

class CCCC{
//	Compile CCCC.class successfully
	
	public static void main(String[] args) {
		System.out.println("CLass C");	
		
	}
}

class DDD{
	
//	Compile successfully DDD.java but whenever compile the DDD.class its going to throw error
//	Compile time error when run this DDD.class file bcz no main method found
	
}
