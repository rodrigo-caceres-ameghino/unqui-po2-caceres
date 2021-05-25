package unq.tp5;

public abstract class SolicitudDeCredito {
	private double monto;
	private int plazo;
	private Cliente cliente;
	
	public SolicitudDeCredito(double monto, int plazo, Cliente cliente) {
		super();
		this.monto = monto;
		this.plazo = plazo;
		this.cliente = cliente;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public int getPlazo() {
		return plazo;
	}
	public void setPlazo(int plazo) {
		this.plazo = plazo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public abstract Boolean esAceptable();
}
