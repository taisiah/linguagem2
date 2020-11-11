package modelo;

public class Livro extends Publicacao {
	private String isbn;

	public Livro(String nome, String data, String editora,String isbn) {
		super(nome, data, editora);
		this.isbn = isbn;
		
	}
	


	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	
		
	
	public String toString() {
		return "Livro [isbn=" + isbn + "]";
	}
	
	

}
