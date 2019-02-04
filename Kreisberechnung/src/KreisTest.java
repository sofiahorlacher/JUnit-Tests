import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.*;

class KreisTest {
	Berechnen berechne1 = new Berechnen();
	double maxAbweichung = 0.001;

	@Test
		void berechnen1Test() {
		double output = berechne1.kreisberechnen();
		assertEquals(31.4159, output, maxAbweichung);
		
	}
	@Test
		void berechnen2Test() {
		double output = berechne1.kreisberechnen();
		assertNotEquals(32.4159, output);	
		}

	@Test
		void berechnen3Test() {
		double output = berechne1.kreisberechnen();
		assertNotEquals(30.00, output, maxAbweichung);
	}
	
	@Test
	void berechnen4Test() {
	double output = berechne1.kreisberechnen();
	assertNotNull(berechne1);
	}

	@Test
	void berechnen5Test() {
	double output = berechne1.kreisberechnen();
	assertTrue(output == 31.41592653589793);
	}

	@Test
	void berechnen6Test() {
	double output = berechne1.kreisberechnen();
	assertTrue(output > 30);
	}
	
	@Test
	void berechnen7Test() {
	double output = berechne1.kreisberechnen();
	assertFalse(output > 40);
	}
}
