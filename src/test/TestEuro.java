package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import code.Business_Logic.*;
public class TestEuro {

    Euro e;
	
	@BeforeEach
	public void setUp() {
		 e = new Euro(15);
	} 
	


    @Test
    void testGetValore() {
        assertEquals(1500,e.getValore());
        
        assertTrue(!(e.getValore()==1000));
    }

    @Test
    void testMinoreDi() {
        Euro t = new Euro(30);
        assertTrue(e.minoreDi(t));
    }

    @Test
    void testSomma() {
        Euro t = new Euro(30);
        e.somma(t);
        assertEquals(4500, e.getValore());
    }

    @Test
    void testSottrai() {
        Euro sott = new Euro(5);
		e.sottrai(sott);
		assertEquals(1000,e.getValore());
    }

    @Test
    void testStampa() {
        assertEquals("15.0 euro",e.stampa());
    }

    @Test
    void testUgualeA() {
        assertEquals(true,e.ugualeA(new Euro(15)));
    }
}
