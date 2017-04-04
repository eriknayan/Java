import java.util.Random;

public class ExemploVetor {

	public static void main(String[] args) {
		int[] v1;  // declarar variável vetor
		v1 = new int[10]; // alocando 10 posicoes
		
		float[] v2 = new float[5];
		// declarou v2 e alocou 5 posicoes
		
		char[] v3 = {'a', 'e', 'i', 'o', 'u'};
		// posicoes criadas pela inicializacao
		
		// length é o comprimento do vetor
		for (int i = 0; i < v3.length; i++) {
			System.out.println(v3[i]);
		}
        // opcao 1 para aleatorio INDICADA
		Random random = new Random();
		for (int i = 0; i < v1.length; i++) {
			v1[i] = random.nextInt(100);
			// devolve um numero randomico 0..99
			System.out.println(i + ": " +v1[i]);
		}
		// opcao 2 para aleatorio
		for (int i = 0; i < v2.length; i++) {
			v2[i] = (float)(Math.random() * 100);
			// manipulando retorno do Math
			System.out.println(i + ": " +v2[i]);
		}
	}

}
