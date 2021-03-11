package main;

import classesBase.Jogo;

/**
 * Classe do livro Java Start
 * posição do livro - 1930 
 *
 */
public class TestaJogo {

	public static void main(String[] args) {
		Jogo j = new Jogo();
		j.setAposta(5);
		j.executaJogo();
		j.mostraResultado();

	}

}
