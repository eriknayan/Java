

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
	
		int ls;
		int n=1;
		int i = -1;
		Scanner teclado = new Scanner (System.in);
		System.out.print("Digite um limite superior ls: ");
		ls = teclado.nextInt();
		
		do{
			System.out.print(n + "^3 = ");
			for (int j=0; j<n; j++){
				i=i+2;
				if (j!=n-1){
					System.out.print(i+"+");
				}
				else{
					System.out.println(i + " = " + (int)Math.pow(n,3));
				}
			}
			n++;
		} while (n<=ls);
		teclado.close();
	}

}
