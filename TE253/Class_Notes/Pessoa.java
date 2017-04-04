
public class Pessoa {

	private String nome;
	private String cpf;
	private Endereco end;

	public Pessoa() {
		super();  
		nome = "sem nome"; 
		cpf = "";
	}
   
	public Pessoa(String nome) {
		super();
		this.nome = nome;
		cpf = "";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Endereco getEnd() {
		return end;
	}

	public void setEnd(Endereco end) {
		this.end = end;
	}	
	
	public String getEtiqueta() {
		if (end==null) {
			return nome + "\nSem endereco cadastrado.";
		}
		return nome + "\n" + end.toString();
	}
	
	public String toString() {
		return "Sou o " + nome;
	}
	
}
