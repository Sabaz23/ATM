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
        
    }

    @Test
    void testSomma() {

    }

    @Test
    void testSottrai() {

    }

    @Test
    void testStampa() {

    }

    @Test
    void testUgualeA() {

    }
}
