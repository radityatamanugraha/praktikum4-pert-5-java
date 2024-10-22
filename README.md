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

## • Programmer.java
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
### Penjelasan:
```
• Atribut:
- bonus: menyimpan bonus untuk programmer.
  
• Method:
- setBonus(): untuk menetapkan bonus programmer.
- getBonus(): untuk mengambil bonus programmer.
- cetakInfo(): menampilkan informasi dari kelas Pegawai dan menambahkan informasi tentang bonus.
```

# • Main.java
```java
public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.setNama("Radit");
        manager.setGajiPokok(9000000);
        manager.setTunjangan(5000000);

        System.out.println("Informasi Manager:");
        manager.cetakInfo(); 

        System.out.println();

        Programmer programmer = new Programmer();
        programmer.setNama("Romi");
        programmer.setGajiPokok(7000000);
        programmer.setBonus(4000000);

        System.out.println("Informasi Programmer:");
        programmer.cetakInfo();
    }
}
```
### Penjelasan :
```
• Objek Manager:
- Kita membuat objek Manager bernama manager.
- Kemudian kita menetapkan nilai nama, gajiPokok, dan tunjangan.
- Terakhir, kita mencetak informasi manager dengan cetakInfo().

• Objek Programmer:
- Kita membuat objek Programmer bernama programmer.
- Kemudian kita menetapkan nilai nama, gajiPokok, dan bonus.
- Terakhir, kita mencetak informasi programmer dengan cetakInfo().
```
























