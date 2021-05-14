package unq.tp4;

public class ProductoDeCoperativa extends Producto{
	public ProductoDeCoperativa(String nombre ,double precio ,int stock) {
		super(nombre,precio,stock);
	}
	public double getPrecio() {
		double descuento = (this.precio / 100) * 10;
		return (this.precio - descuento);
	}
}
