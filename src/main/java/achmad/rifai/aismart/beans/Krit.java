package achmad.rifai.aismart.beans;

public class Krit {
	private float bobot;
	private String krit;

	public Krit(float bobot, String krit) {
		super();
		this.bobot = bobot;
		this.krit = krit;
	}

	public Krit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public float getBobot() {
		return bobot;
	}

	public void setBobot(float bobot) {
		this.bobot = bobot;
	}

	public String getKrit() {
		return krit;
	}

	public void setKrit(String krit) {
		this.krit = krit;
	}
}
