# Tugas Praktikum 4 (Pertemuan ke 5) 

|Nama|NIM|Kelas|Mata Kuliah|
|----|---|-----|------|
|**Radityatama Nugraha**|**312310644**|**TI.23.A6**|**Pemrograman Orientasi Objek**|

![gambar](Tugas-Pemrograman-Orientasi-Objek-Pert-5/ss1.jpeg)

# • Implementasikan java code diagram class berikut :

## • Pegawai.java
```java
import java.text.DecimalFormat;

class Pegawai {
    private String nama;
    private double gajiPokok;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void cetakInfo() {
        DecimalFormat df = new DecimalFormat("#.##");  
        System.out.println("Nama: " + nama);
        System.out.println("Gaji Pokok: " + df.format(gajiPokok));
    }
}
```
### Penjelasan :
```
• Atribut:
- nama: menyimpan nama pegawai.
- gajiPokok: menyimpan gaji pokok pegawai.

• Method:
- setNama(): untuk menetapkan (set) nama pegawai.
- getNama(): untuk mengambil (get) nama pegawai.
- setGajiPokok(): untuk menetapkan gaji pokok pegawai.
- getGajiPokok(): untuk mengambil gaji pokok pegawai.
- cetakInfo(): menampilkan informasi pegawai dengan format 2 angka di belakang koma untuk gaji pokok.
```

## • Manager.java
```java
import java.text.DecimalFormat;

class Manager extends Pegawai {
    private double tunjangan;

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    @Override
    public void cetakInfo() {
        DecimalFormat df = new DecimalFormat("#.##"); 
        super.cetakInfo(); 
        System.out.println("Tunjangan: " + df.format(tunjangan));
    }
}
```
### Penjelasan :
```
Penjelasan:
• Atribut:
- tunjangan: menyimpan tunjangan untuk manajer.

• Method:
- setTunjangan(): untuk menetapkan tunjangan manajer.
- getTunjangan(): untuk mengambil tunjangan manajer.
- cetakInfo(): menampilkan informasi dari kelas Pegawai (menggunakan super.cetakInfo()) dan menambahkan informasi tentang tunjangan.
- super.cetakInfo() memanggil method cetakInfo() dari kelas Pegawai.
```

## • Programer.java
```java
import java.text.DecimalFormat;

class Programmer extends Pegawai {
    private double bonus;

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public void cetakInfo() {
        DecimalFormat df = new DecimalFormat("#.##"); 
        super.cetakInfo(); 
        System.out.println("Bonus: " + df.format(bonus));
    }
}
```


























