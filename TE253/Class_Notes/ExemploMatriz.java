import java.util.Random;

public class ExemploMatriz {

	public static void main(String[] args) {
		int[][] m1;  // declaracao da variavel matriz
		m1 = new int[5][5]; // alicacao do espaco
		
		float[][][] m2 = new float[3][4][5];
		// declara e aloca na mesma linha
		
		// declaracao com inicializacao
		// tamanho e alocaçao feita pelo java
		int[][] m3 = {{1, 2, 3},
				      {4, 5, 6},
		              {7, 8, 9}};
		
		// matriz com linhas possuindo numero de colunas diferente
		byte[][] m4 = {{1, 2, 3, 4, 5},
				       {1, 2, 3},
				       {1},
				       {1, 2, 3, 4}};
		
		// preenchendo m1 com numeros aleatorios e mostrando
		Random r = new Random();
		// loop da linha, m1.length é total de linhas de m1
		for (int i = 0; i < m1.length; i++) {
			// loop da coluna, m1[i].length é total de colunas de m1[i]
			for (int j = 0; j < m1[i].length; j++) {
				m1[i][j] = 10 + r.nextInt(90);// 10..99
				System.out.print(m1[i][j] + "  ");
			}
			System.out.println();
		}
		
		// mostar a matriz m4
		for (int i = 0; i < m4.length; i++) {
			for (int j = 0; j < m4[i].length; j++) {
				System.out.print(m4[i][j] + "  ");
			}
			System.out.println();
		}
		

	}

}







