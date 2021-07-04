package ar.edu.unlam.pb2.Biblioteca;

public class Geografia extends Libro implements Fotocopiable{

	private String estado;

	public Geografia(Integer codigo, String nombre, String autor) {
		super(codigo, nombre, autor);
		estado= "no me fotocopiaron";
	}
	
	@Override
	public void serFotocopiado() {

		this.estado= "me fotocopiaron";
		
	}

	@Override
	public String getEstado() {
		
		return estado;
	}


}
