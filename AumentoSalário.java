import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class AumentoSalário {
	
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		double salario = scan.nextDouble();
		double ajuste;
		double novo;
		int porcento;
		
		if (salario >= 0 && salario <= 400) {
			ajuste = salario * 0.15;
			novo = salario + ajuste;
			porcento = 15;
		} else if (salario > 400 && salario <= 800) {
			ajuste = salario * 0.12;
			novo = salario + ajuste;
			porcento = 12;
		} else if (salario > 800 && salario <= 1200) {
			ajuste = salario * 0.10;
			novo = salario + ajuste;
			porcento = 10;
		} else if (salario > 1200 && salario <= 2000) {
			ajuste = salario * 0.07;
			novo = salario + ajuste;
			porcento = 7;
		} else {
			ajuste = salario * 0.04;
			novo = salario + ajuste;
			porcento = 4;
		}
		
		System.out.println("Novo salario: " + df.format(novo));
		System.out.println("Reajuste ganho: " +df.format(ajuste));
		System.out.println("Em percentual: " + porcento + " %");
	}
	
}