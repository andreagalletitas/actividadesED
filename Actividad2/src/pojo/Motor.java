package pojo;

public class Motor {
	private int id;
	private String tipoMotor;
	private String potencia; //para poder poner la unidad de medida
	
	public Motor (int vId, String vTipo, String vPotencia) {
		id = vId;
		tipoMotor = vTipo;
		potencia = vPotencia;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipoMotor() {
		return tipoMotor;
	}

	public void setTipoMotor(String tipoMotor) {
		this.tipoMotor = tipoMotor;
	}

	public String getPotencia() {
		return potencia;
	}

	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}
	
	
}
