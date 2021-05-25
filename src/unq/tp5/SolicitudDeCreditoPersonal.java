package unq.tp5;

public class SolicitudDeCreditoPersonal extends SolicitudDeCredito{

	public SolicitudDeCreditoPersonal(double monto, int plazo, Cliente cliente) {
		super(monto, plazo, cliente);
	}

	public Boolean elIngresoAnualEsMayorA15000 () {
		return ((this.getCliente()).getSueldoNetoAnual() > 15000);
	}
	
	public Boolean elMontoDeLaCuataNoSupera70 () {
		double sueldoMensual = (this.getCliente()).getSueldoNetoMensual();
		return (sueldoMensual > 70%sueldoMensual);
	}
	@Override
	public Boolean esAceptable() {
		return (this.elIngresoAnualEsMayorA15000() && this.elMontoDeLaCuataNoSupera70());
	}


}
