package unq.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultioperadorTestCase {
	private Multioperador multioperador;
	//SetUp
	@BeforeEach
    public void setUp() throws Exception {
	multioperador = new Multioperador();
	multioperador.agregarNumero(10);
	multioperador.agregarNumero(5);
	multioperador.agregarNumero(10);
	multioperador.agregarNumero(5);	
	}	
	//Test Sumar
	@Test
	public void testSumar() { 
		int resultadoDeSuma = multioperador.sumar();	
		assertEquals(resultadoDeSuma, 30);
	   }
	@Test
	public void testRestar() { 
		int resultadoDeResta = multioperador.restar();	
		assertEquals(resultadoDeResta, -30);
	   }
	@Test
	public void testMultiplicar() { 
		int resultadoDeMultiplicacion = multioperador.multiplicar();	
		assertEquals(resultadoDeMultiplicacion, 2500);
	   }
}
