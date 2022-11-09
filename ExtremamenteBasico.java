
import java.io.IOException;
import java.util.Scanner;
 
public class ExtremamenteBasico {
	
	public static int A;
	public static int B;
	public static int X;
 
    public static void main(String[] args) throws IOException {
    
    System.out.println("Digite um número:");  
    Scanner input1 = new Scanner(System.in);
    A = input1.nextInt();
    System.out.println("Digite outro número: ");
    Scanner input2 = new Scanner(System.in);
    B = input2.nextInt();
    X();
    }
    public static void X() {
        int X = A + B;
        System.out.println("X: " + X);
    }
}