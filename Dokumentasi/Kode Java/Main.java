// Kelas Person
class Person {
    // Atribut dengan access modifier private
    private String nama;
    private String jenisKelamin;
    private int umur;

    // Constructor untuk menginisialisasi atribut
    public Person(String nama, String jenisKelamin, int umur) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.umur = umur;
    }

    // Getter untuk atribut nama
    public String getNama() {
        return nama;
    }

    // Setter untuk atribut nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter untuk atribut jenisKelamin
    public String getJenisKelamin() {
        return jenisKelamin;
    }

    // Setter untuk atribut jenisKelamin
    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    // Getter untuk atribut umur
    public int getUmur() {
        return umur;
    }

    // Setter untuk atribut umur
    public void setUmur(int umur) {
        this.umur = umur;
    }
}

// Kelas Main
public class Main {
    public static void main(String[] args) {
        // Buat objek Person untuk Anton
        Person anton = new Person("Anton", "Male", 25);

        // Tampilkan informasi Anton sebelum diubah
        System.out.println("Before Update Anton:");
        System.out.println("Name: " + anton.getNama());
        System.out.println("Gender: " + anton.getJenisKelamin());
        System.out.println("Age: " + anton.getUmur());

        // Mengubah informasi Anton menggunakan setter
        anton.setNama("Anton S.");
        anton.setUmur(26);

        // Tampilkan informasi Anton setelah diubah
        System.out.println("\nAfter Update Anton:");
        System.out.println("Name: " + anton.getNama());
        System.out.println("Gender: " + anton.getJenisKelamin());
        System.out.println("Age: " + anton.getUmur());

        // Buat objek Person untuk Riko
        Person riko = new Person("Riko", "Male", 30);

        // Tampilkan informasi Riko
        System.out.println("\nRiko's Information:");
        System.out.println("Name: " + riko.getNama());
        System.out.println("Gender: " + riko.getJenisKelamin());
        System.out.println("Age: " + riko.getUmur());

        // Mengubah informasi Riko menggunakan setter
        riko.setNama("Riko A.");
        riko.setUmur(31);

        // Tampilkan informasi Riko setelah diubah
        System.out.println("\nRiko's Information After Update:");
        System.out.println("Name: " + riko.getNama());
        System.out.println("Gender: " + riko.getJenisKelamin());
        System.out.println("Age: " + riko.getUmur());
    }
}