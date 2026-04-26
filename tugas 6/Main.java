import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // 🔥 Tambahan: pilih jenis laptop
        System.out.println("Pilih Laptop:");
        System.out.println("1. Toshiba");
        System.out.println("2. MacBook");
        System.out.print("Masukkan pilihan: ");
        int pilihan = input.nextInt();
        input.nextLine(); // buang newline

        Laptop laptop;

        if (pilihan == 1) {
            laptop = new Toshiba();
        } else {
            laptop = new MacBook();
        }

        LaptopUser andri = new LaptopUser(laptop);

        String action;

        System.out.println("\n=== SISTEM OPERASI LAPTOP ===");
        System.out.println("Ketik perintah: ON, OFF, UP, DOWN, atau EXIT");

        while (true) {
            System.out.print("> ");
            action = input.nextLine().toUpperCase();

            if (action.equals("ON")) {
                andri.turnOnLaptop();
            } else if (action.equals("OFF")) {
                andri.turnOffLaptop();
            } else if (action.equals("UP")) {
                andri.makeLaptopLouder();
            } else if (action.equals("DOWN")) {
                andri.makeLaptopSilence();
            } else if (action.equals("EXIT")) {
                System.out.println("Keluar program...");
                break;
            } else {
                System.out.println("Perintah salah!");
            }
        }

        input.close();
    }
}