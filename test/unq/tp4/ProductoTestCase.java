package unq.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoTestCase {
	public ProductoTradicional productoTradicional;
	public ProductoDeCoperativa productoCoperativa;
	//SetUp
	@BeforeEach
	void setUp() throws Exception {
		productoTradicional = new ProductoTradicional("Lata de tomate", 50.0, 10);
		productoCoperativa = new ProductoDeCoperativa("Lata de lentejas", 30.0, 5);
	}
	//Test
	@Test
	void testDecrementarStock() {
		productoTradicional.decrementarStock(3);
		productoCoperativa.decrementarStock(2);
		assertEquals(productoTradicional.getStock(), 7);
		assertEquals(productoCoperativa.getStock(), 3);
	}

	@Test
	void testRegistrarse() {
		double precioFinal1 = productoTradicional.registrarse();
		double precioFinal2 = productoCoperativa.registrarse();
		assertEquals(precioFinal1, 50.0);
		assertEquals(precioFinal2, 27.0);
		assertEquals(productoTradicional.getStock(), 9);
		assertEquals(productoCoperativa.getStock(), 4);
	}
}
