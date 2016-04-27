package cl.ubb.agil;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertFalse;
import static org.hamcrest.CoreMatchers.is;

public class CalculadoraTest {
	@Test
	public void DosMasTresEsCinco(){
		Calculadora cal =new Calculadora();
		int resultado= cal.sumar(2,3);
		assertThat(resultado,is(5));
	}
}
