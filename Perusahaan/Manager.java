package Perusahaan;

public class Manager extends Karyawan {
    private double insentif;
    private String divisi;

    public Manager(String nama, double gajiPokok, Perusahaan perusahaan, double insentif, String divisi) {
        super(nama, gajiPokok, perusahaan);
        setInsentif(insentif);
        setDivisi(divisi);
    }

    public double getInsentif() {
        return insentif;
    }

    public void setInsentif(double insentif) {
        this.insentif = insentif;
    }

    public String getDivisi() {
        return divisi;
    }

    public void setDivisi(String divisi) {
        this.divisi = divisi;
    }

    @Override
    public double hitungGaji() {
        return super.hitungGaji() + insentif;
    }
}