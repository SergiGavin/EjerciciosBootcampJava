package ejerciciosPOO_2;

public class TarjetaCredito {

	private String entidadFinanciera;
	private int num;
	private String fechaCaducidad;
	private String titular;
	private double saldo = 1000;
	private boolean estado = true;
	
	
	
	public String getEntidadFinanciera() {
		return entidadFinanciera;
	}

	public void setEntidadFinanciera(String entidadFinanciera) {
		this.entidadFinanciera = entidadFinanciera;
	}

	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public String getFechaCaducidad() {
		return fechaCaducidad;
	}
	
	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isEstado() {
		return estado;
	}
	
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	public TarjetaCredito() {}
	
	public TarjetaCredito(String entidadFinancieraString, int num, String fechaCaducidad, String titular, int saldo,
			boolean estado) {
		super();
		this.entidadFinanciera = entidadFinancieraString;
		this.num = num;
		this.fechaCaducidad = fechaCaducidad;
		this.titular = titular;
		this.saldo = saldo;
		this.estado = estado;
	}
	
	@Override
	public String toString() {
		return "TarjetaCredito [entidadFinancieraString=" + entidadFinanciera + ", num=" + num
				+ ", fechaCaducidad=" + fechaCaducidad + ", titular=" + titular + ", Saldo=" + saldo + ", estado="
				+ estado + "]";
	}
	public void pagar(double precio) {
		if(estado && saldo>precio) {
			this.saldo -= precio;
			System.out.println("Pago realizado con exito");
		}else if(!(estado)) {
			System.out.println("Activa la tarjeta para poder realizar el pago.");
		}else if(saldo<precio) {
			System.out.println("Saldo insuficiente para realizar el pago.");
		}
	}
	public void activar() {
		this.estado=true;
		System.out.println("Tarjeta activada con exito");
	}
	public void anular() {
		this.estado=false;
		System.out.println("Tarjeta anulada con exito");
	}
	public void verSaldo() {
		System.out.println("El saldo de la tarjeta es de "+saldo);
	}
	
	
	
}
