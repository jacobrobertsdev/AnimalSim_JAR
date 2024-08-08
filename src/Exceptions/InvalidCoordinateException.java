package exceptions;

@SuppressWarnings("serial")
public class InvalidCoordinateException extends RuntimeException{

	public InvalidCoordinateException(String message) {
		super(message);
	}
}
