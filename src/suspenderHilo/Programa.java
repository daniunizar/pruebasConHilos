package suspenderHilo;

public class Programa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Hilo hilo01 = new Hilo();
		hilo01.start();
		
		Thread.sleep(2000);
		
		hilo01.suspender();
		
		Thread.sleep(2000);
		
		hilo01.reanudar();
		
		Thread.sleep(2000);
		
		hilo01.suspender();
		
		Thread.sleep(2000);
		
		hilo01.reanudar();
		
		Thread.sleep(2000);
		
		hilo01.interrupt();
	}

}
