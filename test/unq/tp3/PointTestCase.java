package unq.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PointTestCase {
	private Point punto1;
	private Point punto2;
	//SetUp
	@BeforeEach
	public void setUp() throws Exception {
		punto1 = new Point();
		punto2 = new Point(10,10);	
	}
	//Test
	@Test
	public void testCreacion() {
		float valorX = punto1.getX();
		float valorY = punto1.getY();
		assertEquals(valorX, 0);
		assertEquals(valorY, 0);
	}
	@Test
	public void testCreacion2() {
		float valorX = punto2.getX();
		float valorY = punto2.getY();
		assertEquals(valorX, 10);
		assertEquals(valorY, 10);
	}
	@Test
	public void testMover() {
		punto2.moverA(20, 20);
		float valorX = punto2.getX();
		float valorY = punto2.getY();
		assertEquals(valorX, 20);
		assertEquals(valorY, 20);
	}
	@Test
	public void sumarOtroPunto() {
		Point nuevoPunto = punto1.sumarPuntos(punto2);
		float valorX = nuevoPunto.getX();
		float valorY = nuevoPunto.getY();
		assertEquals(valorX, 10);
		assertEquals(valorY, 10);
	}
}
