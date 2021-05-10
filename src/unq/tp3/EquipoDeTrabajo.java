package unq.tp3;

import java.util.ArrayList;

public class EquipoDeTrabajo {
	//Atributos
	private String nombre;
	private ArrayList<Persona> integrantes;
	//Constructor
	public EquipoDeTrabajo(String nombre, ArrayList<Persona> integrantes) {
		this.setNombre(nombre);
		this.integrantes = integrantes;
	}
	//Gets y sets
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setIntegrantes(ArrayList<Persona> integrantes) {
		this.integrantes = integrantes;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public ArrayList<Persona> getIntegrantes() {
		return integrantes;
	}
	//Metodos
	public int edadPromedio() {
		int edad = 0;
		int contador = 0;
		for (Persona persona : this.integrantes) {
			edad += persona.calcularEdad();
			contador = contador + 1;
			}
		return (edad / contador);
	}
}