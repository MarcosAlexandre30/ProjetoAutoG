package idiomas;

public class Idiomas {
	private Integer idIdioma;
	private String idioma;
	private Integer custoFalado;
	private Integer custoEscrito;
	private Integer nivelIdiomaFalado;
	private Integer nivelIdiomaEscrito;
	private Integer pontosIdioma;
	
	public Idiomas(Integer idIdioma, String idioma, Integer custoFalado, Integer custoEscrito,
			Integer nivelIdiomaFalado, Integer nivelIdiomaEscrito, Integer pontosIdioma) {
		super();
		this.idIdioma = idIdioma;
		this.idioma = idioma;
		this.custoFalado = custoFalado;
		this.custoEscrito = custoEscrito;
		this.nivelIdiomaFalado = nivelIdiomaFalado;
		this.nivelIdiomaEscrito = nivelIdiomaEscrito;
		this.pontosIdioma = pontosIdioma;
	}
	
	public Integer getIdIdioma() {
		return idIdioma;
	}
	public void setIdIdioma(Integer idIdioma) {
		this.idIdioma = idIdioma;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public Integer getCustoFalado() {
		return custoFalado;
	}
	public void setCustoFalado(Integer custoFalado) {
		this.custoFalado = custoFalado;
	}
	public Integer getCustoEscrito() {
		return custoEscrito;
	}
	public void setCustoEscrito(Integer custoEscrito) {
		this.custoEscrito = custoEscrito;
	}
	public Integer getNivelIdiomaFalado() {
		return nivelIdiomaFalado;
	}
	public void setNivelIdiomaFalado(Integer nivelIdiomaFalado) {
		this.nivelIdiomaFalado = nivelIdiomaFalado;
	}
	public Integer getNivelIdiomaEscrito() {
		return nivelIdiomaEscrito;
	}
	public void setNivelIdiomaEscrito(Integer nivelIdiomaEscrito) {
		this.nivelIdiomaEscrito = nivelIdiomaEscrito;
	}
	public Integer getPontosIdioma() {
		return pontosIdioma;
	}
	public void setPontosIdioma(Integer pontosIdioma) {
		this.pontosIdioma = pontosIdioma;
	}

	
}