package Exceptions;

public class ErrorConsumiblesException extends ErrorPedidoException {
	public ErrorConsumiblesException() {
		super("Lo sentimos, parece que hay un problema en su bebida/cafe.");
	}
	public ErrorConsumiblesException(String msj) {
		super(msj);
	}
}
