import java.util.Scanner;

public class Lista1Ex1 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		int contador = 0;
		int maiorValor = 0;
		int n;
		do {
			System.out.print("Digite um no. inteiro: ");
			n = teclado.nextInt();
			if ((n%2==0) && (n>0)){
				contador++;
				if (n > maiorValor){
					maiorValor = n;
				}
			}
		} while (contador < 4);
		System.out.println("Maior valor: " + maiorValor);
		teclado.close();
	}
}




