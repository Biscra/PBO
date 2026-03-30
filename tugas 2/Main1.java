class Mahasiswa {
    String nama;
    int umur;

    void belajar() {
        System.out.println("Sedang belajar");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa(); // object
        mhs.nama = "Andi";
        mhs.umur = 20;
        mhs.belajar();
    }
}