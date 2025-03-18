package Perusahaan;

class Karyawan {
    private String nama;
    private double gajiPokok;
    private Perusahaan perusahaan;

    public Karyawan(String nama, double gajiPokok, Perusahaan perusahaan) {
        setNama(nama);
        setGajiPokok(gajiPokok);
        this.perusahaan = perusahaan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        if (nama.length() < 4) {
            this.nama = "Nama Invalid";
        } else this.nama = nama;
    }

    public double hitungGaji() {
        return gajiPokok;
    }
    
    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public void info() {
        System.out.println("----------------------------------------");
        System.out.println("INFROMASI KARYAWAN");
        System.out.println("----------------------------------------");
        System.out.printf("Nama\t\t: %s\n", nama);
        Util.formatRupiah(gajiPokok);
        System.out.printf("Perusahaan\t: %s\n", perusahaan.NAMA_PERUSAHAAN);
    }

    public void infoGaji() {
        System.out.println("----------------------------------------");
        System.out.println("INFORMASI GAJI");
        System.out.println("----------------------------------------");
        System.out.printf("Nama\t\t: %s\n", nama);
        System.out.printf("Total gaji\t: Rp %.2f\n", hitungGaji());
    }
}
