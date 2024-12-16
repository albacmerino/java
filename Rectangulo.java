package Errores;
import daw.com.Pantalla;
import daw.com.Teclado;
import java.util.Scanner;

public class Rectangulo {

	private static Scanner tecla = new Scanner(System.in);
	
	private int color;
	private Punto centro;
	private double base;
	private double altura;
	
	public Rectangulo() {
		this.color = 0;
		this.base = 0.0;
		this.altura = 0.0;
		this.centro = new Punto();
	}	
	
	public Rectangulo(int color, Punto centro, double base, double altura) {
		this.color = color;
		this.centro = centro;
		this.base = base;
		this.altura = altura;
	}

	public Rectangulo(Rectangulo r) {
		this.color = r.color;
		this.base = r.base;
		this.altura = r.altura;
		this.centro = new Punto(r.centro);
	}


	public void mostrarDatos() {
		Pantalla.escribirString("Base del rectángulo: ", String.valueOf(base));
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirString("Altura del rectángulo: ", String.valueOf(altura));
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirString("Color del rectángulo: ", String.valueOf(color));
		Pantalla.escribirSaltoLinea();		
		Pantalla.escribirString("");
		centro.mostrarDatos();
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirSaltoLinea();
	}
	
	/*
	 * Código duplicado
	 * Control de errores
	 * No usa métodos, los redefine
	 * No se ha leído la documentación de Teclado
	 * 
	 * Crear funciones para evitar código duplicado
	 * Modificar leerDatos() para cumplir especificaciones
	 * Usar los métodos adecuados para cada tipo
	 * Buscar un método para realizar conversiones seguras
	 */
	
	
	public void cambiarDatos() {
		
		
			do {
				
				Pantalla.escribirString("Indica el nuevo valor de la altura: ");
				String alturaNueva = tecla.next();
				
				if (!alturaNueva.isEmpty()) {
				
					try {
						this.altura = Double.parseDouble(alturaNueva);
					} catch (NumberFormatException e) {
						this.altura = -1;
					}
				}
			} while (this.altura < 0.0);
			

			do {
				Pantalla.escribirString("Indica el nuevo valor de la base: ");
				String baseNueva = tecla.next();
				
				if (!baseNueva.isEmpty()) {
					
					try {
						this.base = Double.parseDouble(baseNueva);
					} catch (NumberFormatException e) {
						this.base = -1;
					}
				}
			} while(this.base < 0.0);
			
			
		/*Pantalla.escribirString("Indica el nuevo valor de la base: ");
		String baseNueva = Teclado.leerString();
		if (!baseNueva.isEmpty()) {
			this.base = Double.valueOf(baseNueva);
		}*/
			boolean validar = true;
			do {
				Pantalla.escribirString("Indica el nuevo valor del color: ");
				int colorNuevo = tecla.nextInt();
						
				if (Integer.valueOf(colorNuevo) != null){
					try {
						this.color = colorNuevo;
						validar = true;
					} catch (NumberFormatException e) {
						this.color = -1;
						validar = false;
					}
				}	
			} while (validar == true);
				
				
		/*Pantalla.escribirString("Indica el nuevo valor del color: ");
		String colorNuevo = Teclado.leerString();
		if (!colorNuevo.isEmpty()) {
			this.color = Integer.valueOf(colorNuevo);
		}*/
				
				do {
					Pantalla.escribirString("Indica el nuevo valor de la X del punto : ");
					int xNueva = tecla.nextInt();
					
					try {
						this.centro.setX(xNueva);
					} catch (NumberFormatException e) {
						this.centro.setX() = -1;
					}
					 
				} while (this.centro.setX < 0);
				
				
		Pantalla.escribirString("Indica el nuevo valor de la X del punto : ");
		String xNueva = Teclado.leerString();
		if (!xNueva.isEmpty())
			this.centro.setX(Integer.valueOf(xNueva));
		Pantalla.escribirString("Indica el nuevo valor de la X del punto : ");
		String yNueva = Teclado.leerString();
		if (!yNueva.isEmpty())
			this.centro.setY(Integer.valueOf(yNueva));

		//Double.isNaN(Double.valueOf(alturaNueva));
		
		
	}
	
	
	
	/**
	 * @return the color
	 */
	public int getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(int color) {
		this.color = color;
	}

	/**
	 * @return the centro
	 */
	public Punto getCentro() {
		return centro;
	}

	/**
	 * @param centro the centro to set
	 */
	public void setCentro(Punto centro) {
		this.centro = centro;
	}

	/**
	 * @return the base
	 */
	public double getBase() {
		return base;
	}

	/**
	 * @param base the base to set
	 */
	public void setBase(double base) {
		this.base = base;
	}

	/**
	 * @return the altura
	 */
	public double getAltura() {
		return altura;
	}

	/**
	 * @param altura the altura to set
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
}
