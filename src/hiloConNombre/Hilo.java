package hiloConNombre;

public class Hilo extends Thread{
	
	//ATRIBUTOS
	
	//M�TODOS
	public Hilo (String nombre) {
		super(nombre);
	}
	
	public void run() {
		//el c�digo del hilo
		System.out.println("Hola, soy el hilo "+getName());
	}
}
