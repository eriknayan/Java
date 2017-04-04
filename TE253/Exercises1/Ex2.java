
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex2 {
	
	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		int i = 0;
		int n;
		int[] vetor = new int[3];
		float media;
		DecimalFormat df = new DecimalFormat("0.00");
	
		do {
			System.out.print("Digite um no. inteiro: ");	
			n = teclado.nextInt();
			if (i==0){
				vetor[i] = n;
				i++;
			}
			else {
				if (n<vetor[i-1]){
					i=0;
				}
				vetor[i]=n;
				i++;
			}
		} while (i<3);	
		media = (float) (vetor[0]+vetor[1]+vetor[2])/3;
		System.out.println("Media = " + df.format(media));
		teclado.close();			
	}
}
