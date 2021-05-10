package unq.tp3;

public class Point {
	//Atributos
	private float X = 0;
	private float Y = 0;
	//Constructor
	public Point(float x, float y){
		this.setX(x);
		this.setY(y);
	}
	 
	public Point() {
		this.setX(0);
		this.setY(0);
	}
	//Gets y sets
	public float getX(){	
		return this.X;
	}
	
	public float getY(){	
		return this.Y;
	}
	
	public void setX(float valorX) {
		this.X = valorX;
	}

	public void setY(float valorY) {
		this.Y = valorY;
	}
	//Metodos
	public void moverA(float x, float y) {	
		this.setX(x);
		this.setY(y);
	}

	public Point sumarPuntos(Point punto) {
		Point resultadoDelPunto;
		float valorX = punto.getX() + getX();
		float valorY = punto.getX() + getY();	
		resultadoDelPunto = new Point(valorX,valorY);
		return resultadoDelPunto;	
	}	
}
