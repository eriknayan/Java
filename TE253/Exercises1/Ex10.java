
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		boolean ordem=true;
		int lin=0;
		int col=0;
		int[][] m = new int[4][4];
		Scanner teclado = new Scanner (System.in);
		System.out.println("Digite os 16 numeros da matriz: ");
		do{
			m[lin][col] = teclado.nextInt();
			if (col==3){
				col=0;
				lin++;
			}
			else{
				col++;
			}
		} while( col<m.length && lin<m.length);
		teclado.close();
		System.out.println("Matriz Inserida: ");
		for (int i=0; i<m.length; i++) {
			for (int j=0; j < m[i].length; j++) {
				System.out.print(m[i][j]+" ");	
			}
			System.out.println("");
		}	
		// Ordenação com numeros pares da esquerda para direita, de cima para baixo
		for (int i=0; i<m.length; i++) {
			for (int j=0; j< m[i].length; j++) {
				if (m[i][j]%2==1 && ordem){
					int r=i;
					int s=j;
					int impar=m[i][j];
					while(m[r][s]%2==1 && r<m.length && ordem){
						if(s==3){
							s=0;
							if (r==3){
								ordem=false;
							}
							else{
								r++;
							}
						}
						else{
							s++;
						}
					}
					if(ordem){
						m[i][j]=m[r][s];
						m[r][s]=impar;
					}
				}
			}
		}
		System.out.println("Matriz Ordenada: ");
		for (int i=0; i<m.length; i++) {
			for (int j=0; j< m[i].length; j++) {
				System.out.print(m[i][j]+" ");	
			}
			System.out.println("");
		}	
	}
}
