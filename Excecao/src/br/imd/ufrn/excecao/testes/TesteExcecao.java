package br.imd.ufrn.excecao.testes;

import br.imd.ufrn.excecao.naoverificada.NaoVerificadaException;
import br.imd.ufrn.excecao.verificada.VerificadaException;

public class TesteExcecao {

	public TesteExcecao() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void metodo1() {		
		System.out.println("Vou diparar uma exceção não verificada");
		throw new NaoVerificadaException();
	}
	
	
	public void metodo2() throws VerificadaException  {
		System.out.println("Vou diparar uma exceção Verificada");
		throw new VerificadaException();
		
	}
	
	public static void main (String args[]) {
		TesteExcecao te = new TesteExcecao();
		
		//te.metodo1();
		
		
		try {
			te.metodo2();
		} catch (VerificadaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

}
