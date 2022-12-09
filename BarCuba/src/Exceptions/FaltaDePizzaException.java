package Exceptions;

public class FaltaDePizzaException extends ErrorComestiblesException{
	public FaltaDePizzaException() {
		super("Lo sentimos, no tenemos pizzas a la venta.");
	}
	public FaltaDePizzaException(String msj) {
		super(msj);
	}
}
