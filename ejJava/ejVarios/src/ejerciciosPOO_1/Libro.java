package ejerciciosPOO_1;

public class Libro {

	private String titulo;
	private String autor;
	private int paginas;
	private String genero;
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public int getPaginas() {
		return paginas;
	}
	
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Libro() {}
	public Libro(String titulo, String autor, int paginas, String genero) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas + ", genero=" + genero + "]";
	}
	
	public void leerSinopsis() {
		System.out.println("La sinopsis del libro trata de...");
	}
	
	
	
	
}
