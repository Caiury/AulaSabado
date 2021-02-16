package Capitulo11;

public class NotaInvalidaException extends Exception {

	public NotaInvalidaException() {
		super();
	}

	public NotaInvalidaException(String mensagem) {
		super(mensagem);
	}

	public NotaInvalidaException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}

	public NotaInvalidaException(Throwable causa) {
		super(causa);
	}
}
