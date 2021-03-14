package personagem;

public class Atributos {
	
	private final Integer custoDez = 10;
	private final Integer custoVinte = 20;
	private final Integer custoDois = 2;
	private final Integer custotres = 3;
	
	private Integer forca;
	private Integer modificadorForca;
	private Integer custoForca;
	private Integer pontosGastosFor;
	
	private Integer destreza;
	private Integer modificadorDestreza;
	private Integer pontosGastosDes;
	
	private Integer inteligencia;
	private Integer modificadorInteligencia;
	private Integer pontosGastosInt;
	
	
	private Integer saude;
	private Integer modificadorSaude;
	private Integer pontosGastosSaude;
	
	private Integer vida;
	private Integer modificadorVida;
	private Integer pontosGastosVida;
	
	private Integer fadiga;
	private Integer modificadorFadiga;;
	private Integer pontosGastosFadiga;
	
	private Integer pontosEnergia;
	private Integer levelPontosEnergia;
	private Integer pontosGastosEnergia;
	
	public Atributos() {
		forca = 27;
		modificadorForca = 0;
		custoForca = 0;
		pontosGastosFor = 0;
		
		destreza = 10;
		modificadorDestreza = 0;
		pontosGastosDes = 0;
		
		inteligencia = 10;
		modificadorInteligencia = 0;
		pontosGastosInt = 0;
		
		saude = 10;
		modificadorSaude = 0;
		pontosGastosSaude = 0;
		
		vida = forca;
		modificadorVida = 0;
		pontosGastosVida = 0;
		
		fadiga = saude;
		modificadorFadiga = 0;
		pontosGastosFadiga = 0;
		
		pontosEnergia = fadiga;
		levelPontosEnergia = 0;
		pontosGastosEnergia = 0;
				
	}

	public Integer getForca() {
		return forca;
	}

	public void setForca(Integer forca) {
		this.forca = forca;
	}

	public Integer getModificadorForca() {
		return modificadorForca;
	}

	public void setModificadorForca(Integer modificadorForca) {
		this.modificadorForca = modificadorForca;
	}

	public Integer getPontosGastosFor() {
		return pontosGastosFor;
	}

	public void setPontosGastosFor(Integer pontosGastosFor) {
		this.pontosGastosFor = pontosGastosFor;
	}

	public Integer getDestreza() {
		return destreza;
	}

	public void setDestreza(Integer destreza) {
		this.destreza = destreza;
	}

	public Integer getModificadorDestreza() {
		return modificadorDestreza;
	}

	public void setModificadorDestreza(Integer modificadorDestreza) {
		this.modificadorDestreza = modificadorDestreza;
	}

	public Integer getPontosGastosDes() {
		return pontosGastosDes;
	}

	public void setPontosGastosDes(Integer pontosGastosDes) {
		this.pontosGastosDes = pontosGastosDes;
	}

	public Integer getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(Integer inteligencia) {
		this.inteligencia = inteligencia;
	}

	public Integer getModificadorInteligencia() {
		return modificadorInteligencia;
	}

	public void setModificadorInteligencia(Integer modificadorInteligencia) {
		this.modificadorInteligencia = modificadorInteligencia;
	}

	public Integer getPontosGastosInt() {
		return pontosGastosInt;
	}

	public void setPontosGastosInt(Integer pontosGastosInt) {
		this.pontosGastosInt = pontosGastosInt;
	}

	public Integer getSaude() {
		return saude;
	}

	public void setSaude(Integer saude) {
		this.saude = saude;
	}

	public Integer getModificadorSaude() {
		return modificadorSaude;
	}

	public void setModificadorSaude(Integer modificadorSaude) {
		this.modificadorSaude = modificadorSaude;
	}

	public Integer getPontosGastosSaude() {
		return pontosGastosSaude;
	}

	public void setPontosGastosSaude(Integer pontosGastosSaude) {
		this.pontosGastosSaude = pontosGastosSaude;
	}

	public Integer getVida() {
		return vida;
	}

	public void setVida(Integer vida) {
		this.vida = vida;
	}

	public Integer getModificadorVida() {
		return modificadorVida;
	}

	public void setModificadorVida(Integer modificadorVida) {
		this.modificadorVida = modificadorVida;
	}

	public Integer getPontosGastosVida() {
		return pontosGastosVida;
	}

	public void setPontosGastosVida(Integer pontosGastosVida) {
		this.pontosGastosVida = pontosGastosVida;
	}

	public Integer getFadiga() {
		return fadiga;
	}

	public void setFadiga(Integer fadiga) {
		this.fadiga = fadiga;
	}

	public Integer getModificadorFadiga() {
		return modificadorFadiga;
	}

	public void setModificadorFadiga(Integer modificadorFadiga) {
		this.modificadorFadiga = modificadorFadiga;
	}

	public Integer getPontosGastosFadiga() {
		return pontosGastosFadiga;
	}

	public void setPontosGastosFadiga(Integer pontosGastosFadiga) {
		this.pontosGastosFadiga = pontosGastosFadiga;
	}

	public Integer getPontosEnergia() {
		return pontosEnergia;
	}

	public void setPontosEnergia(Integer pontosEnergia) {
		this.pontosEnergia = pontosEnergia;
	}

	public Integer getLevelPontosEnergia() {
		return levelPontosEnergia;
	}

	public void setLevelPontosEnergia(Integer levelPontosEnergia) {
		this.levelPontosEnergia = levelPontosEnergia;
	}

	public Integer getPontosGastosEnergia() {
		return pontosGastosEnergia;
	}

	public void setPontosGastosEnergia(Integer pontosGastosEnergia) {
		this.pontosGastosEnergia = pontosGastosEnergia;
	}
	
	
}
