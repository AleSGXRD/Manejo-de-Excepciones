package Exceptions;

public class FaltaDeBebidaException extends ErrorPedidoException{
	public FaltaDeBebidaException() {
		super("Lo sentimos, no tenemos bebidas a la venta.");
	}public FaltaDeBebidaException(String msj) {
		super(msj);
	}
}