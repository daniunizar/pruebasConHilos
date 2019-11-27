package hiloConNombre;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hilo hilo01 = new Hilo("Pikachu");
		hilo01.start();
		System.out.println("Hemos creado el hilo " + hilo01.getName());
	}

}
