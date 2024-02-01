public class Pakaian implements LaundryABC
{
    private String namaPelanggan;
    private String noHP;
    private String namaPakaian;
    private String jenisBahan;
    private Double beratPakaian;
    private int jumlahPakaian;
    private Double totalBerat;
    private int totalBayar;

    public String getNamaPelanggan()
    {
        return this.namaPelanggan;
    }

    public String getNoHP()
    {
        return this.noHP;
    }

    public String getNamaPakaian()
    {
        return this.namaPakaian;
    }

    public String getJenisBahan()
    {
        return this.jenisBahan;
    }

    public Double getBeratPakaian()
    {
        return this.beratPakaian;
    }

    public int getJumlahPakaian()
    {
        return this.jumlahPakaian;
    }

    public Double getTotalBerat()
    {
        return this.totalBerat;
    }

    public int getTotalBayar()
    {
        return this.totalBayar;
    }


    // ----------------------------------

    public void setNamaPelanggan(String nama)
    {
        this.namaPelanggan = nama;
    }

    public void setNoHP(String noHP)
    {
        this.noHP = noHP;
    }

    public void setNamaPakaian(String nama)
    {
        this.namaPakaian = nama;
    }

    public void setJenisBahan(String bahan)
    {
        this.jenisBahan = bahan;
    }

    public void setBeratPakaian(Double beratDalamKG)
    {
        if (beratDalamKG > 0.0)
            this.beratPakaian = beratDalamKG;
        else
            throw new ArithmeticException("Berat barang harus positif");
    }

    public void setJumlahPakaian(int jumlah)
    {
        if (jumlah > 0)
            this.jumlahPakaian = jumlah;
        else
            throw new ArithmeticException("Jumlah barang harus positif");
    }

    public void setTotalBerat()
    {
        this.totalBerat = this.beratPakaian * (this.jumlahPakaian * 1.0);
    }

    public void setTotalBayar()
    {
        this.totalBayar = this.totalBerat.intValue() * 2000;
    }


}
