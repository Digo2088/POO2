
public class SimuladorSemafaro {
	public static void main (String[] args) {
		
		ThreadSemafaro semafaro = new ThreadSemafaro();
		
		for (int i=0 ; i<6 ; i++) {
			System.out.println(semafaro.getCor());
			semafaro.esperarCorMudar();
		}
		semafaro.desligarSemafaro();
	}
}
