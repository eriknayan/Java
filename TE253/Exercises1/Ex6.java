
import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		int t=10;
		float[] vetor_user = new float[t];
		float[] vetor_disp = new float[t];
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite 10 numeros reais: ");
		do{
			vetor_user[t-1] = teclado.nextFloat();
			t--;	
		} while (t>0);
		teclado.close();
		t=10;
		float media_arit = 0;
		for (int i=0; i<t; i++){
			media_arit+=vetor_user[i];
		}
		media_arit/=t;
		for(int i=0; i<t; i++){
			vetor_disp[i]=Math.abs(vetor_user[i]-media_arit);
		}
		float media_disp = 0;
		for (int i=0; i<t; i++){
			media_disp+=vetor_disp[i];
		}
		media_disp/=t;
		System.out.println("Desvio medio: "+media_disp);

	}
}