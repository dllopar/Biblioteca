package ar.edu.unlam.pb2.Biblioteca;

import java.util.Comparator;

public class OrdenPorAutor implements Comparator<Libro> {

	@Override
	public int compare(Libro o1, Libro o2) {
		
		return o1.getAutor().compareTo(o2.getAutor());
	}

}
