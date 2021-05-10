package unq.tp3;

public class Rectangulo {
	//Atributos
	private Point puntoDeInicio;
    private int alto;
    private int largo;
    //Constructor
    public Rectangulo(Point punto,int alto,int largo) {
        this.setPuntoDeInicio(punto);
        this.setlargo(largo);
        this.setAlto(alto);
    }
    //Gets y sets
    private void setPuntoDeInicio(Point punto) {
    	puntoDeInicio = punto;
    }

    private void setAlto(int alto2) {
        alto = alto2;
    }

    private void setlargo(int ancho2) {
    	largo = ancho2;
    }
    
    public Point getPuntoDeInicio() {
    	return this.puntoDeInicio;
    }
    
   	public int getLargo() {
    	return this.largo;
    }
    
    public int getAlto() {
    	return this.alto;
    }
    
    //Metodos
    public float area() {
        float area = alto * largo;
        return area;
    }
    
    public float perimetro() {
        float perimetro = (alto * 2)+(largo * 2);
        return perimetro;
    }
    
    public boolean esHorizontal() {
        return alto < largo;
    }
    
    public boolean esVertical() {
        return alto > largo;
    }
}
