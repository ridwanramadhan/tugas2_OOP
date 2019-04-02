class Person {
	private String nama;
	private int umur;
	public Person(String nama, int umur) {
		this.nama = nama;
		this.umur = umur;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public void setUmur(int umur) {
		this.umur = umur;
	}
	public String getNama() {
		return nama;
	}
	public int getUmur() {
		return umur;
	}
}
class Student extends Person {
	private int nis;
	public Student() {

	}
	public Student(int nis) {
		this.nis = nis;
	}
	public int getNis() {
		return nis;
	}
}
class Teacher extends Person {
	private int nip;
	private int gaji;
	public Teacher(int nip, int gaji) {
		this.nip = nip;
		this.gaji = gaji;
	}
	public void setNip(int nip) {
		this.nip = nip;
	}
	public void setGaji(int gaji) {
		this.gaji = gaji;
	}
	public int getNip() {
		return nip;
	}
	public int getGaji() {
		return gaji;
	}
}
class Staff extends Teacher {
	private String matkul;
	public Teacher(String matkul) {
		this.matkul = matkul;
	}
	public String getMatkul() {
		return matkul;
	}
}
class Headmaster extends Teacher {
	private String jabatan;
	public Headmaster() {

	}
	public Headmaster(String jabatan) {
		this.jabatan = jabatan;
	}
	public String getJabatan() {
		return jabatan;
	}
}
class Things {
	private String nama;
	private int jumlah;
	public Things(String nama, int jumlah) {
		this.nama = nama;
		this.jumlah = jumlah;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public void setJumlah(String jumlah) {
		this.jumlah = jumlah;
	}
	public String getNama() {
		return nama;
	}
	public int getJumlah() {
		return jumlah;
	}
}
class Buku {
	private String penerbit;
	private String pengarang;
	public Buku(String penerbit, String pengarang) {
		this.penerbit = penerbit;
		this.pengarang = pengarang;
	}
	public void setPenerbit(String penerbit) {
		this.penerbit = penerbit;
	}
	public void setPengarang(String pengarang) {
		this.pengarang = pengarang;
	}
	public String getPenerbit() {
		return penerbit;
	}
	public String getPengarang() {
		return pengarang;
	}
}
class Slides {
	private int tanggal;
	public void setTanggal(int tanggal) {
		this.tanggal = tanggal;
	}
	public int getTanggal() {
		return tanggal;
	}
}
class Vehicle {
	private String nama;
	private String warna;
	private String plat;
	public Vehicle(String nama, String warna, String plat) {
		this.nama = nama;
		this.warna = warna;
		this.plat = plat;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public void setWarna(String warna) {
		this.warna = warna;
	}
	public void setPlat(String plat) {
		this.plat = plat;
	}
	public String getNama() {
		return nama;
	}
	public String getWarna() {
		return warna;
	}
	public String getPlat() {
		return plat;
	}
}
class Main {
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("oi mahdi");
	}
}