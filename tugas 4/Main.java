public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank();

        bank.transferUang(100000, "1234567890");
        bank.transferUang(200000, "9876543210", "Mandiri");
        bank.transferUang(300000, "1122334455", "BRI", "Bayar listrik");
        bank.sukuBunga();

        System.out.println("------------");

        Bank bni = new BankBNI();
        bni.transferUang(150000, "5566778899", "Bank lain");
        bni.sukuBunga();

        System.out.println("------------");

        Bank bca = new BankBCA();
        bca.transferUang(250000, "6677889900", "Bank lain");
        bca.sukuBunga();
    }
}