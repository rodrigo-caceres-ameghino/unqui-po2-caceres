package unq.tp5;

public class SolicitudDeCreditoHipotecario extends SolicitudDeCredito{
	private Propiedad garantia;
	
	public SolicitudDeCreditoHipotecario(double monto, int plazo, Cliente cliente) {
		super(monto, plazo, cliente);
	}
	public Propiedad getgarantia() {
		return garantia;
	}

	public void setgarantia(Propiedad propiedad) {
		this.garantia = propiedad;
	}
	public Boolean elMontoNoSuperaEl50() {
		double sueldoMensual = (this.getCliente()).getSueldoNetoMensual();
		return (this.getMonto() < 50%sueldoMensual);
	}
	public Boolean elMontoTotalNoEsMayorAl70DeLaGarantia() {
		double valorFiscal = (this.garantia).getValorFiscal();
		return (this.getMonto() < 70%valorFiscal);
		
	}
	public Boolean elClienteNoSuperaraLos65AntesDeTerminarDePagar() {
		int edadDelCliente = (this.getCliente()).getEdad();
		int edadDelClienteCuandoTerminaElPago = edadDelCliente;
		return (edadDelClienteCuandoTerminaElPago < 65);
	}
	
	@Override
	public Boolean esAceptable() {
		return (elMontoNoSuperaEl50() && 
				elMontoTotalNoEsMayorAl70DeLaGarantia() && 
				elClienteNoSuperaraLos65AntesDeTerminarDePagar()
				);
	}

}
