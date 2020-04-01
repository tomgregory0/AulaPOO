package com.blackboard.uniritter;

public class Marca {

	private Integer nrDeModelos;
	private Integer anoLancamento;
	private Integer codigoIdentificador;

	public Marca(Integer nrDeModelos, Integer anoLancamento, Integer codigoIdentificador) {
		super();
		this.nrDeModelos = nrDeModelos;
		this.anoLancamento = anoLancamento;
		this.codigoIdentificador = codigoIdentificador;
	}

	public Integer getNrDeModelos() {
		return nrDeModelos;
	}

	public void setNrDeModelos(Integer nrDeModelos) {
		this.nrDeModelos = nrDeModelos;
	}

	public Integer getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(Integer anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public Integer getCodigoIdentificador() {
		return codigoIdentificador;
	}

	public void setCodigoIdentificador(Integer codigoIdentificador) {
		this.codigoIdentificador = codigoIdentificador;
	}

	@Override
	public String toString() {
		return "Marca [nrDeModelos=" + nrDeModelos + ", anoLancamento=" + anoLancamento + ", codigoIdentificador="
				+ codigoIdentificador + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anoLancamento == null) ? 0 : anoLancamento.hashCode());
		result = prime * result + ((codigoIdentificador == null) ? 0 : codigoIdentificador.hashCode());
		result = prime * result + ((nrDeModelos == null) ? 0 : nrDeModelos.hashCode());
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
		Marca other = (Marca) obj;
		if (anoLancamento == null) {
			if (other.anoLancamento != null)
				return false;
		} else if (!anoLancamento.equals(other.anoLancamento))
			return false;
		if (codigoIdentificador == null) {
			if (other.codigoIdentificador != null)
				return false;
		} else if (!codigoIdentificador.equals(other.codigoIdentificador))
			return false;
		if (nrDeModelos == null) {
			if (other.nrDeModelos != null)
				return false;
		} else if (!nrDeModelos.equals(other.nrDeModelos))
			return false;
		return true;
	}

}
