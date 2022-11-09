import java.io.IOException;
import java.util.Scanner;

public class SequenciaSoma {
	
    public static void main(String[] args) throws IOException {
    	Scanner scan = new Scanner(System.in);
    	int M = scan.nextInt();
    	int N = scan.nextInt();
    	int soma=0;
    	while (M > 0 && N > 0) {
    		
    		if (M > N) {
        		for (int i = N; i <= M; i++) {
        			soma += i;
        			System.out.print(i + " ");
        		}
    		} else {
        		for (int i = M; i <= N; i++) {
        			soma += i;
        			System.out.print(i + " ");
        		}
    		}

    		System.out.println("Sum=" + soma);
        	M = scan.nextInt();
        	N = scan.nextInt();
        	soma = 0;
    	}
    }
	
}