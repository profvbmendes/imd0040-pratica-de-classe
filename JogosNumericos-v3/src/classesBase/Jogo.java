package classesBase;

import java.util.Random;

/**
 * Classe do livro Java Start
 * posição do livro - 1886
 * 
 *
 */
public class Jogo {
	//Atributos
	private int aposta;
	private int resultado;
	
	public int getResultado() {
		return resultado;
	}

	public void setAposta(int aposta) {
		if (aposta > 6 || aposta < 1 ) {
			System.out.println("Aposta inválida");
		}
		
		this.aposta = aposta;
	}

	//Métodos
	public void executaJogo() {
		//TODO acessem a API do Java e busquem pela classe Random. O que o método nextInt() faz? 
		//TODO que outros métodos da classe Random chamaram sua atenção? 
		this.resultado = (new Random().nextInt(6) + 1);
	}
	
	public void mostraResultado() {
		System.out.println("Sua aposta: " + aposta + " Resultado: " + resultado);
		if (this.resultado == this.aposta) {
			System.out.println("Parabéns, você acertou!");
		}else {
			System.out.println("Errou. Mas, continue tentando...");
		}
	}	
	
	
	
	
}
