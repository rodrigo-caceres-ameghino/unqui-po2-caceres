package unq.tp4;

public class Servicio extends Factura implements Agencia{
	//Atributos
	double costoUnidad;
	int cantUnidadesConsumidas;
	Agencia agencia;
	//constructor
	public Servicio(Agencia a,double cUnidad, int cant) {
		this.setCantUnidadesConsumidas(cant);
		this.setCostoUnidad(cUnidad);
	}
	//Gets y sets
	public double getCostoUnidad() {
		return costoUnidad;
	}

	public void setCostoUnidad(double costoUnidad) {
		this.costoUnidad = costoUnidad;
	}

	public int getCantUnidadesConsumidas() {
		return cantUnidadesConsumidas;
	}

	public void setCantUnidadesConsumidas(int cantUnidadesConsumidas) {
		this.cantUnidadesConsumidas = cantUnidadesConsumidas;
	}
	//Metodos 
	public double montoAPagar(){
		return (this.cantUnidadesConsumidas * this.costoUnidad);
	}
	
	public void registrarPago(Factura factura) {
		factura.registrarse();
	}

	@Override
	public double registrarse() {
		this.agencia.registrarPago(this);
		return this.montoAPagar();
	}
}