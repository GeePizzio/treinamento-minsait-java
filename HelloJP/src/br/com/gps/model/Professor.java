package br.com.gps.model;

public class Professor extends Pessoa{
	
	//Atributos
	private int codigo;
	private String materia;
	private String formacao;
	
	//Contructor
	public Professor(int codigo, String materia, String formacao, String nome, String telefone, String email) {
		super(nome, telefone, email);
		this.codigo = codigo;
		this.materia = materia;
		this.formacao = formacao;
	}

	public Professor(int codigo, String materia, String formacao, String nome, String telefone, String email, String linkedin) {
		super(nome, telefone, email, linkedin);
		this.codigo = codigo;
		this.materia = materia;
		this.formacao = formacao;
	}

	//Getters/Setters
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	
	@Override
	public String toString() {
		String retorno = "[Código: " 			+ this.codigo 			+ ", " +
			  			  "Matéria: " 			+ this.materia 			+ ", " +
			  			  "Formação: " 			+ this.formacao 		+ ", " +
			  			  "Nome: "				+ super.getNome() 		+ ", " +
			  			  "Telefone: "			+ super.getTelefone() 	+ ", " +
			  			  "E-mail: "			+ super.getEmail()		+ ", " +
			  			  "LinkedIn: "			+ super.getLinkedin()	+ "] ";
		return retorno;
	}
	
	
}
