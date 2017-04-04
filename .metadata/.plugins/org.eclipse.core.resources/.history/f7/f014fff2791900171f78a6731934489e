
import java.util.Scanner;

public class Ex2_1 {

	public static void main(String[] args) {
		
		String s;
		int a_count = 0;
		int e_count = 0;
		int i_count = 0;
		int o_count = 0; 
		int u_count = 0;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Digite uma frase: ");
		s = teclado.nextLine();
		char[] c = s.toCharArray();
		teclado.close();
		
		for (int i=0; i<c.length; i++){
			
			if(c[i]=='a'||c[i]=='A'){
				System.out.print("@");
				a_count++;
			}
			else if(c[i]=='e'||c[i]=='E'){
				System.out.print("@");
				e_count++;
			}
			else if(c[i]=='i'||c[i]=='I'){
				System.out.print("@");
				i_count++;
			}
			else if(c[i]=='o'||c[i]=='O'){
				System.out.print("@");
				o_count++;
			}
			else if(c[i]=='u'||c[i]=='U'){
				System.out.print("@");
				u_count++;
			}
			else {
				System.out.print(c[i]);
			}
		}
		System.out.println("");
		histograma('A', a_count, c.length);
		histograma('E', e_count, c.length);
		histograma('I', i_count, c.length);
		histograma('O', o_count, c.length);
		histograma('U', u_count, c.length);
		
	}
	
	public static void histograma (char x, int n, int t){
		
		System.out.print(x+": ");
		for (int i=0; i<n; i++){
			System.out.print("*");
		}
		System.out.println(" ("+(n*100/t)+"%)");
	}
}
