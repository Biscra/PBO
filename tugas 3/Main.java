import java.util.Scanner;

class Mahasiswa {
    String nim, nama;
    int nilai;
    String grade;

    void hitungGrade() {
        if (nilai >= 80 && nilai <= 100) {
            grade = "A";
        } else if (nilai >= 70) {
            grade = "B";
        } else if (nilai >= 60) {
            grade = "C";
        } else if (nilai >= 50) {
            grade = "D";
        } else if (nilai >= 0) {
            grade = "E";
        } else {
            grade = "Input nilai salah";
        }
    }

    void tampil() {
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Nilai : " + nilai);
        System.out.println("Grade : " + grade);
        System.out.println("=========================================");
    }
}

public class Main {
    public static void main(String[] args) {

        // TRY-WITH-RESOURCES → tidak akan ada warning kuning
        try (Scanner input = new Scanner(System.in)) {

            System.out.print("Jumlah Mahasiswa: ");
            int n = input.nextInt();
            input.nextLine();

            Mahasiswa[] mhs = new Mahasiswa[n];

            int lulus = 0, tidakLulus = 0;
            int countA = 0, countB = 0, countC = 0;
            double total = 0;

            String namaLulus = "", namaTidakLulus = "";
            String namaA = "", namaB = "", namaC = "";

            for (int i = 0; i < n; i++) {
                mhs[i] = new Mahasiswa();

                System.out.println("\nData Mahasiswa ke-" + (i + 1));
                System.out.print("NIM   : ");
                mhs[i].nim = input.nextLine();

                System.out.print("Nama  : ");
                mhs[i].nama = input.nextLine();

                System.out.print("Nilai : ");
                mhs[i].nilai = input.nextInt();
                input.nextLine();

                mhs[i].hitungGrade();
                total += mhs[i].nilai;

                if (mhs[i].nilai >= 60) {
                    lulus++;
                    namaLulus += mhs[i].nama + ", ";
                } else {
                    tidakLulus++;
                    namaTidakLulus += mhs[i].nama + ", ";
                }

                if (mhs[i].grade.equals("A")) {
                    countA++;
                    namaA += mhs[i].nama + ", ";
                } else if (mhs[i].grade.equals("B")) {
                    countB++;
                    namaB += mhs[i].nama + ", ";
                } else if (mhs[i].grade.equals("C")) {
                    countC++;
                    namaC += mhs[i].nama + ", ";
                }
            }

            // Rapikan koma terakhir
            if (!namaLulus.isEmpty()) namaLulus = namaLulus.substring(0, namaLulus.length() - 2);
            if (!namaTidakLulus.isEmpty()) namaTidakLulus = namaTidakLulus.substring(0, namaTidakLulus.length() - 2);
            if (!namaA.isEmpty()) namaA = namaA.substring(0, namaA.length() - 2);
            if (!namaB.isEmpty()) namaB = namaB.substring(0, namaB.length() - 2);
            if (!namaC.isEmpty()) namaC = namaC.substring(0, namaC.length() - 2);

            double rata = total / n;

            // OUTPUT SESUAI GAMBAR
            System.out.println("\n=== DATA MAHASISWA ===");
            for (Mahasiswa m : mhs) {
                m.tampil();
            }

            System.out.println("Jumlah Mahasiswa : " + n);
            System.out.println("Jumlah Mahasiswa yg Lulus : " + lulus + " yaitu " + namaLulus);
            System.out.println("Jumlah Mahasiswa yg Tidak Lulus : " + tidakLulus + " yaitu " + namaTidakLulus);
            System.out.println("Jumlah Mahasiswa dengan Nilai A = " + countA + " yaitu " + namaA);
            System.out.println("Jumlah Mahasiswa dengan Nilai B = " + countB + " yaitu " + namaB);
            System.out.println("Jumlah Mahasiswa dengan Nilai C = " + countC + " yaitu " + namaC);
            System.out.printf("Rata-rata nilai mahasiswa adalah : %.2f\n", rata);
        }
    }
}