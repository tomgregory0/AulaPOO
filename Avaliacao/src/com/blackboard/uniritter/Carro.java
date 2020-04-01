package com.blackboard.uniritter;

import java.util.Date;

public class Carro {

	private String modelo;
	private String cor;
	private Integer ano;
	private String marca;
	private String chassi;
	private Proprietario proprietario;
	private Float velocidadeMaxima = 0f;
	private Float velocidadeAtual = 0f;
	private Integer nrPortas = 0;
	private Boolean tetoSolar;
	private Integer nrMarchas = 0;
	private Boolean cambioAutomatico;
	private Integer volumeDeCombustivel = 0;

	public Carro() {

	}

	public Carro(Proprietario proprietario) {
		super();
		this.proprietario = proprietario;
	}

	public Carro(String modelo, String cor, Integer ano, String marca, String chassi, Proprietario proprietario,
			Float velocidadeMaxima, Float velocidadeAtual, Integer nrPortas, Boolean tetoSolar, Integer nrMarchas,
			Boolean cambioAutomatico, Integer volumeDeCombustivel) {
		super();
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		this.marca = marca;
		this.chassi = chassi;
		this.proprietario = proprietario;
		this.velocidadeMaxima = velocidadeMaxima;
		this.velocidadeAtual = velocidadeAtual;
		this.nrPortas = nrPortas;
		this.tetoSolar = tetoSolar;
		this.nrMarchas = nrMarchas;
		this.cambioAutomatico = cambioAutomatico;
		this.volumeDeCombustivel = volumeDeCombustivel;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}

	public Float getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(Float velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public Float getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(Float velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public Integer getNrPortas() {
		return nrPortas;
	}

	public void setNrPortas(Integer nrPortas) {
		this.nrPortas = nrPortas;
	}

	public Boolean getTetoSolar() {
		return tetoSolar;
	}

	public void setTetoSolar(Boolean tetoSolar) {
		this.tetoSolar = tetoSolar;
	}

	public Integer getNrMarchas() {
		return nrMarchas;
	}

	public void setNrMarchas(Integer nrMarchas) {
		this.nrMarchas = nrMarchas;
	}

	public Boolean getCambioAutomatico() {
		return cambioAutomatico;
	}

	public void setCambioAutomatico(Boolean cambioAutomatico) {
		this.cambioAutomatico = cambioAutomatico;
	}

	public Integer getVolumeDeCombustivel() {
		return volumeDeCombustivel;
	}

	public void setVolumeDeCombustivel(Integer volumeDeCombustivel) {
		this.volumeDeCombustivel = volumeDeCombustivel;
	}

	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + ", cor=" + cor + ", ano=" + ano + ", marca=" + marca + ", chassi=" + chassi
				+ ", proprietario=" + proprietario + ", velocidadeMaxima=" + velocidadeMaxima + ", velocidadeAtual="
				+ velocidadeAtual + ", nrPortas=" + nrPortas + ", tetoSolar=" + tetoSolar + ", nrMarchas=" + nrMarchas
				+ ", cambioAutomatico=" + cambioAutomatico + ", volumeDeCombustivel=" + volumeDeCombustivel + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ano == null) ? 0 : ano.hashCode());
		result = prime * result + ((cambioAutomatico == null) ? 0 : cambioAutomatico.hashCode());
		result = prime * result + ((chassi == null) ? 0 : chassi.hashCode());
		result = prime * result + ((cor == null) ? 0 : cor.hashCode());
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		result = prime * result + ((nrMarchas == null) ? 0 : nrMarchas.hashCode());
		result = prime * result + ((nrPortas == null) ? 0 : nrPortas.hashCode());
		result = prime * result + ((proprietario == null) ? 0 : proprietario.hashCode());
		result = prime * result + ((tetoSolar == null) ? 0 : tetoSolar.hashCode());
		result = prime * result + ((velocidadeAtual == null) ? 0 : velocidadeAtual.hashCode());
		result = prime * result + ((velocidadeMaxima == null) ? 0 : velocidadeMaxima.hashCode());
		result = prime * result + ((volumeDeCombustivel == null) ? 0 : volumeDeCombustivel.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carro other = (Carro) obj;
		if (ano == null) {
			if (other.ano != null)
				return false;
		} else if (!ano.equals(other.ano))
			return false;
		if (cambioAutomatico == null) {
			if (other.cambioAutomatico != null)
				return false;
		} else if (!cambioAutomatico.equals(other.cambioAutomatico))
			return false;
		if (chassi == null) {
			if (other.chassi != null)
				return false;
		} else if (!chassi.equals(other.chassi))
			return false;
		if (cor == null) {
			if (other.cor != null)
				return false;
		} else if (!cor.equals(other.cor))
			return false;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		if (nrMarchas == null) {
			if (other.nrMarchas != null)
				return false;
		} else if (!nrMarchas.equals(other.nrMarchas))
			return false;
		if (nrPortas == null) {
			if (other.nrPortas != null)
				return false;
		} else if (!nrPortas.equals(other.nrPortas))
			return false;
		if (proprietario == null) {
			if (other.proprietario != null)
				return false;
		} else if (!proprietario.equals(other.proprietario))
			return false;
		if (tetoSolar == null) {
			if (other.tetoSolar != null)
				return false;
		} else if (!tetoSolar.equals(other.tetoSolar))
			return false;
		if (velocidadeAtual == null) {
			if (other.velocidadeAtual != null)
				return false;
		} else if (!velocidadeAtual.equals(other.velocidadeAtual))
			return false;
		if (velocidadeMaxima == null) {
			if (other.velocidadeMaxima != null)
				return false;
		} else if (!velocidadeMaxima.equals(other.velocidadeMaxima))
			return false;
		if (volumeDeCombustivel == null) {
			if (other.volumeDeCombustivel != null)
				return false;
		} else if (!volumeDeCombustivel.equals(other.volumeDeCombustivel))
			return false;
		return true;
	}

}
