import java.io.*;

public class NoConexionException extends LoginException{
	public NoConexionException() {
		super("Ha ocurrido un error de coneccion.");
	}
	public NoConexionException(String message) {
		super(message);
	}

}
