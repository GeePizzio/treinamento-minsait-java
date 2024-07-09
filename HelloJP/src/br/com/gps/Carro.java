package br.com.gps;

public class Carro {
	
	//Atributos - Características
	private String cor;
	private String marca;
	private String modelo;
	private String cambio; //automático ou manual
	
	//Construtor
	public Carro() {}
	
	//Sobrecarga de Métodos
	public Carro(String c, String ma, String mo) {
		this.cor = c;
		this.marca = ma;
		this.modelo = mo;
		this.cambio = "Manual";
	}
	
	public Carro(String c, String ma, String mo, String cam) {
		this.cor = c;
		this.marca = ma;
		this.modelo = mo;
		this.cambio = cam;
	}
	
	public Carro(String c, String ma, String mo, boolean cam) {
		this.cor = c;
		this.marca = ma;
		this.modelo = mo;
		
		if (cam == true)
			this.cambio = "Automático";
		else
			this.cambio = "Manual";
	}
	
	//Métodos - Ações
	public void andar() {
		System.out.println("Andando...");
	}
	
	public void parar() {
		System.out.println("Parado!");
	}
	
	//Getters Setters
	public String getCor() {
		return this.cor;
	}
	
	protected void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	protected void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	protected void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCambio() {
		return cambio;
	}

	protected void setCambio(String cambio) {
		this.cambio = cambio;
	}
	
	@Override
	public String toString() {
		String retorno = "[Cor: " + this.cor + ", " +
						  "Marca: " + this.marca + ", " +
						  "Modelo: " + this.modelo + ", " +
						  "Câmbio: " + this.cambio + "] ";
		return retorno;
	}
	
}
