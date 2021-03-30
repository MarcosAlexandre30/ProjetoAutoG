package personagem;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Dano {
	private final int cinco = 5;

	
	private Atributos atributos;
	private Integer forcaAcerto;
	private Integer modificadorForcaAcerto;
	private Integer pontosGastosForcaAcerto;
	private Integer quantidadeDadosEstocada;
	private Integer modificadorDadoEstocada;
	private Integer quantidadeDadosBalanco;
	private Integer modificadorDadoBalanco;
	private int nivelForca;
	
	public Dano() {
		atributos = new Atributos();
		forcaAcerto = atributos.getForca();
		modificadorForcaAcerto = 0;
		pontosGastosForcaAcerto = 0;
		quantidadeDadosEstocada = 1;
		quantidadeDadosBalanco = 1;
		modificadorDadoEstocada = -6;
		modificadorDadoBalanco = -5;
		nivelForca = 0;
	}
	
	
	public void setarDanoBalanco() {
		int cont = 0;
		int primo = 0;
		
		BigDecimal valorDecimalBalanco;
		BigDecimal valorInteiroBalanco;
		BigDecimal decimaisBalanco;
		double decimaisDoubleBalanco;
		
		Integer nivelForcaBalanco;
		Integer numeroDados;
		
		
		
		if(forcaAcerto > 0 && forcaAcerto<9) {
				for(int i=3;i<=forcaAcerto;i++) {
					for(int j=1;j<=i;j++) {
						if(i%j == 0) {
							cont++;
							}
					}
					if(cont == 2) {
						primo++;
						cont=0;
					}else {
						cont=0;
					}
				}
			modificadorDadoBalanco = modificadorDadoBalanco + primo;	
		
		}else if (forcaAcerto>8 && forcaAcerto<27) {
			
			valorDecimalBalanco = BigDecimal.valueOf(forcaAcerto).divide(new BigDecimal(4));
			valorInteiroBalanco = valorDecimalBalanco.setScale(0, RoundingMode.DOWN);
			
			decimaisBalanco = valorDecimalBalanco.subtract(valorInteiroBalanco);
			decimaisDoubleBalanco = decimaisBalanco.doubleValue();
			
			modificadorDadoEstocada = -2;
			
			if(decimaisDoubleBalanco == 0.25) {
				if(valorInteiroBalanco.intValue() > 2) {
					quantidadeDadosBalanco = valorInteiroBalanco.intValue()-1;
					modificadorDadoBalanco = -1;
				}else {
					modificadorDadoBalanco = -1;
				}	
			}else if(decimaisDoubleBalanco == 0.5) {
				if(valorInteiroBalanco.intValue() > 2) {
					quantidadeDadosBalanco = valorInteiroBalanco.intValue()-1;
					modificadorDadoBalanco = -0;
				}else {
					modificadorDadoBalanco = -0;
				}
			}else if(decimaisDoubleBalanco == 0.75) {
				if(valorInteiroBalanco.intValue() > 2) {
					quantidadeDadosBalanco = valorInteiroBalanco.intValue()-1;
					modificadorDadoBalanco = 1;
				}else {
					modificadorDadoBalanco = 1;
				}
			}else {
				modificadorDadoBalanco = 2;
			}

		}
		if(forcaAcerto >26 && forcaAcerto<41) {
			
			valorDecimalBalanco = BigDecimal.valueOf(forcaAcerto).divide(new BigDecimal(8));
			valorInteiroBalanco = valorDecimalBalanco.setScale(0, RoundingMode.DOWN);
			
			decimaisBalanco = valorDecimalBalanco.subtract(valorInteiroBalanco);
			decimaisDoubleBalanco = decimaisBalanco.doubleValue();
			
			if(decimaisDoubleBalanco == 0.875 || decimaisDoubleBalanco == 0) {
				if(valorInteiroBalanco.intValue() > 2) {
					valorInteiroBalanco = valorDecimalBalanco.setScale(0, RoundingMode.HALF_UP);
					
					quantidadeDadosBalanco = valorInteiroBalanco.intValue()+2;
					modificadorDadoBalanco = -1;
				}else {
					modificadorDadoBalanco = -1;
				}	
			}else if(decimaisDoubleBalanco == 0.125 || decimaisDoubleBalanco == 0.25) {
				if(valorInteiroBalanco.intValue() > 2) {
					valorInteiroBalanco = valorDecimalBalanco.setScale(0, RoundingMode.HALF_UP);
					quantidadeDadosBalanco = valorInteiroBalanco.intValue()+2;
					modificadorDadoBalanco = 0;
				}else {
					modificadorDadoBalanco = 0;
				}	
			}else if(decimaisDoubleBalanco == 0.375) {
				if(valorInteiroBalanco.intValue() > 2) {
					valorInteiroBalanco = valorDecimalBalanco.setScale(0, RoundingMode.HALF_UP);
					quantidadeDadosBalanco = valorInteiroBalanco.intValue()+2;
					modificadorDadoBalanco = 1;
				}else {
					modificadorDadoBalanco = 1;
				}
			}else if(decimaisDoubleBalanco == 0.5) {
					if(valorInteiroBalanco.intValue() > 2) {
						valorInteiroBalanco = valorDecimalBalanco.setScale(0, RoundingMode.HALF_UP);
						quantidadeDadosBalanco = valorInteiroBalanco.intValue()+1;
						modificadorDadoBalanco = 1;
					}else {
						modificadorDadoBalanco = 1;
					}		
			}else {
				valorDecimalBalanco = BigDecimal.valueOf(forcaAcerto).divide(new BigDecimal(8));
				valorInteiroBalanco = valorDecimalBalanco.setScale(0, RoundingMode.DOWN);
				
				decimaisBalanco = valorDecimalBalanco.subtract(valorInteiroBalanco);
				decimaisDoubleBalanco = decimaisBalanco.doubleValue();
				
				if(valorInteiroBalanco.intValue() > 2) {
					valorInteiroBalanco = valorDecimalBalanco.setScale(0, RoundingMode.HALF_UP);
					quantidadeDadosBalanco = valorInteiroBalanco.intValue()+1;
					modificadorDadoBalanco = 2;
				}else {
					modificadorDadoBalanco = 2;
				}
				
			}
	}
	if(forcaAcerto> 40) {
		//Setando Força Balanço depois do 40
				if(forcaAcerto> 40) {
					if(forcaAcerto>40 && forcaAcerto<45) {
						quantidadeDadosBalanco = 7;
						modificadorDadoBalanco = -1;
					}
					if(forcaAcerto>44 && forcaAcerto<50) {
						quantidadeDadosBalanco = 7;
						modificadorDadoBalanco = 1;
					}
					if(forcaAcerto>49 && forcaAcerto<55) {
						quantidadeDadosBalanco = 8;
						modificadorDadoBalanco = -1;
					}
					if(forcaAcerto>54 && forcaAcerto<60) {
						quantidadeDadosBalanco = 8;
						modificadorDadoBalanco = 1;
					}
					if(forcaAcerto>59 && forcaAcerto<65) {
						quantidadeDadosBalanco = 9;
					}
					if(forcaAcerto>64 && forcaAcerto<70) {
						quantidadeDadosBalanco = 9;
						modificadorDadoBalanco = 2;
					}
					if(forcaAcerto>69 && forcaAcerto<75) {
						quantidadeDadosBalanco = 10;
					}
					if(forcaAcerto>74 && forcaAcerto<80) {
						quantidadeDadosBalanco = 10;
						modificadorDadoBalanco = 2;
					}
					if(forcaAcerto>79 && forcaAcerto<85) {
						quantidadeDadosBalanco = 11;
					}
					if(forcaAcerto>84 && forcaAcerto<90) {
						quantidadeDadosBalanco = 11;
						modificadorDadoBalanco = 2;
					}
					if(forcaAcerto>89 && forcaAcerto<95) {
						quantidadeDadosBalanco = 12;
					}
					if(forcaAcerto>94 && forcaAcerto<100) {
						quantidadeDadosBalanco = 12;
						modificadorDadoBalanco = 2;
					}
					
					//setando a força Balanço depois de 100
					if(forcaAcerto>99) {
							quantidadeDadosBalanco = 13;
							
							nivelForca = (forcaAcerto/10)-10;
							
							quantidadeDadosBalanco = nivelForca + quantidadeDadosBalanco;
					}
				}
	}
}	
	public void setarDanoEstocada() {
		int cont = 0;
		int primo = 0;
		
		
		//setando a força estocada até 9
		
		if(forcaAcerto > 0 && forcaAcerto<9) {
				for(int i=3;i<=forcaAcerto;i++) {
					for(int j=1;j<=i;j++) {
						if(i%j == 0) {
							cont++;
							}
					}
					if(cont == 2) {
						primo++;
						cont=0;
					}else {
						cont=0;
					}
				}
			modificadorDadoEstocada = modificadorDadoEstocada + primo;	
		
			//setando a força estocada até 40
			
		}else if (forcaAcerto>8 && forcaAcerto<41) {
			Integer nivelForcaEstocada;
			Integer numeroDados;		
			
			modificadorDadoEstocada = -2;
		
			BigDecimal valorDecimalEstocada;
			BigDecimal valorInteiroEstocada;
			BigDecimal decimaisEstocada;
			double decimaisDoubleEstocada;
			
			valorDecimalEstocada = BigDecimal.valueOf(forcaAcerto).divide(new BigDecimal(2));
			valorInteiroEstocada = valorDecimalEstocada.setScale(0, RoundingMode.DOWN);
			decimaisEstocada = valorDecimalEstocada.subtract(valorInteiroEstocada);
			decimaisDoubleEstocada = decimaisEstocada.doubleValue();
			
			if(decimaisDoubleEstocada == 0.5) {
				nivelForcaEstocada = (int)(forcaAcerto - 8)/2;
				for(int i=0; i<nivelForcaEstocada; i++) {				
						modificadorDadoEstocada++;
				}
			}else {
				nivelForcaEstocada = (forcaAcerto - 9)/2;
				for(int i=0; i<nivelForcaEstocada; i++) {
						modificadorDadoEstocada++;
					
				}
			}
			for (int i = 0;i<=modificadorDadoEstocada; i++) {
				if(modificadorDadoEstocada > 2) {
				
					modificadorDadoEstocada = modificadorDadoEstocada - 4;
					quantidadeDadosEstocada++;
				}
			}

		}
		
		//Setando Força Estocada depois do 40
		if(forcaAcerto> 40) {
			if(forcaAcerto>40 && forcaAcerto<45) {
				quantidadeDadosEstocada = 4;
				modificadorDadoEstocada = 1;
			}
			if(forcaAcerto>44 && forcaAcerto<50) {
				quantidadeDadosEstocada = 5;
			}
			if(forcaAcerto>49 && forcaAcerto<55) {
				quantidadeDadosEstocada = 5;
				modificadorDadoEstocada = 2;
			}
			if(forcaAcerto>54 && forcaAcerto<60) {
				quantidadeDadosEstocada = 6;
			}
			if(forcaAcerto>59 && forcaAcerto<65) {
				quantidadeDadosEstocada = 7;
				modificadorDadoEstocada = -1;
			}
			if(forcaAcerto>64 && forcaAcerto<70) {
				quantidadeDadosEstocada = 7;
				modificadorDadoEstocada = 1;
			}
			if(forcaAcerto>69 && forcaAcerto<75) {
				quantidadeDadosEstocada = 8;
			}
			if(forcaAcerto>74 && forcaAcerto<80) {
				quantidadeDadosEstocada = 8;
				modificadorDadoEstocada = 2;
			}
			if(forcaAcerto>79 && forcaAcerto<85) {
				quantidadeDadosEstocada = 9;
			}
			if(forcaAcerto>84 && forcaAcerto<90) {
				quantidadeDadosEstocada = 9;
				modificadorDadoEstocada = 2;
			}
			if(forcaAcerto>89 && forcaAcerto<95) {
				quantidadeDadosEstocada = 10;
			}
			if(forcaAcerto>94 && forcaAcerto<100) {
				quantidadeDadosEstocada = 10;
				modificadorDadoEstocada = 2;
			}
			
			//setando a força depois de 100
			if(forcaAcerto>99) {
					quantidadeDadosEstocada = 11;
					
					nivelForca = (forcaAcerto/10)-10;
					
					quantidadeDadosEstocada = nivelForca + quantidadeDadosEstocada;
			}
		}
	}


	public Atributos getAtributos() {
		return atributos;
	}


	public void setAtributos(Atributos atributos) {
		this.atributos = atributos;
	}


	public Integer getForcaAcerto() {
		return forcaAcerto;
	}


	public void setForcaAcerto(Integer forcaAcerto) {
		this.forcaAcerto = forcaAcerto;
	}


	public Integer getModificadorForcaAcerto() {
		return modificadorForcaAcerto;
	}


	public void setModificadorForcaAcerto(Integer modificadorForcaAcerto) {
		this.modificadorForcaAcerto = modificadorForcaAcerto;
	}


	public Integer getPontosGastosForcaAcerto() {
		return pontosGastosForcaAcerto;
	}


	public void setPontosGastosForcaAcerto(Integer pontosGastosForcaAcerto) {
		this.pontosGastosForcaAcerto = pontosGastosForcaAcerto;
	}


	public Integer getQuantidadeDadosEstocada() {
		return quantidadeDadosEstocada;
	}


	public void setQuantidadeDadosEstocada(Integer quantidadeDadosEstocada) {
		this.quantidadeDadosEstocada = quantidadeDadosEstocada;
	}


	public Integer getModificadorDadoEstocada() {
		return modificadorDadoEstocada;
	}


	public void setModificadorDadoEstocada(Integer modificadorDadoEstocada) {
		this.modificadorDadoEstocada = modificadorDadoEstocada;
	}


	public Integer getQuantidadeDadosBalanco() {
		return quantidadeDadosBalanco;
	}


	public void setQuantidadeDadosBalanco(Integer quantidadeDadosBalanco) {
		this.quantidadeDadosBalanco = quantidadeDadosBalanco;
	}


	public Integer getModificadorDadoBalanco() {
		return modificadorDadoBalanco;
	}


	public void setModificadorDadoBalanco(Integer modificadorDadoBalanco) {
		this.modificadorDadoBalanco = modificadorDadoBalanco;
	}


	public int getCinco() {
		return cinco;
	}
	
	
}
