package br.imd.ufrn.excecao.verificada;

public class VerificadaException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public VerificadaException() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Sou uma exceção verificada";
	}
	
	

}
