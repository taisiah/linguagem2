package modelo;

public class Revista extends Publicacao {
	
	private String periodicidade;

	public Revista(String nome, String data, String editora,String periodicidade) {
		super(nome, data, editora);
		this.periodicidade = periodicidade;
	}

	public String getPeriodicidade() {
		return periodicidade;
	}

	public void setPeriodicidade(String periodicidade) {
		this.periodicidade = periodicidade;
	}

	
	public String toString() {
		return "Revista [periodicidade=" + periodicidade + "]";
	}
	
	

	
	
}
