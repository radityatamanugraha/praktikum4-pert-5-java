public class MahasiswaBeraksi {
    public static void main(String[] args) {
        // Membuat objek Mahasiswa dengan menggunakan konstruktor
        Mahasiswa anton = new Mahasiswa("Radityatama Nugraha", "Laki-Laki", 18, "Cikarang Selatan", "312310644", "Teknik Informatika");

        // Memanggil metode untuk mencetak informasi
        anton.cetakInfo();
        System.out.println("NIM             : " + anton.getNim());
        System.out.println("Jurusan         : " + anton.getJurusan());
    }
}