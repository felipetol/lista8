package lista.lista8;

public class Ex3 {

	public static void main(String[] args) {
		
		int matriz[][] = new int[4][4];
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				matriz[i][j] = (i + 1) * (j + 1);
			}
		}
		
		for (int i = 0; i < matriz.length; i++) {
			System.out.println();
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
		}
	}
}
