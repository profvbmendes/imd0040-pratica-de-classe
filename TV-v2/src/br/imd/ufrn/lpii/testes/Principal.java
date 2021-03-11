package br.imd.ufrn.lpii.testes;

import br.imd.ufrn.lpii.tv.lg.TVLG;
import br.imd.ufrn.lpii.tv.philco.TVPhilco;
import br.imd.ufrn.lpii.tv.sony.TVSony;
import br.imd.ufrn.lpii.tv.util.ComandosTV;

public class Principal {

	public static void main(String[] args) {
		ComandosTV sony = new TVSony();
		ComandosTV lg = new TVLG();
		ComandosTV philco = new TVPhilco();
		
		
		sony.ligar();
		lg.ligar();
		philco.ligar();
		
		lg.desligar();
		sony.desligar();
		philco.desligar();
		

	}

}
