package Exceptions;

public class InsuficienteDineroException extends ErrorPedidoException {
	public InsuficienteDineroException() {
		super("No tiene suficiente dinero para la compra");
	}
	public InsuficienteDineroException(String msj) {
		super(msj);
	}
}
