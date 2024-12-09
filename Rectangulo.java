package tiposClases;
import daw.com.*;

public class Rectangulo {

	private double ancho;
	private int Punto centro;
	private double largo;
	private int color;
	
	public Rectangulo() {
		
		this.centro=new Punto(0,0);
		this.ancho=1.0;
		this.largo=1.0;

	}
	
	public Rectangulo(Punto centro,double ancho, double largo) {
		
		this.centro=new Punto(centro.getX(), centro.getY());
		this.ancho=ancho;
		this.largo=largo;
	}
	
	public Punto getCentro() {
		
		return new Punto(centro);
	}
	
	public void setCentro(Punto centro) {
		this.centro=new Punto(centro);
	}

	public void mostrarDatos() {
		System.out.println("El centro es " + centro);
		System.out.println("El ancho es " + ancho);
		System.out.println("El largo es " + largo);
	}
	
	public void cambiarDatos() {
		int nuevo=Teclado.leerInt("Introduzca los datos: ");
		String [] array=
		
	}
}
