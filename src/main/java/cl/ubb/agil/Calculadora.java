package cl.ubb.agil;

public class Calculadora {
	
	public int sumar(int a, int b){
		return ( a+  b);
	}
	public int restar(int a, int b){
		return ( a-b);
	}
	public int multiplicar(int a, int b){
		return ( a*b);
	}
	public int dividir(int a, int b)throws ExcepcionOperacionInvalida{
		if(b==0 ){
			throw new ExcepcionOperacionInvalida();
		}else{
			return ( a/b);
		}
		
	}
}
