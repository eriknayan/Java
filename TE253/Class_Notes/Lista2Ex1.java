import java.util.Scanner;

public class Lista2Ex1 {

	public static void main(String[] args) {
		String f;
		int[] v = new int[5];
		char[] vog = {'a', 'e', 'i', 'o', 'u'}; 
		Scanner teclado = new Scanner (System.in);
		
		System.out.print("Digite uma frase: ");
		f = teclado.nextLine();
		
		for (int i = 0; i < f.length(); i++) {
			switch (f.toLowerCase().charAt(i)) {
			case 'a':
				v[0]++;
				System.out.print("@");
				break;
			case 'e':
				v[1]++;
				System.out.print("@");
				break;
			case 'i':
				v[2]++;
				System.out.print("@");
				break;
			case 'o':
				v[3]++;
				System.out.print("@");
				break;
			case 'u':
				v[4]++;
				System.out.print("@");
				break;
			default:
				System.out.print(f.charAt(i));
				break;
			}
		}
		System.out.println();
		for (int i = 0; i < v.length; i++) {
			System.out.print(vog[i] +"("+ v[i] +"): ");
			for (int j = 0; j < v[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}









