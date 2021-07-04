package ar.edu.unlam.pb2.Biblioteca;

public class Estudiante {
	
	private Integer dni;
	private String nombre;
	private String apellido;
	private Integer prestamosPedidos;

	public Estudiante(Integer dni, String nombre, String apellido, Integer prestamosPedidos) {
		
		this.dni=dni;
		this.nombre=nombre;
		this.apellido=apellido;
		this.prestamosPedidos=prestamosPedidos;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getPrestamosPedidos() {
		return prestamosPedidos;
	}

	public void setPrestamosPedidos(Integer prestamosPedidos) {
		this.prestamosPedidos = prestamosPedidos;
	}
	
	

}
