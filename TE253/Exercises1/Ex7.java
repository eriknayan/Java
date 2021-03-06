

import java.text.DecimalFormat;
import java.util.Scanner;


public class Ex7 {

	public static void main(String[] args) {
	
		int t=10;
		int n;
		int[] vetor_user = new int[t];
		int[] vetor_freq = { 0, 0, 0, 0, 0};
		Scanner teclado = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		do{
			System.out.println("Digite um no. de 1 a 5: ");
			n=teclado.nextInt();
			if(n>=1 && n<=5){
				vetor_user[t-1]=n;
				t--;
			}
			else{
				System.out.println("Ops! Valor invalido.");
			}
		} while(t>0);
		t=10;
		teclado.close();
		for(int i=0; i<t; i++){
			if(vetor_user[i]==1){
				vetor_freq[0]++;
			}
			else if(vetor_user[i]==2){
				vetor_freq[1]++;
			}
			else if(vetor_user[i]==3){
				vetor_freq[2]++;
			}	
			else if(vetor_user[i]==4){
				vetor_freq[3]++;
			}	
			else if(vetor_user[i]==5){
				vetor_freq[4]++;
			}	
		}
		for(int i=0; i<t/2; i++){
			System.out.println("Frequencia do no. "+(i+1)+": "+df.format((float)(vetor_freq[i]*100/t))+"%");
		}
	}	
}
