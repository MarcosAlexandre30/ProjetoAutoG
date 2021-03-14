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
	
	public Dano() {
		atributos = new Atributos();
		forcaAcerto = atributos.getForca();
		modificadorForcaAcerto = 0;
		pontosGastosForcaAcerto = 0;
		quantidadeDadosEstocada = 1;
		quantidadeDadosBalanco = 1;
		modificadorDadoEstocada = -6;
		modificadorDadoBalanco = -5;
	}
	
	public void setarDano() {
		int cont = 0;
		int primo = 0;
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
			modificadorDadoEstocada = modificadorDadoEstocada + primo;	
		
		}else if (forcaAcerto>8 && forcaAcerto<41) {
			Integer nivelForcaBalanco;
			Integer nivelForcaEstocada;
			Integer numeroDados;
			
			
			modificadorDadoEstocada = -2;
			
			BigDecimal valorDecimalBalanco;
			BigDecimal valorInteiroBalanco;
			BigDecimal decimaisBalanco;
			double decimaisDoubleBalanco;
			
			BigDecimal valorDecimalEstocada;
			BigDecimal valorInteiroEstocada;
			BigDecimal decimaisEstocada;
			double decimaisDoubleEstocada;
			
			valorDecimalBalanco = BigDecimal.valueOf(forcaAcerto).divide(new BigDecimal(4));
			valorInteiroBalanco = valorDecimalBalanco.setScale(0, RoundingMode.DOWN);
			decimaisBalanco = valorDecimalBalanco.subtract(valorInteiroBalanco);
			decimaisDoubleBalanco = decimaisBalanco.doubleValue();
			
			valorDecimalEstocada = BigDecimal.valueOf(forcaAcerto).divide(new BigDecimal(2));
			valorInteiroEstocada = valorDecimalEstocada.setScale(0, RoundingMode.DOWN);
			decimaisEstocada = valorDecimalEstocada.subtract(valorInteiroEstocada);
			decimaisDoubleEstocada = decimaisEstocada.doubleValue();
			
			if(decimaisDoubleBalanco == 0.25) {
				//toda a vez que cair nesse checar o inteiro e determinar a quantidade de dados
				modificadorDadoBalanco = -1;
			}else if(decimaisDoubleBalanco == 0.5) {
				modificadorDadoBalanco = -0;
			}else if(decimaisDoubleBalanco == 0.75) {
				modificadorDadoBalanco = 1;
			}else {
				modificadorDadoBalanco = 2;
			}
			if(decimaisDoubleEstocada == 0.5) {
				nivelForcaEstocada = (int)(forcaAcerto - 8)/2;
				System.out.println("nivelForcaEstocada:"+nivelForcaEstocada);
				for(int i=0; i<nivelForcaEstocada; i++) {				
						modificadorDadoEstocada++;
						System.out.println("modificador dado estocada:"+modificadorDadoEstocada);
				}
			}else {
				nivelForcaEstocada = (forcaAcerto - 9)/2;
				for(int i=0; i<nivelForcaEstocada; i++) {
						modificadorDadoEstocada++;
					
				}
			}
			if(modificadorDadoEstocada > 2) {
				for (int i = 1;i<=modificadorDadoEstocada; i++) {
					modificadorDadoEstocada = modificadorDadoEstocada - 4;
					quantidadeDadosEstocada++;
				}
			}
			System.out.println("modificador estocada:"+modificadorDadoEstocada);
			System.out.println("dados estocada:"+quantidadeDadosEstocada);

		}
		
	}

}
