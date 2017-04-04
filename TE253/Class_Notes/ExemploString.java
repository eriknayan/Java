import java.util.Scanner;

public class ExemploString {

	public static void main(String[] args) {
		String s1 = "Ola mundo!";
		String s2;
		String[] s3 = {"Oi", "Tchau", "Ola"}; 
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Frase: " + s1);
		System.out.println("Tamanho: " + s1.length());
		System.out.println("Cx Alta: " + s1.toUpperCase());
		System.out.println("Cx baixa: " + s1.toLowerCase());
		System.out.println("1a. letra; " + s1.charAt(0));
		System.out.println("ul letra: " + s1.charAt(s1.length()-1));
		System.out.println("cmp n: " + s1.compareTo("ola mundo!"));
		System.out.println("cmp ic: " + s1.compareToIgnoreCase("ola mundo!"));
		s1 = s1 + " Tchau...";
		for (int i = 0; i < s1.length(); i++) {
			System.out.println(s1.charAt(i));
		}
		
		System.out.println("Digite uma frase: ");
		s2 = scanner.nextLine();
		System.out.println("Digitou: " + s2);
		
		for (int i = 0; i < s3.length; i++) {
			for (int j = 0; j < s3[i].length(); j++) {
				System.out.print("  " + s3[i].charAt(j));
			}
			System.out.println();
		}
		
	}
}






