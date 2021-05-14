package unq.tp4;

public class CajaRegistradora {
	//Atributos
	double montoTotal;
	//Constructor
	public CajaRegistradora() {
		this.setMontoTotal(0.0);
	}
	//Gets y sets
	public void setMontoTotal(double monto) {
		this.montoTotal = monto;
	}
	public double getMontoTotal () {
		return montoTotal;
	}
	//Metodos
	public void registrar(Registrable productoRegistrable) {
		this.montoTotal += productoRegistrable.registrarse();
	}
}
