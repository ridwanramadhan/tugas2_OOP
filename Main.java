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
	Motorcycle motor;
	Car c;
	Slides ppt;
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
	public void mengendarai(Motorcycle motor, Car c) {
		this.motor = motor;
		this.c = c;
	}
	public void menyiapkan(Slides ppt) {
		this.ppt = ppt;
	}
	public String getStatus() {
		String hasil = " ";
		hasil = super.getNama()+" mengendarai motor "+motor.getNama()+" atau mengendarai mobil "+c.getNama()+" sambil menyiapkan ppt "+ppt.getNama();
		return hasil;
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
		andi.setUmur(30);
		andi.setNip(12345);
		andi.setGaji(3000);
		andi.setMatkul("Struktur Data");

		Student budi = new Student();
		budi.setNama("Budi");
		budi.setUmur(20);
		budi.setNis(46170);

		Headmaster joko = new Headmaster();
		joko.setNama("Joko");
		joko.setUmur(35);
		joko.setNip(54321);
		joko.setGaji(5000);

		Buku rpl = new Buku();
		rpl.setNama("RPL");
		rpl.setJumlah(10);
		rpl.setPenerbit("McGraw-Hill Education");
		rpl.setPengarang("Roger S. Pressman");

		Slides oop = new Slides();
		oop.setNama("Object Oriented Programming");
		oop.setJumlah(16);
		oop.setTanggal(30);

		Motorcycle mio = new Motorcycle();
		mio.setNama("MIO");
		mio.setWarna("Hitam");
		mio.setPlat("B 1234 ABC");

		Car c = new Car();
		c.setNama("JAZZ");
		c.setWarna("Merah");
		c.setPlat("B 4321 CBA");

		Teacher teach = new Teacher();
		teach.setNama("Bu Guru");
		teach.setUmur(28);
		teach.setNip(32145);
		teach.setGaji(4000);

//==============================PERLAKUAN OBJEK==================================
		budi.meminjam(rpl);
		budi.mengendarai(mio);
		joko.memimpin(andi);
		andi.mengajar(budi);
		teach.mengendarai(mio, c);
		teach.menyiapkan(oop);

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
		System.out.println(teach.getStatus());
	}
}