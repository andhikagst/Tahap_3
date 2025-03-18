package Perusahaan;
import java.util.Locale;

public class Util {
    public static void formatRupiah(double amount) {
        System.out.printf(Locale.GERMANY, "Gaji pokok \t: Rp%,.2f\n", amount);
    } 
}
