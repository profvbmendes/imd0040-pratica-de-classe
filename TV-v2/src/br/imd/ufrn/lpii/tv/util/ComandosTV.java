package br.imd.ufrn.lpii.tv.util;

public interface ComandosTV {
	public void ligar();
	public default void desligar() {
		System.out.println("Desligamento genérico realizado");
	}
	
}
