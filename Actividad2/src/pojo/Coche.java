package pojo;

public class Coche {
	private int id;
	private String matricula;
	private String modelo;
	private String marca;
	private double km;
	private int anho;
	
	public Coche (int vId, String vMat, String vMod, String vMarca, double vKm, int vAnho) {
		id = vId;
		matricula = vMat;
		modelo = vMod;
		marca = vMarca;
		km = vKm;
		anho = vAnho;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getKm() {
		return km;
	}

	public void setKm(double km) {
		this.km = km;
	}

	public int getAnho() {
		return anho;
	}

	public void setAnho(int anho) {
		this.anho = anho;
	}

	@Override
	public String toString() {
		return "Coche [id=" + id + ", matricula=" + matricula + ", modelo=" + modelo + ", marca=" + marca + ", km=" + km
				+ ", anho=" + anho + "]";
	}
	
	
}
