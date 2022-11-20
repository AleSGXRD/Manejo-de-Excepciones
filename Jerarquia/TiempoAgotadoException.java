import java.io.*;

public class TiempoAgotadoException extends NoConexionException{
	public TiempoAgotadoException() {
		super("Se ha agotado el tiempo de espera.");
	}
	public TiempoAgotadoException(String message) {
		super(message);
	}

}
