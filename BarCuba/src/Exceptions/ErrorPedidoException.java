package Exceptions;

public class ErrorPedidoException extends Exception{
	public ErrorPedidoException() {
		super("Lo sentimos, ocurrido un error en el pedido.");
	}
	public ErrorPedidoException(String msj) {
		super(msj);
	}
}
