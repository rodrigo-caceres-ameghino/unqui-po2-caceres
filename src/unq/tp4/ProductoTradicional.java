package unq.tp4;

public class ProductoTradicional extends Producto{

	public ProductoTradicional(String nombre, double precio, int stock) {
		super(nombre, precio, stock);
	}
	public double getPrecio() {
		return precio;
	}
}
