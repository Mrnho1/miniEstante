package miniEstante.model;

public class Livro {

	private int numero;
	private String titulo;
	private String autor;
	private int ano;
	private int alugado;
	
	public Livro(int numero, String titulo, String autor, int ano, int alugado) {
		super();
		this.numero = numero;
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
		this.alugado = alugado;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int isAlugado() {
		return alugado;
	}

	public void setAlugado(int alugado) {
		this.alugado = alugado;
	}
	
	
	public void visualizar() {
		String opcao2 ="";
		switch (this.alugado) {
		case 1 -> opcao2 = "Alugado";
		case 2 -> opcao2 = "Disponível";
		}
		System.out.println("===============================================");
		System.out.println("Numero do livro: " + this.numero);
		System.out.println("Titulo do livro: " + this.titulo);
		System.out.println("Autor do livro: " + this.autor);
		System.out.println("Ano do livro: " + this.ano);
		System.out.println("Status do livro: " + opcao2);
		System.out.println("===============================================");
	}

}
