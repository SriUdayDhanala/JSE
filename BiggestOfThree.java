public class BiggestOfThree {
	public static void main (String [] args) {
		int a = 21;
		int b = 24;
		int c = 29;
		if (a>b && a>c) {
			System.out.println("A is Bigger");
		} else if (b>a && b>c) {
			System.out.println("B is Bigger");
		} else {
			System.out.println("C is Bigger");
		}		
	}
}

/*
output:
C:\JSE\Class1>javac BiggestOfThree.java

C:\JSE\Class1>java BiggestOfThree
C is Bigger

C:\JSE\Class1>
*/