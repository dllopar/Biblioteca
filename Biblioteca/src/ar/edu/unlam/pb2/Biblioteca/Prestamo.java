package ar.edu.unlam.pb2.Biblioteca;

public class Prestamo {
	
	private Integer id;
	private Libro libroPrestado;
	private Estudiante estudiante;

	public Prestamo(Integer id, Libro libroPrestado, Estudiante estudiante) {
		
		this.id=id;
		this.libroPrestado=libroPrestado;
		this.estudiante=estudiante;
		
	}

	public Integer getId() {
		return id;
	}

	public Libro getLibroPrestado() {
		return libroPrestado;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}
	
	

}
