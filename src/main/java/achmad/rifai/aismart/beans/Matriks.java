package achmad.rifai.aismart.beans;

public class Matriks {
	private String nama;
	private int baris,kolom;
	private double[]isi;

	public Matriks(String nama, int baris, int kolom) {
		super();
		this.nama = nama;
		this.baris = baris;
		this.kolom = kolom;
		isi=new double[baris*kolom];
		for(int x=0;x<baris;x++)
			for(int y=0;y<kolom;y++)
				isi[y+(x*kolom)]=0;
	}

	public void set(int x, int y, double v) {
		if(x<baris&&y<kolom)isi[y+(x*kolom)]=v;
		else System.out.println(nama+" indek terlalu besar");
	}

	public double get(int x, int y) {
		double v=0;
		if(x<baris&&y<kolom)v=isi[y+(x*kolom)];
		else System.out.println(nama+" indek terlalu besar");
		return v;
	}

	public int getBaris() {
		return baris;
	}

	public int getKolom() {
		return kolom;
	}

	@Override
	public String toString() {
		String s=nama+"\n";
		for(int x=0;x<baris;x++) {
			for(int y=0;y<kolom;y++)
				s+=isi[y+(x*kolom)]+" ";
			s+="\n";
		} return s;
	}
}
