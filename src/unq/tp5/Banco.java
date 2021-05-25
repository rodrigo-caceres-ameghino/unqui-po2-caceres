package unq.tp5;

import java.util.ArrayList;

public class Banco {
	private ArrayList<Cliente> clientes;
	private ArrayList<SolicitudDeCredito> solicitudes;
	
	public Banco() {
		super();
		this.setClientes(new ArrayList<Cliente>());
		this.setSolicitudes(new ArrayList<SolicitudDeCredito>());
	}
	
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
	public ArrayList<SolicitudDeCredito> getSolicitudes() {
		return solicitudes;
	}
	public void setSolicitudes(ArrayList<SolicitudDeCredito> solicitudes) {
		this.solicitudes = solicitudes;
	}
	
	
}
