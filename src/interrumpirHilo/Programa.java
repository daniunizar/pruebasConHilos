package interrumpirHilo;

public class Programa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Hilo hilo01 = new Hilo();
		
		hilo01.start();
		
		Thread.sleep(3000);
		
		hilo01.interrupt();
	}

}
