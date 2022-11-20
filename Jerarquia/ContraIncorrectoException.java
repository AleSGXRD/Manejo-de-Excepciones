import java.io.*;

public class ContraIncorrectoException extends UsuarioIncorrectoException{
	public ContraIncorrectoException() {
		super("No ha introducido ningun valor en la contrase�a de usuario, por favor rellenelo.");
	}
	public ContraIncorrectoException(String message) {
		super(message);
	}
}
