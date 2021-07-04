package ar.edu.unlam.pb2.Biblioteca;

public class LibroNoEncontradoException extends Exception {
	
	public LibroNoEncontradoException() {
		super("El libro buscado no se encuentra en la lista");
	}

}
