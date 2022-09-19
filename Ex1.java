package lista.lista8;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int matriz[][] = new int[4][4];
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println("Insira o valor da matriz: ");
				matriz[i][j] = sc.nextInt();
			}
		}
		int maioresQue10 = 0;
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if(matriz[i][j] > 10) {
					maioresQue10++;
				}
			}
		}
		
		System.out.println("Quantidade de números maiores que 10: " + maioresQue10);
		
		sc.close();
	}
}
