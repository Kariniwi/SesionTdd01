package cl.ubb.agil;
import org.junit.Test;
public class CalculadoraTest {
	public void DosMasTresEsCinco(){
		Calculadora cal =new Calculadora();
		int resultado= cal.suma(2,3);
		assertThat(Resultado,is(5));
	}
}
