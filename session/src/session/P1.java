package session;

public class P1 {
public static void main(String[] args) {
	final int x=10;
	final int y=20;
	while (x>y) {   // because of final keyword the value is fixed and we won't be changed it again
		System.out.println("false");
		
	}
	System.out.println("True");
}
}
