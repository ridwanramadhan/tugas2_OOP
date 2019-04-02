class Person {
	private String nama;
	private int umur;
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
	Person p;
	Buku b;
	Motorcycle motor;
	public void setNis(int nis) {
		this.nis = nis;
	}
	public int getNis() {
		return nis;
	}
	public void meminjam(Buku b) {
		this.b = b;
	} 
	public void mengendarai(Motorcycle motor) {
		this.motor = motor;
	}
	public String getStatus() {
		String hasil = " ";
		hasil = super.getNama() + " meminjam buku "+ b.getNama() + " dan mengendarai sepeda motor " + motor.getNama();
		return hasil;
		// return p.getNama();
		// return b.getNama();
		// return motor.getNama();
		// return Student.getNama();
	}
}
class Teacher extends Person {
	private int nip;
	private int gaji;
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
	public void setMatkul(String matkul) {
		this.matkul = matkul;
	}
	public String getMatkul() {
		return matkul;
	}
}
class Headmaster extends Teacher {
	private String jabatan;
	public void setJabatan(String jabatan) {
		this.jabatan = jabatan;
	}
	public String getJabatan() {
		return jabatan;
	}
}
class Things {
	private String nama;
	private int jumlah;
	public void setNama(String nama) {
		this.nama = nama;
	}
	public void setJumlah(int jumlah) {
		this.jumlah = jumlah;
	}
	public String getNama() {
		return nama;
	}
	public int getJumlah() {
		return jumlah;
	}
}
class Buku extends Things {
	private String penerbit;
	private String pengarang;
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
class Slides extends Things {
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
class Motorcycle extends Vehicle {

}
class Car extends Vehicle {

}
class Main {
	public static void main(String[] args) {
		// System.out.println("Hello World");
		// System.out.println("oi mahdi");

		Staff andi = new Staff();
		// andi.setNama("Andi");

		Student budi = new Student();
		budi.setNama("Budi");

		Headmaster joko = new Headmaster();

		Buku rpl = new Buku();
		rpl.setNama("RPL");

		Slides oop = new Slides();

		Motorcycle m = new Motorcycle();
		m.setNama("MIO");

		Car c = new Car();

		budi.meminjam(rpl);
		budi.mengendarai(m);

		//hasil=========================
		// try{
		// 	System.out.println(budi.getStatus());
		// }
		// catch(Exception e) {
		// 	System.out.println(e.getMessage());
		// }
		System.out.println(budi.getStatus());
	}
}