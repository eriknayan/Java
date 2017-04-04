

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		int t=10;
		int aux;
		int[] vetor = new int[t];
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite 10 numeros inteiros: ");
		do{
			vetor[t-1] = teclado.nextInt();
			t--;
			
		} while (t>0);
		teclado.close();
		t = 10;
		for(int i=0; i<t-1; i++){
			if(vetor[i]>vetor[i+1]){
				aux=vetor[i+1];
				vetor[i+1]=vetor[i];
				vetor[i]=aux;
			}
		}
		for(int i=t-1; i>0; i--){
			if(vetor[i]<vetor[i-1]){
				aux=vetor[i-1];
				vetor[i-1]=vetor[i];
				vetor[i]=aux;
			}
		}
		
		System.out.println("Valor minimo: "+vetor[0]);
		System.out.println("Valor maximo: "+vetor[t-1]);
		System.out.println("Amplitude amostral: "+(vetor[t-1]-vetor[0]));
	}

}
