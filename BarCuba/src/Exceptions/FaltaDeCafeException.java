package Exceptions;

public class FaltaDeCafeException extends ErrorPedidoException {
	public FaltaDeCafeException() {
		super("Lo sentimos, no tenemos cafe a la venta.");
	}public FaltaDeCafeException(String msj) {
		super(msj);
	}
}
