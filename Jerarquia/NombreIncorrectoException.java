import java.io.*;

public class NombreIncorrectoException extends UsuarioIncorrectoException {
	public NombreIncorrectoException() {
		super("No ha introducido ningun valor en el nombre de usuario, por favor rellenelo.");
	}
	public NombreIncorrectoException(String message) {
		super(message);
	}

}
