import java.io.*;

public class NoConexionException extends LoginErrorException{
	public NoConexionException() {
		super("Ha ocurrido un error de coneccion.");
	}
	public NoConexionException(String message) {
		super(message);
	}

}
