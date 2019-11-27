package hiloConNombre;

public class Hilo extends Thread{
	
	//ATRIBUTOS
	
	//MÉTODOS
	public Hilo (String nombre) {
		super(nombre);
	}
	
	public void run() {
		//el código del hilo
		System.out.println("Hola, soy el hilo "+getName());
	}
}
