package com.blackboard.uniritter;

public class Dados extends Carro {

	public Float Acelera(Float velocidadeMaxima, Float velocidadeAtual) {
		for (int i = 0; i < velocidadeMaxima; i++) {

			velocidadeAtual += i;

		}
		return velocidadeAtual;

	}

	public Float Desacelera(Float velocidadeMaxima, Float velocidadeAtual) {
		for (int i = 0; i > velocidadeMaxima; i--) {

			velocidadeAtual -= i;

		}

		return velocidadeAtual;

	}

	public int AumentaMarcha(int nrMarcha, int marchaAtual) {

		marchaAtual += nrMarcha;

		return marchaAtual;

	}

	public int ReduzMarcha(int nrMarcha, int marchaAtual) {

		marchaAtual -= nrMarcha;

		return marchaAtual;

	}

	public Float MarchaRe(int nrMarcha, Float velocidadeAtual) {

		if (velocidadeAtual < 0) {

			System.exit(0);

		} else
			velocidadeAtual--;
		return velocidadeAtual;
	}
	
	public void ConsumoMedio() {
		
	}

	
	public void ExibirConsumo() {
		
		
	}

	

}
