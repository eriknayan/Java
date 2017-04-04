import java.util.ArrayList;
import java.util.Iterator;

public class TestaPessoa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Ciclana de Tal");
		Pessoa p2 = new Pessoa("Fulano de Tal");
		Endereco e1= new Endereco("Av das Torres", 123, "Curitiba", "80123-456", "PR");
	
		Pessoa[] familia = new Pessoa[4];
		familia[0] = p1;
		familia[1] = p2;
		familia[2] = new Pessoa("Beltraninho de Tal");
		
		for (int i = 0; i < familia.length; i++) {
			// comparacao com null verifica
			// se há objeto referenciado na posição
			if (familia[i] != null) {
				System.out.println(i+" = "+familia[i].getNome() );
			}
		}
		// problema do vetor: tamanho fixo!!!
		// soluçãoo: usar uma estrutura redimensionável
		// uma opção é usar a classe ArrayList da Framework Collections
		
		// array list de Object
		// opção 1 - sem especificar classe
		ArrayList al1 = new ArrayList();
		al1.add(p1);  // adicionou Pessou
		al1.add(e1);  // adicionou Endereco
		al1.add(p2);  // objetos de classes diferentes
		// porem subclasses da Object
		System.out.println(al1.size());
		System.out.println(al1.get(0).toString());
		// get devolve uma instância de object
		// toString opera corretamente devido a redefiniçao feita em cada classe
		System.out.println(al1.get(1));
		// não conseguimos chamar métodos específicos P ou E
		
		for (int i = 0; i < al1.size(); i++) {
			System.out.println("\n posicao " + i);
			Object o = al1.get(i);
			System.out.println(o);
			// testa se objeto o é instância de Pessoa
			if (o instanceof Pessoa){
				Pessoa p = (Pessoa)o; 
				// coerção de Object em Pessoa
				System.out.println("sou pessoa: "+p.getNome());
			}
		}
		
		// opção 2 -  especificando a classe
		ArrayList<Pessoa> al2 = new ArrayList<Pessoa>();
		// neste caso, al2 aceita apenas instâncias de Pessoa
		al2.add(p1);
		al2.add(p2);
		al2.add(new Pessoa("Beltraninho de Tal"));
		// não é possível fazer al2.add(e1);
		mostraLista(al2);
		al2.remove(2); //Beltraninho foi embora
		mostraLista(al2);
	}
	
	// método estático
	// é invocado sem existência de objeto desta classe
	private static void mostraLista(ArrayList<Pessoa> al){
		// o ArrayList implementa a interface Iterable
		Iterator<Pessoa> it = al.iterator();
		// o iterator permite iterar sobre a lista
		while (it.hasNext()) {
			Pessoa aux = it.next();
			// next já devolve um a Pessoa
			System.out.println(aux.getNome());
		}	
	}
	
}








