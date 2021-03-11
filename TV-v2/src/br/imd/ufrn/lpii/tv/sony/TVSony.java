package br.imd.ufrn.lpii.tv.sony;

import br.imd.ufrn.lpii.tv.util.ComandosTV;

public class TVSony implements ComandosTV{

	@Override
	public void ligar() {
		System.out.println("Sony");
		
	}

	@Override
	public void desligar() {
		System.out.print("Sony - desligando equipamento com segurança. Aguarde ");
		try {
			for ( int i = 5 ; i > 0; i--) {
				Thread.sleep(1000);
				System.out.print( i + " ");
			}
		} catch (InterruptedException e) {
		}
		System.out.println(" delisgamento concluido");
		
	}
	
		

}
