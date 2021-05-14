package unq.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaRegistradoraTestCase {
	public CajaRegistradora caja;
	//SetUp
	@BeforeEach
	void setUp() throws Exception {
		caja = new CajaRegistradora();
	}
	//Test
	@Test
	void unaCajaPuedeRegistrarUnProductoParaPagar() {
		Registrable producto1 = new ProductoTradicional("queso",100, 10);
		Registrable producto2 = new ProductoDeCoperativa("papa",80, 10);
		caja.registrar(producto1);
		caja.registrar(producto2);
		assertEquals(172, caja.getMontoTotal());
	}
}
