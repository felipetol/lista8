package lista.lista8;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int matriz[][] = new int[5][5];
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("Insira o valor da matriz: ");
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("\nInsira o número a ser procurado: ");
		int numeroProcurado = sc.nextInt();
		String mensagem = "\nNão encontrado";
		
		exterior: for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(numeroProcurado == matriz[i][j]) {
					mensagem = "\nNúmero encontrado na linha " + (i + 1) + ", coluna " + (j + 1);
					break exterior; 
				}
			}
		}
		
		System.out.println(mensagem);
		
		sc.close();
	}
	
}
