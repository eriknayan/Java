

public class Ex3 {

	public static void main(String[] args) {
		
		int[] dado = { 1, 2, 3, 4, 5, 6};
		System.out.println("Possibilidades de soma de 2 dados igual a 7:");
		for (int i=0; i<6; i++){
			for (int j=0; j<6; j++){
				if ( (dado[i]+dado[j])==7 ){
					System.out.println(dado[i] + "+" + dado[j] + "=7");
				}
			}
		}
	}

}
