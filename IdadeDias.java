import java.io.IOException;
import java.util.Scanner;
public class IdadeDias {
 
    public static void main(String[] args) throws IOException {
     Scanner scan = new Scanner(System.in);
        int idadeDias = scan.nextInt();
        int anos = idadeDias / 365;
        idadeDias -= anos * 365;
        int meses = idadeDias / 30;
        idadeDias -= meses * 30;
        int dias = idadeDias;
        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");
    }
 
}