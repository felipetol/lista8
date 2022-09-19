package lista.lista8;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int matriz[][] = new int [4][4];
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("Insira o valor da matriz: ");
				matriz[i][j] = sc.nextInt();
			}
		}
		
		String localizacao = "\nLinha: 1\nColuna: 1";
		
		int maior = matriz[0][0];
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if(matriz[i][j] > maior) {
					maior = matriz[i][j];
					localizacao = "\nLinha: " + (i + 1) + "\nColuna: " + (j + 1);
				}
			}
		}
		
		System.out.println("\nLocalização do maior: " + localizacao);
		
		sc.close();
	}
}
