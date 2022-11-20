import java.io.*;

public class LoginErrorException extends Exception{
	public LoginErrorException() {
		super("No se a podido iniciar sesion");
	}
	public LoginErrorException(String message) {
		super(message);
	}

}
