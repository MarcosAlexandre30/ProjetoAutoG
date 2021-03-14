package personagem;


public class Personagem {
	private Integer id;
	private Atributos atributos;
	private BackGround background;
	private Carga carga;
	private DadosPersonagem dadosPg;
	private Percepcao per;
	private Pontuacao pontuacao;
	private Riqueza riqueza;
	private TesteUKID testesIKInD;
	private Velocidade velocidade;
	private Vontade vontade;
	
	public Personagem() {
		id = 0;
		atributos = new Atributos();
		background = new BackGround();
		carga = new Carga();
		dadosPg = new DadosPersonagem();
		per = new Percepcao();
		pontuacao = new Pontuacao();
		riqueza = new Riqueza();
		testesIKInD = new TesteUKID();
		velocidade = new Velocidade();
		vontade = new Vontade();
	}
	
	
}
