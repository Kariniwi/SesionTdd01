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
	@Test 
	public void multiplicaSeisyTresEsDieciocho(){
		Calculadora cal =new Calculadora();
		int resultado= cal.multiplicar(6,3);
		assertThat(resultado,is(18));
	}
	@Test 
	public void multiplicaDoceYCuatroEsCuarentaYOcho(){
		Calculadora cal =new Calculadora();
		int resultado= cal.multiplicar(12,4);
		assertThat(resultado,is(48));
	}
	@Test 
	public void DividirDoceYTresEsCuatro(){
		Calculadora cal =new Calculadora();
		int resultado= cal.dividir(12,3);
		assertThat(resultado,is(4));
	}
	@Test
	public void DividirTreintaySeisYSeisEsSeis(){
		Calculadora cal =new Calculadora();
		int resultado= cal.dividir(36,6);
		assertThat(resultado,is(6));
	}
	
}
