package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double maior;
		int posMaior;
		System.out.printf("Quantos números você vai digitar? ");
		n = sc.nextInt();
		
		double[] vect = new double[n];
		for(int i=0; i<n; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		}
		
		maior = vect[0];
	    posMaior = 0;

	    for (int i=1; i<n; i++) {
	        if (vect[i] > maior) {
	            maior = vect[i];
	            posMaior = i;
	        }
	    }
		
	    System.out.printf("MAIOR VALOR = %.1f\n", maior);
	    System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posMaior + 1);

		
		
		
		sc.close();

	}

}
