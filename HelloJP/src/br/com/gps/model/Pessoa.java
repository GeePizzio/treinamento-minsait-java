package br.com.gps.model;

public class Pessoa {
	//Atributos
	private String nome;
	private String telefone;
	private String email;
	private String linkedin;
	
	//Construtor
	public Pessoa (String nome, String telefone, String email) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.linkedin = "-";
	}
	
	public Pessoa (String nome, String telefone, String email, String linkedin) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.linkedin = linkedin;
	}

	// Getters Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String getLinkedin() {
		return linkedin;
	}

	public void setLinkedin(String linkedin) {
		this.linkedin = linkedin;
	}

	@Override
	public String toString() {
		String retorno = "[Nome: " 		+ this.nome 	+ ", " +
						  "Telefone: " 	+ this.telefone + ", " +
						  "E-mail: " 	+ this.email 	+ ", " +
						  "LinkedIn: " 	+ this.linkedin + "]";
		return retorno;
	}
	
}
