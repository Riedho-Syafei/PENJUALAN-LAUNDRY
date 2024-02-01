import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception
    {
        Penjualan penjualan = new Penjualan();
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Nama Pelanggan:");
        penjualan.setNamaPelanggan(keyboard.nextLine());

        System.out.println("Nomor HP:");
        penjualan.setNoHP(keyboard.nextLine());

        System.out.println("Pakaian:");
        penjualan.setNamaPakaian(keyboard.nextLine());

        System.out.println("Bahan Pakaian:");
        penjualan.setJenisBahan(keyboard.nextLine());

        System.out.println("Berat Pakaian:");
        penjualan.setBeratPakaian(keyboard.nextDouble());

        penjualan.setTotalBerat();

        System.out.println("Jumlah Pakaian:");
        penjualan.setJumlahPakaian(keyboard.nextInt());

        penjualan.setTotalBayar();
        

        System.out.println("\n\n");
        System.out.println("           LAUNDRY ABC           ");
        System.out.println("Tanggal: " + penjualan.getTanggal());
        System.out.println("Waktu:   " + penjualan.getWaktu());
        System.out.println("=================================");
        System.out.println("         DATA PELANGGAN          ");
        System.out.println("---------------------------------");
        System.out.print("Nama Pelanggan: " + penjualan.getNamaPelanggan() + '\n');
        System.out.print("No. HP        : " + penjualan.getNoHP() + '\n');
        System.out.println("+++++++++++++++++++++++++++++++++");
        System.out.println("      DATA PEMBELIAN BARANG      ");
        System.out.println("---------------------------------");
        System.out.print("Nama Pakaian: " + penjualan.getNamaPakaian() + '\n');
        System.out.print("Bahan Kain: " + penjualan.getJenisBahan() + '\n');
        System.out.print("Berat per helai: " + penjualan.getBeratPakaian() + '\n');
        System.out.print("Jumlah helai: " + penjualan.getJumlahPakaian() + '\n');
        System.out.println("Total Berat: " + penjualan.getTotalBerat());
        System.out.print("TOTAL BAYAR: " + penjualan.getTotalBayar() + '\n');
        System.out.println("+++++++++++++++++++++++++++++++++");



        keyboard.close();
    }
}
