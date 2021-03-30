package personagem;

import java.math.BigDecimal;

public class DadosPersonagem {
	private Atributos atributos;
	private String nome;
	private Integer idade;
	private String cor;
	private String corOlhos;
	private String tipoCabelo;
	private String grossuraCabelo;
	private String corCabelo;
	private String detalhesCorporais;
	private String tipoFisico;
	private Double altura;
	private Double peso;
	private Integer modificadorDeTamanho;
	
	public DadosPersonagem() {
		this.nome = "";
		this.idade = 0;
		this.cor = "";
		this.corOlhos = "";
		this.tipoCabelo = "";
		this.grossuraCabelo = "";
		this.corCabelo = "";
		this.detalhesCorporais = "";
		this.tipoFisico = "";
		this.altura = 0.0;
		this.peso = 0.0;
		this.modificadorDeTamanho = 10;
	}
	
	
	
	public Atributos getAtributos() {
		return atributos;
	}



	public void setAtributos(Atributos atributos) {
		this.atributos = atributos;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public Integer getIdade() {
		return idade;
	}



	public void setIdade(Integer idade) {
		this.idade = idade;
	}



	public String getCor() {
		return cor;
	}



	public void setCor(String cor) {
		this.cor = cor;
	}



	public String getCorOlhos() {
		return corOlhos;
	}



	public void setCorOlhos(String corOlhos) {
		this.corOlhos = corOlhos;
	}



	public String getTipoCabelo() {
		return tipoCabelo;
	}



	public void setTipoCabelo(String tipoCabelo) {
		this.tipoCabelo = tipoCabelo;
	}



	public String getGrossuraCabelo() {
		return grossuraCabelo;
	}



	public void setGrossuraCabelo(String grossuraCabelo) {
		this.grossuraCabelo = grossuraCabelo;
	}



	public String getCorCabelo() {
		return corCabelo;
	}



	public void setCorCabelo(String corCabelo) {
		this.corCabelo = corCabelo;
	}



	public String getDetalhesCorporais() {
		return detalhesCorporais;
	}



	public void setDetalhesCorporais(String detalhesCorporais) {
		this.detalhesCorporais = detalhesCorporais;
	}



	public String getTipoFisico() {
		return tipoFisico;
	}



	public void setTipoFisico(String tipoFisico) {
		this.tipoFisico = tipoFisico;
	}



	public Double getAltura() {
		return altura;
	}



	public void setAltura(Double altura) {
		this.altura = altura;
	}



	public Double getPeso() {
		return peso;
	}



	public void setPeso(Double peso) {
		this.peso = peso;
	}



	public Integer getModificadorDeTamanho() {
		return modificadorDeTamanho;
	}



	public void setModificadorDeTamanho(Integer modificadorDeTamanho) {
		this.modificadorDeTamanho = modificadorDeTamanho;
	}


}
