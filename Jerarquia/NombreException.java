import java.io.*;

public class NombreException extends UsuarioException {
	public NombreException() {
		super("No ha introducido ningun valor en el nombre de usuario, por favor rellenelo.");
	}
	public NombreException(String message) {
		super(message);
	}

}
