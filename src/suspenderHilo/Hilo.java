package suspenderHilo;

public class Hilo extends Thread{

	//ATRIBUTOS
	private boolean suspendido;
	//MÉTODOS
	public synchronized void suspender() {
		System.out.println("Suspendiendo el hilo");
		suspendido = true;
	}
	
	public synchronized void reanudar() {
		System.out.println("Reanudando el hilo");
		suspendido = false;
		notifyAll();
	}
	
	public synchronized void enSuspension() {
		while(suspendido) {
			try {
				wait();
				System.out.println("ZzzzZzzzzzzzzZZzZ");
				} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				interrupt();
			}
		}
	}
	
	public void run() {
		while (!isInterrupted()) {
			
			enSuspension();
			
			try {
				sleep(500);
				System.out.println("Hola, soy un hilo activo");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				interrupt();
			}
			
		}
		System.out.println("El hilo ha muerto");
	}
}
