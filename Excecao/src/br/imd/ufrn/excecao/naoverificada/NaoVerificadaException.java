package br.imd.ufrn.excecao.naoverificada;

public class NaoVerificadaException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NaoVerificadaException() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMessage() {		
		return "Sou uma exceção NÃO checada";
	}
	
	

}
