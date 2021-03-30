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
	private Integer nivelForca;
	
	private DadosPersonagem dadosPersonagem;
	
	private Integer destreza;
	private Integer modificadorDestreza;
	private Integer pontosGastosDes;
	private Integer nivelDes;
	
	private Integer inteligencia;
	private Integer modificadorInteligencia;
	private Integer pontosGastosInt;
	private Integer nivelInt;
	
	
	private Integer saude;
	private Integer modificadorSaude;
	private Integer pontosGastosSaude;
	private Integer nivelSaude;
	
	private Integer vida;
	private Integer modificadorVida;
	private Integer pontosGastosVida;
	private Integer nivelVida;
	
	private Integer fadiga;
	private Integer modificadorFadiga;
	private Integer pontosGastosFadiga;
	private Integer nivelFad;
	
	
	public Atributos() {
		forca = 10;
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
		
		dadosPersonagem = new DadosPersonagem();
				
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

	public Integer getCustoForca() {
		return custoForca;
	}

	public void setCustoForca(Integer custoForca) {
		this.custoForca = custoForca;
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



	public Integer getNivelForca() {
		return nivelForca;
	}



	public void setNivelForca(Integer nivelForca) {
		this.nivelForca = nivelForca;
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



	public Integer getNivelDes() {
		return nivelDes;
	}



	public void setNivelDes(Integer nivelDes) {
		this.nivelDes = nivelDes;
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



	public Integer getNivelInt() {
		return nivelInt;
	}



	public void setNivelInt(Integer nivelInt) {
		this.nivelInt = nivelInt;
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



	public Integer getNivelSaude() {
		return nivelSaude;
	}



	public void setNivelSaude(Integer nivelSaude) {
		this.nivelSaude = nivelSaude;
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



	public Integer getNivelVida() {
		return nivelVida;
	}



	public void setNivelVida(Integer nivelVida) {
		this.nivelVida = nivelVida;
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



	public Integer getNivelFad() {
		return nivelFad;
	}



	public void setNivelFad(Integer nivelFad) {
		this.nivelFad = nivelFad;
	}

	


	public void calculoCustoForcaModificadorTamanho() {
		double custoForcaCalc= (-0.1*dadosPersonagem.getModificadorDeTamanho())*10;	
		if(custoForcaCalc > -9) {
			custoForca =  (int)custoForcaCalc + 10;
		}else {
			custoForca = 2;
		}
		System.out.println("Método CalculoCustoForca:"+custoForca);
		
	}
	
	public void calculoForca() {
		if(forca>=0) {
			nivelForca = pontosGastosFor/custoForca;
			forca = 10 + modificadorForca + nivelForca;
		}
	}
	
	public void calculoInt() {
		if(destreza>=0) {
			nivelInt= pontosGastosInt/custoVinte;
			inteligencia = 10 + modificadorInteligencia + nivelInt;
		}
	}
	
	public void calculoDes() {
		if(destreza>=0){
			nivelDes = pontosGastosDes/custoVinte;
			destreza = 10 + modificadorDestreza + nivelDes;
		}
	}
	
	public void calculoSaude() {
		if(saude>=0) {	
			nivelSaude = pontosGastosSaude/custoDez;
			saude = 10 + modificadorSaude + nivelSaude;
		}
	}
}
