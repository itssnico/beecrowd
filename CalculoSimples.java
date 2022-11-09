import java.io.IOException;
import java.util.Scanner;
public class CalculoSimples {
    public static void main(String[] args) throws IOException {
    Scanner leitor = new Scanner(System.in);
		
        int p1 = leitor.nextInt();
        int q1 = leitor.nextInt();
        double valor1 = leitor.nextDouble();
		
        int p2 = leitor.nextInt();
        int q2 = leitor.nextInt();
        double valor2 = leitor.nextDouble();
		
        double total = (q1 * valor1) + (q2 * valor2);
        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", total));   
    }
	
}