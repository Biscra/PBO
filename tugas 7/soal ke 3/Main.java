import java.util.ArrayDeque;

public class Main {

public static void main(String[] args){

    // membuat objek buku
    Buku b1 = new BukuFiksi(
        "Pergi",
        "Tere liye"
    );

    // menampilkan data buku
    b1.info();


    // membuat objek anggota
    Anggota a1 = new Anggota("Budi");

    // menjalankan interface pinjam
    a1.pinjamBuku();


    // generic dan arraylist
    Rak<String> rak = new Rak<>();

    rak.tambah("Java Dasar");
    rak.tambah("Jaringan Komputer");

    System.out.println("Daftar Buku:");
    rak.tampil();


    // arraydeque untuk antrian
    ArrayDeque<String> antrian =
            new ArrayDeque<>();

    antrian.add("Andre");
    antrian.add("Ado");
    antrian.add("Randy");

    System.out.println(
      "Antrian : " + antrian
    );

}
}