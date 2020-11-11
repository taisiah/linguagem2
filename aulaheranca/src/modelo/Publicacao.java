package modelo;

public class Publicacao {
	private String nome;
	private String data;
	private String editora;
	
	public Publicacao(String nome, String data, String editora) {
		this.nome = nome;
		this.data = data;
		this.editora = editora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}


	public String toString() {
		return "Publicacao [nome=" + nome + ", data=" + data + ", editora=" + editora + "]";
	}
	
	

}
