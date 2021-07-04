package ar.edu.unlam.pb2.Biblioteca;

public class Historia extends Libro implements Fotocopiable{
	
	public String estado;
	
	public Historia(Integer codigo, String nombre, String autor) {
		super(codigo, nombre, autor);
		estado = "no me fotocopiaron";
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
