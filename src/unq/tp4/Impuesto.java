package unq.tp4;

public class Impuesto extends Factura implements Agencia{
	//Atributos
	double tasaDeImpuesto;
	Agencia agencia;
	//Constructor
	public Impuesto(Agencia a,double tasa){
		this.setTasaDeImpuesto(tasa);
		this.agencia = a;
	}
	//Gets y sets
	public double getTasaDeImpuesto() {
		return tasaDeImpuesto;
	}

	public void setTasaDeImpuesto(double tasaDeImpuesto) {
		this.tasaDeImpuesto = tasaDeImpuesto;
	}
	//Metodos 
	public double montoAPagar() {
		return this.tasaDeImpuesto;
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