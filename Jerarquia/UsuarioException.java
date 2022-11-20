import java.io.*;

public class UsuarioException extends LoginException {
	public UsuarioException() {
		super("El nombre de usuario o contraseña son incorrectos, por favor verifiquelos.");
	}
	public UsuarioException(String message) {
		super(message);
	}

}
