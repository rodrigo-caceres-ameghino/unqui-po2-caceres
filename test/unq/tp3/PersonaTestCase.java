package unq.tp3;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class personaTest {
	private Persona pepe;
	private Persona pedro;
	//SetUp
	@BeforeEach
	public void setUp() throws Exception {
		pepe = new Persona("Pepe", LocalDate.parse("1999-12-31"));
	   	pedro = new Persona("Pedro", LocalDate.parse("1998-12-31"));
	}
	//Test
	@Test
	public void testEdad() {
		int edadDePepe = pepe.calcularEdad();
		assertEquals(21, edadDePepe);
	}
	
	@Test
	public void testDiferenciaDeEdad() {
		assertEquals(true, pedro.menorQue(pepe));
	}

}
