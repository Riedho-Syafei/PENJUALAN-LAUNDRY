public interface LaundryABC
{
    String getNamaPelanggan();
    String getNoHP();
    String getNamaPakaian();
    String getJenisBahan();
    Double getBeratPakaian();
    int getJumlahPakaian();
    Double getTotalBerat();
    int getTotalBayar();

    void setNamaPelanggan(String nama);
    void setNoHP(String noHP);
    void setNamaPakaian(String pakaian);
    void setJenisBahan(String bahanKain);
    void setBeratPakaian(Double beratDalamKG);
    void setJumlahPakaian(int jumlah);
    void setTotalBerat();
    void setTotalBayar();
}