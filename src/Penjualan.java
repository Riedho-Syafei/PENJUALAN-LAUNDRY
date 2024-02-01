import java.time.LocalDate;
import java.time.OffsetTime;
import java.time.format.DateTimeFormatter;

public class Penjualan extends Pakaian
{
    private LocalDate tanggal;
    private OffsetTime waktu;

    public String getTanggal()
    {
        tanggal = LocalDate.now();
        DateTimeFormatter obj = DateTimeFormatter.ofPattern("E, dd-MM-yyyy");
        String tanggalFormat = tanggal.format(obj);

        return tanggalFormat;
    }

    public String getWaktu()
    {
        waktu = OffsetTime.now();
        DateTimeFormatter obj = DateTimeFormatter.ofPattern("HH:mm:ss O");
        String waktuFormat = waktu.format(obj);
        
        return waktuFormat;
    }

    public Penjualan()
    {
        ;
    }
}