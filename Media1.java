import java.io.IOException;
import java.util.Scanner;
 
public class Media1 {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double MEDIA = ((3.5 * A)+(7.5 * B))/11;
        System.out.println(String.format("MEDIA = %.5f", MEDIA));
       
    }
 
}