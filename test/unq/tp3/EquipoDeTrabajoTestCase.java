package unq.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EquipoDeTrabajoTestCase {
	private EquipoDeTrabajo equipo1;
	private Persona juan;
	private Persona pepe;
	private Persona mati;
	private Persona ramiro;
	private Persona lautaro;
	//SetUp
	@BeforeEach
    public void setUp() throws Exception {
		juan = new Persona("Juan", LocalDate.parse("1999-12-31"));
		pepe = new Persona("Pepe", LocalDate.parse("1998-12-31"));
	   	mati = new Persona("Mati", LocalDate.parse("1989-12-31"));
	   	ramiro = new Persona("Ramiro", LocalDate.parse("1995-12-31"));
	   	lautaro = new Persona("Lautaro", LocalDate.parse("1991-12-31"));
	   	ArrayList<Persona> pibes = new ArrayList<Persona>();
	   	pibes.add(juan);
	   	pibes.add(pepe);
	   	pibes.add(mati);
	   	pibes.add(ramiro);
	   	pibes.add(lautaro);
	   	
	   	equipo1 = new EquipoDeTrabajo("Equipo1", pibes);
	}
	@Test
	 public void testConocerIntegrante() {
		int edad = pepe.calcularEdad(); 
		 assertEquals(23,edad);
	 }
	 
	@Test
	 public void test02() {
		int resultado = 
				(juan.calcularEdad() + 
				 pepe.calcularEdad() + 
				 mati.calcularEdad() +
				 ramiro.calcularEdad() +
				 lautaro.calcularEdad()) / 5;
		 assertEquals(resultado, equipo1.edadPromedio());
	 }
}
