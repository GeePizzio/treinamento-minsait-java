package br.com.gps.model;

import br.com.gps.exception.LimiteCreditoExcedidoException;

public class ContaBancaria {
	
	private double limitePix = 1000.0;
	
	public ContaBancaria(double limitePix) {
		this.limitePix = limitePix;
	}
	
	public void fazerPix(double quantia) throws LimiteCreditoExcedidoException {
		if (quantia > this.limitePix) {
			throw new LimiteCreditoExcedidoException(quantia-this.limitePix);
		} else {
			System.out.println("Pix realizado com sucesso.");
		}
	}
}
