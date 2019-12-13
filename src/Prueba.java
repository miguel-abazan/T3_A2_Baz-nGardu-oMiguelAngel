import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Pelicula{
	private String titulo;
	private	String genero;
	public Pelicula() {
	}
	public Pelicula(String titulo, String genero) {
		this.titulo = titulo;
		this.genero = genero;
	}//constructor
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}//GETTERS AND SETTERS	
	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", genero=" + genero + "]";
	}	
}//class Pelicula

interface RentaPeliculas{
	public void cima();
	 public boolean insertarElementos();
	 public boolean eliminar_Elemento();
	 public boolean vaciar_Pila();
	 public boolean verificar_pila_llena();
	 public boolean verificar_pila_vacia();
	 
	public boolean mostrar_CIMA();
	public boolean mostrarCantidadElementos();
	public String titulo (Pelicula r);
	public String genero (Pelicula r);	
}//INTERFACE 

class ImplementacionFilaEstatica implements RentaPeliculas{

	private Pelicula [][] registroDatos = new Pelicula[1][1]; 
	private int nums[][];
	private int cima;
	
	public void PilaEstatica(int tam) {
		nums = new int [tam][tam];
		cima = -1;
	}

	@Override
	public void cima() {
		cima = -1;
	}
	@Override
	public String titulo(Pelicula r) {
		return r.getTitulo();
	}
	@Override
	public String genero(Pelicula r) {
		return r.getGenero();
	}

	@Override
	public boolean insertarElementos() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminar_Elemento() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean vaciar_Pila() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean verificar_pila_llena() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean verificar_pila_vacia() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mostrar_CIMA() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mostrarCantidadElementos() {
		// TODO Auto-generated method stub
		return false;
	}
	
}//Class ImplementacionFilaEstatica

class ImplementacionPilaDinamica extends ImplementacionFilaEstatica {
	Queue<Pelicula> registroDatos = new LinkedList<Pelicula>();	
}


public class Prueba {

	public static void main(String[] args) {
	
		
		ImplementacionFilaEstatica ifl = new ImplementacionFilaEstatica();
		Scanner e = new Scanner(System.in);
		boolean r = true;
		byte opc = 0;
		System.out.println("Eliga una Opción \n1)Cargar BD de Peliculas\n2)Rentar Pelicula\n3)DevolverPelicula\n4)Mostrar Cantidad de Peliculas Disponible");
		opc = e.nextByte();
		
		switch (opc) {
		case 1:
			System.out.println("Peliculas Disponibles: " +10);
			ifl.PilaEstatica(10);
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		default: System.out.println("NO está en la LISTA.");
			break;
		}//switch
	}//main
}//class