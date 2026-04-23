public class BankBCA extends Bank {

    public void sukuBunga() {
        System.out.println("Suku Bunga BCA adalah 4.5%");
    }

    public void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        int biaya = biayaTransfer("BCA");
        System.out.println("BCA >>> Transfer Rp" + jumlah +
                " ke rekening " + rekeningTujuan +
                " | Biaya: Rp" + biaya);
    }

    public int biayaTransfer(String bankTujuan) {
        return 5000;
    }
}