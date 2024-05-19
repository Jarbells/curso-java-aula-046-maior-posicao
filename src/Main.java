import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
				
		double bigger = vect[0];
		int biggerPosition = 0;
		for(int i = 1; i < vect.length; i++) {
			if(vect[i] > bigger) {
				bigger = vect[i];
				biggerPosition = i;
			}
		}
		System.out.printf("\nMAIOR VALOR = %.1f%n", bigger);
		System.out.println("POSICAO DO MAIOR VALOR = " + biggerPosition);
		
		sc.close();
	}
}
