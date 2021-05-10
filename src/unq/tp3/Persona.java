package unq.tp3;

import java.time.LocalDate;

public class Persona {
	//Atributos 
	private String nombre;
	private LocalDate fechaDeNacimiento;
	//Constructor
	public Persona(String nombre, LocalDate fechaDeNacimiento) {
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	//Gets y sets
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	
	public String getNombre() {
		return nombre;
	}
	//Metodos
	public int calcularEdad() {		
	  LocalDate hoy = LocalDate.now();   
	  int edad = hoy.getYear() - this.getFechaDeNacimiento().getYear();
	  return edad;
	}

	public boolean menorQue(Persona persona) {
		return ( this.calcularEdad() < persona.calcularEdad() );
	}
}