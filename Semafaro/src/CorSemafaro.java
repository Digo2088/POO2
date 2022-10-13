
public enum CorSemafaro {

	VERDE(10000), AMARELO(300), VERMELHO(20000);

	private int tempoEspera;

	CorSemafaro(int tempoEspera){
		this.tempoEspera = tempoEspera;
	}

	public int getTempoEspera(){
		return tempoEspera;
	}
}
