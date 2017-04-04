
import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		
		int t=20;
		int[] vetor = new int[t];
		Scanner teclado = new Scanner (System.in);
		System.out.println("Digite 20 numeros inteiros: ");
		do{
			vetor[t-1] = teclado.nextInt();
			t--;	
		} while (t>0);
		teclado.close();
		t=20;
		// insertion sort in place
		for (int i=1; i<t; i++){
			
			int key = vetor[i];
			int j = i;
			
			while ((j > 0) && (vetor[j-1] > key)){
				vetor[j] = vetor[j-1];
				j--;
			}
			vetor[j] = key;
		}
		//
		for (int i=0; i<t; i++){
			System.out.println(vetor[i]+" ");
		}
	
	}

}
