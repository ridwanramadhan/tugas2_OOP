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
	Student std;

	public void setMatkul(String matkul) {
		this.matkul = matkul;
	}
	public String getMatkul() {
		return matkul;
	}
	public void mengajar(Student std){
		this.std = std;
	}
	public String getStatus(){
		String hasil = " ";
		hasil = super.getNama() + " mengajar "+ std.getNama();
		return hasil;
	}
}
class Headmaster extends Teacher {
	private String jabatan;
	Staff s;
	public void memimpin(Staff s){
		this.s = s;
	}

	public void setJabatan(String jabatan) {
		this.jabatan = jabatan;
	}
	public String getJabatan() {
		return jabatan;
	}

	public String getStatus(){
		String hasil = " ";
		hasil = super.getNama() + " memimpin staff "+ s.getNama();
		return hasil;
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

//==========================INISIALISASI=======================================
		Staff andi = new Staff();
		andi.setNama("Andi");

		Student budi = new Student();
		budi.setNama("Budi");

		Headmaster joko = new Headmaster();
		joko.setNama("Joko");

		Buku rpl = new Buku();
		rpl.setNama("RPL");

		Slides oop = new Slides();

		Motorcycle mio = new Motorcycle();
		mio.setNama("MIO");

		Car c = new Car();

//==============================PERLAKUAN OBJEK==================================
		budi.meminjam(rpl);
		budi.mengendarai(mio);
		joko.memimpin(andi);
		andi.mengajar(budi);


		// try{
		// 	System.out.println(budi.getStatus());
		// }
		// catch(Exception e) {
		// 	System.out.println(e.getMessage());
		// }

//=======================================OUTPUT==============================
		System.out.println(budi.getStatus());
		System.out.println(joko.getStatus());
		System.out.println(andi.getStatus());
	}
}