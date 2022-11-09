import java.io.IOException;
import java.util.Scanner;
public class Media2{
 
    public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double MEDIA = ((2 * A)+(3 * B)+(5 * C))/10;
        System.out.println(String.format("MEDIA = %.1f", MEDIA));
       
        
    }
 
}