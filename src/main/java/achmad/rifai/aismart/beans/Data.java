package achmad.rifai.aismart.beans;

public class Data {
	private String nama,krit;
	private float val;

	public Data(String nama, String krit, float val) {
		super();
		this.nama = nama;
		this.krit = krit;
		this.val = val;
	}

	public Data() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getKrit() {
		return krit;
	}

	public void setKrit(String krit) {
		this.krit = krit;
	}

	public float getVal() {
		return val;
	}

	public void setVal(float val) {
		this.val = val;
	}
}
