package ejerciciosPOO_4_Herencia;

import java.util.Random;

public class Cliente {

	private String categoria;
	private int codigo;
	
	public void generarCodigo() {
		Random random = new Random();
		int codigoNum = random.nextInt(1000);
		codigo = codigoNum;
		
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Cliente() {}
	
	public Cliente(String categoria, int codigo) {
		super();
		this.categoria = categoria;
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return super.toString()+ "Cliente [categoria=" + categoria + ", codigo=" + codigo + "]";
	}
	
}
