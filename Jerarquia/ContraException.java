import java.io.*;

public class ContraException extends UsuarioException{
	public ContraException() {
		super("No ha introducido ningun valor en la contraseņa de usuario, por favor rellenelo.");
	}
	public ContraException(String message) {
		super(message);
	}
}
