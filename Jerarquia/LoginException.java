import java.io.*;

public class LoginException extends Exception{
	public LoginException() {
		super("No se a podido iniciar sesion");
	}
	public LoginException(String message) {
		super(message);
	}

}
