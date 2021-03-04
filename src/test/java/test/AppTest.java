/**
 * 
 */
package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import JUnit.Junit09_Geometria.App;

/**
 * @author Miguel A. Sastre
 *
 */
class AppTest {

	@Test
	public void testApp() {
		App clase = new App();
		clase.main(null);
		assertNotNull(clase);
	}

}
