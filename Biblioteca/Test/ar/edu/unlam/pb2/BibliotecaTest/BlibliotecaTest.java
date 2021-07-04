package ar.edu.unlam.pb2.BibliotecaTest;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.pb2.Biblioteca.Biblioteca;
import ar.edu.unlam.pb2.Biblioteca.Estudiante;
import ar.edu.unlam.pb2.Biblioteca.Historia;
import ar.edu.unlam.pb2.Biblioteca.Libro;
import ar.edu.unlam.pb2.Biblioteca.LibroNoEncontradoException;


public class BlibliotecaTest {

	@Test
	public void testQuePrestaUnLibro() throws LibroNoEncontradoException {

		Biblioteca nacional = new Biblioteca("Biblioteca Nacional");
		Estudiante martin = new Estudiante(334455, "Martin", "Guzman", 1);
		Libro historia = new Libro(222, "La historia", "Felix Luna");

		nacional.ingresarLibros(historia);
		nacional.prestarUnLibro(historia, martin);

		assertTrue(nacional.prestarUnLibro(historia, martin));

	}

	@Test
	public void testQueIngresaUnLibroNuevoALaBiblioteca() {

		Biblioteca nacional = new Biblioteca("Biblioteca Nacional");
		Libro historia = new Libro(222, "La historia", "Felix Luna");

		assertTrue(nacional.ingresarLibros(historia));
	}

	@Test
	public void testQueCompruebaQueUnLibroEsFotocopiado() {

		Biblioteca nacional = new Biblioteca("Biblioteca Nacional");
		Estudiante martin = new Estudiante(334455, "Martin", "Guzman", 1);
		Historia historia = new Historia(222, "La historia", "Felix Luna");

		nacional.ingresarLibros(historia);

		historia.serFotocopiado();

		String actual = historia.getEstado();
		String esperado = "me fotocopiaron";

		assertEquals(actual, esperado);

	}

	@Test
	public void testQueCompruebaQueLosLibrosSeOrdenanPorNombre() {

		Biblioteca nacional = new Biblioteca("Biblioteca Nacional");
		Libro historia = new Libro(222, "La historia", "Felix Luna");
		Libro geografia = new Libro(222, "Argentina", "Capeluz");
		Libro matematica = new Libro(222, "matematicas, estas ahi?", "Paenza");

		nacional.ingresarLibros(historia);
		nacional.ingresarLibros(geografia);
		nacional.ingresarLibros(matematica);

		Libro actual = nacional.getLibros().first();
		Libro esperado = geografia;

		assertEquals(actual, esperado);

		Libro actual1 = nacional.getLibros().last();
		Libro esperado1 = matematica;

		assertEquals(actual, esperado);

	}

	@Test
	public void testQueCompruebaQueLosLibrosSeOrdenanPorAutor() {

		Biblioteca nacional = new Biblioteca("Biblioteca Nacional");
		Libro historia = new Libro(222, "La historia", "Felix Luna");
		Libro geografia = new Libro(222, "Argentina", "Capeluz");
		Libro matematica = new Libro(222, "matematicas, estas ahi?", "Paenza");

		nacional.ingresarLibros(historia);
		nacional.ingresarLibros(geografia);
		nacional.ingresarLibros(matematica);

		Libro actual = nacional.ordenarLaColeccionPorAutor().first();
		Libro esperado = geografia;

		assertEquals(actual, esperado);

		Libro actual1 = nacional.ordenarLaColeccionPorAutor().last();
		Libro esperado1 = matematica;

		assertEquals(actual, esperado);

	}
	
	@Test(expected = LibroNoEncontradoException.class)
	public void queNoSeEncuentraUnLibroEnLaColeccion() throws  LibroNoEncontradoException{
		
		Biblioteca nacional = new Biblioteca("Biblioteca Nacional");
		Libro historia = new Libro(222, "La historia", "Felix Luna");
		
		nacional.buscarLibro(historia);
	}
	
	

}
