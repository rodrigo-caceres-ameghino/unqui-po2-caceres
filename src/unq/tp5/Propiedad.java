package unq.tp5;

public class Propiedad {

	String descripcion;
	String direccion;
	double valorFiscal;
		
	//constructor
	public Propiedad(String descripcion, String direccion, double valorFiscal) {
		this.setDescripcion(descripcion);
		this.setDireccion(direccion);
		this.setValorFiscal(valorFiscal);
	}
		
	public double valorFiscal() {
		return this.getValorFiscal();
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public double getValorFiscal() {
		return valorFiscal;
	}

	public void setValorFiscal(double valorFiscal) {
		this.valorFiscal = valorFiscal;
	}	
}
