package Exceptions;

public class ErrorComestiblesException extends ErrorPedidoException{
	public ErrorComestiblesException() {
		super("Lo sentimos, parece que hay un problema en su hamburgesa/pizza.");
	}
	public ErrorComestiblesException(String msj) {
		super(msj);
	}
}
