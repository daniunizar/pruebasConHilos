package interrumpirHilo;

public class Hilo extends Thread{

	public void run(){
		
		while(!interrupted()) {
			try {
				Thread.sleep(5000);
				System.out.println("Hola, soy un hilo activo.");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				interrupt();
			}
			
		}
		System.out.println("El hilo ha muerto");
	}
}



