package Controller;
import Exceptions.*;

public class ControlVentas {
	static int cafes = 4;
	static int bebidas = 1;
	static int hamburgesas = 1;
	static int pizzas = 2;
	
	public static int ComprarCafe(int mony)throws ErrorPedidoException {
		if(cafes<=0) {
			throw new FaltaDeCafeException();
		}
		if(mony < 50) {
			throw new InsuficienteDineroException();
		}
		mony -=50;
		cafes--;
		System.out.println("Compra con exito!");
		System.out.println("--------------------------------------");
		return mony;
	}
	public static int ComprarBebidas(int mony)throws ErrorPedidoException {
		if(bebidas<=0) {
			throw new FaltaDeBebidaException();
		}
		if(mony < 150) {
			throw new InsuficienteDineroException();
		}
		mony -=150;
		bebidas--;
		System.out.println("Compra con exito!");
		System.out.println("--------------------------------------");
		return mony;
	}
	
	public static int ComprarHamburgesa(int mony)throws ErrorPedidoException {
		if(hamburgesas<=0) {
			throw new FaltaDeHamburgesaException();
		}
		if(mony < 190) {
			throw new InsuficienteDineroException();
		}
		mony -=190;
		hamburgesas--;
		System.out.println("Compra con exito!");
		System.out.println("--------------------------------------");
		return mony;
	}
	
	public static int ComprarPizza(int mony)throws ErrorPedidoException {
		if(pizzas<=0) {
			throw new FaltaDePizzaException();
		}
		if(mony < 300) {
			throw new InsuficienteDineroException();
		}
		mony -=300;
		pizzas--;
		System.out.println("Compra con exito!");
		System.out.println("--------------------------------------");
		return mony;
	}
	
	public static int VerificarOpcion(String op)throws ErrorPedidoException{
		int test = Integer.valueOf(op);
		if(!(test>=1&&test<=4)) {
			throw new ErrorPedidoException("La opcion es incorrecta, vuelva a intentarlo.");
		}
		return test;
	}
	
}
