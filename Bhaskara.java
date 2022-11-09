import java.io.IOException;
import java.util.Scanner;
public class Bhaskara {
	
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        double A = scan.nextDouble();
        double B = scan.nextDouble();
        double C = scan.nextDouble();
        
        if ((A == 0) | (B * B - 4 * A * C < 0)) {
			System.out.println("Impossivel calcular");
			return;
		}
        double bascara = Math.sqrt((B * B) - 4 * A * C);
        double R1 = (-B + bascara) / (2 * A);
        double R2 = (-B - bascara) / (2 * A);
        System.out.println(String.format("R1 = %.5f", R1));
        System.out.println(String.format("R2 = %.5f", R2));
    }
	
}