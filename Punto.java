package Errores;
import daw.com.Pantalla;
import daw.com.Teclado;


public class Punto {
	private int x;
	private int y;
	
	//NO TIENE VALOR
	public Punto ()
	{
		x = 0;
		y = 0;
	}
	//TIENE EL VALOR QUE SE INTRODUZCA
	public Punto (int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	//TIENE EL PRIMER Y SEGUNDO VALOR --> LLAMADA --> new Punto ([0,3]);
	public Punto (int p[])
	{
		this.x = p[0];
		this.y = p[1];
	}
	//TIENE EL VALOR DE LA VARIABLE DEL PRINCIPIO DEL CÓDIGO --> LLAMADA --> new Punto (Punto); --> x=punto.x y=punto.y
	public Punto (Punto punto)
	{
		this.x = punto.x;
		this.y = punto.y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void leerDatos ()
	{
		x = Teclado.leerInt("X :");
		Pantalla.escribirSaltoLinea();
		y = Teclado.leerInt("Y :");
	}

	public void mostrarDatos ()
	{
		Pantalla.escribirString("X :" + x);
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirString("Y :" + y);
	}
	
	/*MÉTODO DE OBJETO*/
	public boolean esIgual (Punto p)
	{
		boolean igual = true;
		
		if (this.x != p.x || this.y != p.y)
			igual = false;
		
		return igual;
	}

}
