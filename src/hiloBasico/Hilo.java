package hiloBasico;

public class Hilo extends Thread{

	//ATRIBUTOS
	int num;
	//M�TODOS
	public Hilo(int num) {
		this.num = num;
	}
	
	
	public void run() {
		for(int i=0; i<num; i++) {
			System.out.println("Hola, soy un hilo, esta es mi " + i + " ejecuci�n.");
		}
	}
}
