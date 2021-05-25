package unq.tp4;

public abstract class Factura implements Registrable {
	//Atributos
	double montoAPagar;
	Agencia agencia;
	
	//metodo
	public double montoAPagar(){
		return this.montoAPagar;
	}
		 
	public abstract double registrarse();
}
