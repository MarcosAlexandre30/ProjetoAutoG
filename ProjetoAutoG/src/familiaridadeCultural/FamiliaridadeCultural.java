package familiaridadeCultural;

public class FamiliaridadeCultural {
	
	private Integer idFamiliaridade;
	private String nomeFamiliaridade;
	private Integer custoFamiliaridade;
	private Integer pontosFamiliaridade;
	private String descricaoFamiliaridade;
	private String tipoFamiliaridade;
	
	public FamiliaridadeCultural(Integer idFamiliaridade, String nomeFamiliaridade, Integer custoFamiliaridade,
			Integer pontosFamiliaridade, String descricaoFamiliaridade, String tipoFamiliaridade) {
		super();
		this.idFamiliaridade = idFamiliaridade;
		this.nomeFamiliaridade = nomeFamiliaridade;
		this.custoFamiliaridade = custoFamiliaridade;
		this.pontosFamiliaridade = pontosFamiliaridade;
		this.descricaoFamiliaridade = descricaoFamiliaridade;
		this.tipoFamiliaridade = tipoFamiliaridade;
	}

	public Integer getIdFamiliaridade() {
		return idFamiliaridade;
	}

	public void setIdFamiliaridade(Integer idFamiliaridade) {
		this.idFamiliaridade = idFamiliaridade;
	}

	public String getNomeFamiliaridade() {
		return nomeFamiliaridade;
	}

	public void setNomeFamiliaridade(String nomeFamiliaridade) {
		this.nomeFamiliaridade = nomeFamiliaridade;
	}

	public Integer getCustoFamiliaridade() {
		return custoFamiliaridade;
	}

	public void setCustoFamiliaridade(Integer custoFamiliaridade) {
		this.custoFamiliaridade = custoFamiliaridade;
	}

	public Integer getPontosFamiliaridade() {
		return pontosFamiliaridade;
	}

	public void setPontosFamiliaridade(Integer pontosFamiliaridade) {
		this.pontosFamiliaridade = pontosFamiliaridade;
	}

	public String getDescricaoFamiliaridade() {
		return descricaoFamiliaridade;
	}

	public void setDescricaoFamiliaridade(String descricaoFamiliaridade) {
		this.descricaoFamiliaridade = descricaoFamiliaridade;
	}

	public String getTipoFamiliaridade() {
		return tipoFamiliaridade;
	}

	public void setTipoFamiliaridade(String tipoFamiliaridade) {
		this.tipoFamiliaridade = tipoFamiliaridade;
	}
	
	
}
