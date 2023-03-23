package deposito;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class DepositoTest {

	@ParameterizedTest
	@CsvSource({
		"01, 5, 10",
		"02, 3, -2",
		"03, -5, 8"
	})
	void testCrearDeposito(String valor_idDeposito, float valor_diametro, float valor_altura) {
		
		Deposito deposito = new Deposito(valor_diametro, valor_altura, valor_idDeposito);
		
		float exp = valor_diametro;
		float res = deposito.getDiametro();
		
		assertEquals(exp, res, "Error en la creación del objeto");
	}
	
	@Test
	void testCrearDepositoVacio() {
		
		Deposito deposito = new Deposito();
		
		float diametroExp = 10;
		float alturaExp = 5;
		String idExp = "000";
		
		assertEquals(diametroExp, deposito.getDiametro(), "Diametro incorrecto");
		
		assertEquals(alturaExp, deposito.getAltura(), "Diametro incorrecto");
		
		assertEquals(idExp, deposito.getIdDeposito(), "Diametro incorrecto");
	}

}
