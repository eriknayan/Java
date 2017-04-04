
import java.util.Scanner;

public class Ex2_2 {

	public static void main(String[] args) {
		
		String[] unidade = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};	
		String[] dezena = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
		String[] centena = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
		String s;
		Scanner teclado = new Scanner(System.in);
		
		while(true){
			System.out.println("Digite um numero de 1 a 999: ");
			s = teclado.nextLine();;		
		
			if (s.length()<4){
				if(s.length()==3){
					int u = Character.getNumericValue(s.charAt(2));
					int d = Character.getNumericValue(s.charAt(1));
					int c = Character.getNumericValue(s.charAt(0));
					System.out.println(centena[c]+dezena[d]+unidade[u]);
				}
				else if (s.length()==2){
					int u = Character.getNumericValue(s.charAt(1));
					int d = Character.getNumericValue(s.charAt(0));
					System.out.println(dezena[d]+unidade[u]);
				}
				else{
					int u = Character.getNumericValue(s.charAt(0));
					System.out.println(unidade[u]);
				}
			}
			else{
				System.out.println("Valor fornecido fora dos limites operacionais.");
			}
		//teclado.close();
		}
	}
}
