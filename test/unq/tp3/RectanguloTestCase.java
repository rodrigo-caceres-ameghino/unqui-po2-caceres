package unq.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RectanguloTestCase {
	private Rectangulo rectangulo1;
	private Rectangulo rectangulo2;
	private Point puntoDeInicio;
	//SetUp
	@BeforeEach
	public void setUp() throws Exception {
		rectangulo1 = new Rectangulo(puntoDeInicio, 10, 20);
		rectangulo2 = new Rectangulo(puntoDeInicio, 20, 10);	
	}
	//Test
	@Test
	public void testCreacion() {
		Point puntoDeInicion = rectangulo1.getPuntoDeInicio();
		int alto = rectangulo1.getAlto(); 
		int largo = rectangulo1.getLargo();
		assertEquals(puntoDeInicion, this.puntoDeInicio);
		assertEquals(alto, 10);
		assertEquals(largo, 20);
	}

	@Test
	public void testArea() {
		float area = rectangulo1.area();
		assertEquals(area, 200);
	}

	@Test
	public void testDeVertical() {
		assertEquals(rectangulo1.esVertical(), false);
		assertEquals(rectangulo2.esVertical(), true);
	}
	
	@Test
	public void testDeHorizontal() {
		assertEquals(rectangulo1.esHorizontal(), true);
		assertEquals(rectangulo2.esHorizontal(), false);
	}
}
