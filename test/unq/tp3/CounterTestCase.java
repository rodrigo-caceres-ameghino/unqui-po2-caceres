package unq.tp3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CounterTestCase {    
    private Counter counter;    
    
    /**
     * Crea un escenario de test b�sico, que consiste en un contador 
     * con 10 enteros
     * 
     * @throws Exception
     */
    @BeforeEach
    public void setUp() throws Exception {
 
   	 //Se crea el contador
   	 counter = new Counter();
   	 
   	 //Se agregan los numeros. Un solo par y nueve impares
   	 counter.agregarNumero(1);
   	 counter.agregarNumero(20);
   	 counter.agregarNumero(3);
   	 counter.agregarNumero(40);
   	 counter.agregarNumero(25);
    }
 
    /**
     * Verificar la cantidad de pares
     */
    @Test
    public void testNumerosPares() { 
    	int cantidadDeNumerosPares = counter.cantidadDePares();	
    	assertEquals(cantidadDeNumerosPares, 2);
    }
    /**
     * Verificar la cantidad de impares
     */
    @Test
    public void testNumerosImpares() {  	
    	int cantidadDeNumerosImpares = counter.cantidadDeImpares();			 
    	assertEquals(cantidadDeNumerosImpares, 3);
    }
    /**
     * Verificar la cantidad de multiplos
     */
    @Test
    public void testMultiplos() {
    	int cantidadDeMultiplosDe2 = counter.cantidadDeMultiplosDe(2);
    	int cantidadDeMultiplosDe5 = counter.cantidadDeMultiplosDe(5);
    	assertEquals(cantidadDeMultiplosDe2, 2);
    	assertEquals(cantidadDeMultiplosDe5, 3);
    }
}
