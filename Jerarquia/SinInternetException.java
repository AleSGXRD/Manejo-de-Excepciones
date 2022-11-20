import java.io.*;

public class SinInternetException extends NoConexionException{
	public SinInternetException() {
		super("No hay internet en el dispositivo, por favor revise su coneccion.");
	}
	public SinInternetException(String message) {
		super(message);
	}

}
