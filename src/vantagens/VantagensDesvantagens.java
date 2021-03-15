package vantagens;

public class VantagensDesvantagens {
	
	private Integer id;
	private String nome;
	private Integer custo;
	private String descricao;
	private Integer nivel;
	private Integer AutoControleEFrequenciaOcorrencia;
	private Integer totalPontosVantagens;
	private Integer totalPontosDesvantagens;
	private Integer totalPontosQuirks;
	private Integer totalPontosPerks;
	
	public VantagensDesvantagens(Integer id, String nome, Integer custo, String descricao, Integer nivel,
			Integer autoControleEFrequenciaOcorrencia, Integer totalPontosVantagens, Integer totalPontosDesvantagens,
			Integer totalPontosQuirks, Integer totalPontosPerks) {
		super();
		this.id = id;
		this.nome = nome;
		this.custo = custo;
		this.descricao = descricao;
		this.nivel = nivel;
		AutoControleEFrequenciaOcorrencia = autoControleEFrequenciaOcorrencia;
		this.totalPontosVantagens = totalPontosVantagens;
		this.totalPontosDesvantagens = totalPontosDesvantagens;
		this.totalPontosQuirks = totalPontosQuirks;
		this.totalPontosPerks = totalPontosPerks;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCusto() {
		return custo;
	}

	public void setCusto(Integer custo) {
		this.custo = custo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getNivel() {
		return nivel;
	}

	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}

	public Integer getAutoControleEFrequenciaOcorrencia() {
		return AutoControleEFrequenciaOcorrencia;
	}

	public void setAutoControleEFrequenciaOcorrencia(Integer autoControleEFrequenciaOcorrencia) {
		AutoControleEFrequenciaOcorrencia = autoControleEFrequenciaOcorrencia;
	}

	public Integer getTotalPontosVantagens() {
		return totalPontosVantagens;
	}

	public void setTotalPontosVantagens(Integer totalPontosVantagens) {
		this.totalPontosVantagens = totalPontosVantagens;
	}

	public Integer getTotalPontosDesvantagens() {
		return totalPontosDesvantagens;
	}

	public void setTotalPontosDesvantagens(Integer totalPontosDesvantagens) {
		this.totalPontosDesvantagens = totalPontosDesvantagens;
	}

	public Integer getTotalPontosQuirks() {
		return totalPontosQuirks;
	}

	public void setTotalPontosQuirks(Integer totalPontosQuirks) {
		this.totalPontosQuirks = totalPontosQuirks;
	}

	public Integer getTotalPontosPerks() {
		return totalPontosPerks;
	}

	public void setTotalPontosPerks(Integer totalPontosPerks) {
		this.totalPontosPerks = totalPontosPerks;
	}
	
	
}
