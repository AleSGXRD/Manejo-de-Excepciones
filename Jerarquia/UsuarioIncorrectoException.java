import java.io.*;

public class UsuarioIncorrectoException extends LoginErrorException {
	public UsuarioIncorrectoException() {
		super("El nombre de usuario o contraseņa son incorrectos, por favor verifiquelos.");
	}
	public UsuarioIncorrectoException(String message) {
		super(message);
	}

}
