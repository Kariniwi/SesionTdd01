package cl.ubb.agil;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertFalse;
import static org.hamcrest.CoreMatchers.is;

public class CalculadoraTest {
	@Test
	public void dosMasTresEsCinco(){
		Calculadora cal =new Calculadora();
		int resultado= cal.sumar(2,3);
		assertThat(resultado,is(5));
	}
	@Test 
	public void menosUnoMasSieteEsSeis(){
		Calculadora cal =new Calculadora();
		int resultado= cal.sumar(-1,7);
		assertThat(resultado,is(6));
	}
	@Test 
	public void docientosmenosSetentaYTresEsCientoVeintiSiete(){
		Calculadora cal =new Calculadora();
		int resultado= cal.restar(200,73);
		assertThat(resultado,is(127));
	}
	@Test 
	public void menosDiezmenosCincoEsMenosQuince(){
		Calculadora cal =new Calculadora();
		int resultado= cal.restar(-10,5);
		assertThat(resultado,is(-15));
	}
	
	
}
