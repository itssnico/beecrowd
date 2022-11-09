import java.io.IOException;
import java.util.Scanner;
public class OMaior {
    public static void main(String[] args) throws IOException {
     Scanner scan = new Scanner(System.in);
        int valor1 = scan.nextInt();
        int valor2 = scan.nextInt();
        int valor3 = scan.nextInt();
        if (valor1 > valor2 && valor1 > valor3) {
        	System.out.println(valor1 + " eh o maior");
        } else if (valor2 > valor3) {
        	System.out.println(valor2 + " eh o maior");
        } else {
        	System.out.println(valor3 + " eh o maior");
        }
    }
	
}