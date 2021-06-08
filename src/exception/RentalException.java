package exception;

public class RentalException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public RentalException(String msg) {
		super(msg);
	}
}
