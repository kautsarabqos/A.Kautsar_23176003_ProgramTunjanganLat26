import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class WaktuSaatIni {

    public static void main(String[] args) {
        // Membuat objek Date dengan waktu tertentu
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
            Date tanggal = sdf.parse("2018-09-29T12:24:04");
            SimpleDateFormat formatter = new SimpleDateFormat("EEEE, dd MMM yyyy HH:mm:ss", new Locale("id", "ID"));

            // Menampilkan hasil
            String hariIni = formatter.format(tanggal);
            System.out.println("Hari ini adalah " + hariIni);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}