package br.com.gps.model;

public class Aluno extends Pessoa{
	//Atributos
	private String matricula;
	private int anoMatricula;
	
	//Constructor
	public Aluno(String matricula, int anoMatricula, String nome, String telefone, String email) {
		super(nome, telefone, email);
		this.matricula = matricula;
		this.anoMatricula = anoMatricula;
	}

	//Getters/Setters
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getAnoMatricula() {
		return anoMatricula;
	}

	public void setAnoMatricula(int anoMatricula) {
		this.anoMatricula = anoMatricula;
	}
	
	@Override
	public String toString() {
		String retorno = "[Matrícula: " 		+ this.matricula 		+ ", " +
						  "Ano de Matrícula: " 	+ this.anoMatricula 	+ ", " +
						  "Nome: "				+ super.getNome() 		+ ", " +
						  "Telefone: "			+ super.getTelefone() 	+ ", " +
						  "E-mail: "			+ super.getEmail()		+ "]";
		return retorno;
	}

}
