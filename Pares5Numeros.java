import java.io.IOException;
import java.util.Scanner;

public class Pares5Numeros {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int x;
        int cont = 0;
        for (int i = 0; i < 5; i++) {
        	x = scan.nextInt();
        	if (x % 2 == 0 ) cont++;
        }
        System.out.println(cont + " valores pares");
    }
	
}