package Exceptions;

public class FaltaDeHamburgesaException extends ErrorComestiblesException{
	public FaltaDeHamburgesaException() {
		super("Lo sentimos, no tenemos hamburgesas a la venta.");
	}
	public FaltaDeHamburgesaException(String msj) {
		super(msj);
	}
}
