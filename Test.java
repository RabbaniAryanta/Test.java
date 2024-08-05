public class Test {
    public static void main(String[] args) {
        String nama = "Rabbani";
        String alamat = "Surabaya";
        int usia=15;
        char jeniskelamin='l';
        double beratBadan=57.00;
        String hobby = "Main game";

        System.out.println("Nama         : " + nama);
        System.out.println("Alamat       : " + alamat);
        System.out.println("Usia         : " + usia);
        System.out.println("Jenis Kelamin: " + jeniskelamin);
        System.out.println("Berat Badan  : " + beratBadan);
        System.out.println("Hobby        : " + hobby);
      }
}


class Mahasiswa {
    String nama;
    String alamat;
    int usia;
    
    char jeniskelamin;
    double beratBadan;
    String hobby;

    public Mahasiswa(String nama, String alamat, int usia, char jeniskelamin, double beratBadan, String hobby) {
        this.nama = nama;
        this.alamat = alamat;
        this.usia = usia;
        this.jeniskelamin = jeniskelamin;
        this.beratBadan = beratBadan;
        this.hobby = hobby;
    }

    public void printData() {
        System.out.println("Nama         : " + nama);
        System.out.println("Alamat       : " + alamat);
        System.out.println("Usia         : " + usia);
        System.out.println("Jenis Kelamin: " + jeniskelamin);
        System.out.println("Berat Badan  : " + beratBadan);
        System.out.println("Hobby        : " + hobby);
    }
}
