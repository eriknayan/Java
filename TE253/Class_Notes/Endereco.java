
public class Endereco {
	private String logradouro;
	private int num;
	private String comp;
	private String cidade;
	private String cep;
	private String estado;
	
	public Endereco(String logradouro, int num, String cidade, String cep, String estado) {
		super();
		this.logradouro = logradouro;
		this.num = num;
		this.comp = "";
		this.cidade = cidade;
		this.cep = cep;
		this.estado = estado;
	}


	public String toString() {
		return logradouro + ", " + num + "\n" + cidade
				+ " - " + estado + "\n" + cep;
	}
	
	
	
	

}
