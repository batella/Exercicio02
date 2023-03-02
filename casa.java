package exercicio02;

public class casa {
	private String endereco;
	private int numero;
	private String bairro;
	private String cidade;
	
	public casa() {
		this.endereco = "";
		this.numero = -1;
		this.bairro = "";
		this.cidade = "";
	}
	
	public casa(String endereco, int numero, String bairro, String cidade) {
		this.endereco = endereco;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
	}
	
	public String getendereco() {
		return endereco;
	}

	public void setendereco(String endereco) {
		this.endereco = endereco;
	}
	
	public int getnumero() {
		return numero;
	}

	public void setnumero(int numero) {
		this.numero = numero;
	}
	
	public String getbairro() {
		return bairro;
	}

	public void setbairro(String bairro) {
		this.bairro = bairro;
	}
	public String getcidade() {
		return cidade;
	}

	public void setcidade(String cidade) {
		this.cidade = cidade;
	}
	
	@Override
	public String toString() {
		return "casa [endereco=" + endereco + ", numero=" + numero + ", bairro=" + bairro + ", cidade=" + cidade + "]";
	}
	
}


