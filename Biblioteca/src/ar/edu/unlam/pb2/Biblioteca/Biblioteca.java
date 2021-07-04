package ar.edu.unlam.pb2.Biblioteca;

import java.util.ArrayList;
import java.util.TreeSet;

public class Biblioteca {

	private TreeSet<Libro> libros;
	private String nombre;
	private ArrayList<Prestamo> prestamos;
	private Integer numeroIdPrestamo = 0;

	public Biblioteca(String nombre) {

		this.nombre = nombre;
		libros = new TreeSet<>();
		prestamos = new ArrayList<>();

	}

	public Boolean ingresarLibros(Libro libroNuevo) {

		return libros.add(libroNuevo);

	}

	public Boolean prestarUnLibro(Libro aPrestar, Estudiante pedidoEstudiante) throws LibroNoEncontradoException {

		Boolean prestado = false;

		if (this.buscarLibro(aPrestar) && pedidoEstudiante.getPrestamosPedidos() <= 2) {
			Prestamo prestamoNuevo = new Prestamo(numeroIdPrestamo++, aPrestar, pedidoEstudiante);
			prestamos.add(prestamoNuevo);
			pedidoEstudiante.setPrestamosPedidos(+1);
			prestado = true;
		}

		return prestado;
	}

	private Boolean librosPedidoPorEstudiante(Estudiante estudianteBuscado) {

		return prestamos.contains(estudianteBuscado);
	}

	public Boolean buscarLibro(Libro buscado)  throws LibroNoEncontradoException{
		
		Boolean encontrado = false;
		if(!libros.contains(buscado)) {
			throw new LibroNoEncontradoException();
		}else {
			encontrado=true;
		}

		return encontrado;
	}

	public Integer cantidadDePrestamos() {

		return prestamos.size();
	}

	public TreeSet<Libro> getLibros() {
		return libros;
	}

	public String getNombre() {
		return nombre;
	}

	public ArrayList<Prestamo> getPrestamos() {
		return prestamos;
	}

	public Integer getNumeroIdPrestamo() {
		return numeroIdPrestamo;
	}

	public TreeSet<Libro> ordenarLaColeccionPorAutor() {
		OrdenPorAutor nuevoOrden = new OrdenPorAutor();
		TreeSet<Libro> TSordenadoPorAutor = new TreeSet<Libro>(nuevoOrden);
		TSordenadoPorAutor.addAll(libros);
		return TSordenadoPorAutor;
	}

}
