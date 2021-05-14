package unq.tp4;

public abstract class Producto implements Registrable{
	//Atributos
	public String nombre;
	public Double precio;
	public int stock;
	//Constructor
	public Producto(String nombre, double precio, int stock) {
		this.setNombre(nombre);
		this.setPrecio(precio);
		this.setStock(stock);
	}
	//Gets y sets
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getNombre() {
		return nombre;
	}
	
	public double getPrecio() {
		return precio;
	}

	public int getStock() {
		return stock;
	}
	
	public void decrementarStock(int unNumero) {
		this.setStock(this.getStock() - unNumero);
	}
	
	public double registrarse(){
		this.decrementarStock(1);
		return (this.getPrecio());
	}
	
}
