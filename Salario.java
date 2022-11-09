import java.io.IOException;
import java.util.Scanner;

public class Salario {
	
	public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int funcionario = scan.nextInt();
        int horas = scan.nextInt();
        double valor = scan.nextDouble();
        double salario = horas * valor;
        System.out.println("NUMBER = " + funcionario);
        System.out.println(String.format("SALARY = U$ %.2f" , salario));
    }
	
}