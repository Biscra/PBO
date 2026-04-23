public class BankBNI extends Bank {

    public void sukuBunga() {
        System.out.println("Suku Bunga BNI adalah 4%");
    }

    public void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        int biaya = biayaTransfer("BNI");
        System.out.println("BNI >>> Transfer Rp" + jumlah +
                " ke rekening " + rekeningTujuan +
                " | Biaya: Rp" + biaya);
    }

    public int biayaTransfer(String bankTujuan) {
        return 4000;
    }
}